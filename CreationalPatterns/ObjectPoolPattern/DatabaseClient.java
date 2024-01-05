package ObjectPoolPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

// Connection interface
interface DatabaseConnection {
    void executeQuery(String query);
    void close();
}

// Concrete implementation of DatabaseConnection interface
class SqlConnection implements DatabaseConnection {
    private String connectionUrl;

    public SqlConnection(String connectionUrl) {
        this.connectionUrl = connectionUrl;
        // Simulate connection establishment
        System.out.println("Connected to " + connectionUrl);
    }

    @Override
    public void executeQuery(String query) {
        System.out.println("Executing query: " + query);
        // Perform query execution logic
    }

    @Override
    public void close() {
        // Simulate closing the connection
        System.out.println("Closed connection to " + connectionUrl);
    }
}

// Object pool for managing database connections
class ConnectionPool {
    private List<DatabaseConnection> availableConnections;
    private List<DatabaseConnection> inUseConnections;
    private ExecutorService executorService;

    public ConnectionPool() {
        availableConnections = new ArrayList<>();
        inUseConnections = new ArrayList<>();
        initializePool(); // Initialize the pool with a set of connections
        executorService = Executors.newFixedThreadPool(5); // Use a fixed-size thread pool
    }

    private void initializePool() {
        for (int i = 0; i < 5; i++) {
            availableConnections.add(new SqlConnection("Database-" + (i + 1)));
        }
    }

    public Future<DatabaseConnection> getConnectionAsync() {
        return executorService.submit(() -> {
            if (availableConnections.isEmpty()) {
                System.out.println("No available connections. Waiting for a release.");
                // Wait for a connection to be released
                // Implement a mechanism to handle waiting, e.g., using Semaphore or blocking queue
            }

            // Get a connection from the available pool
            DatabaseConnection connection = availableConnections.remove(0);
            inUseConnections.add(connection);
            return connection;
        });
    }

    public void releaseConnection(DatabaseConnection connection) {
        // Release the connection back to the pool
        inUseConnections.remove(connection);
        availableConnections.add(connection);
        System.out.println("Connection released.");
    }

    public void shutdown() {
        executorService.shutdown();
    }
}

public class DatabaseClient {
    public static void main(String[] args) {
        ConnectionPool connectionPool = new ConnectionPool();

        try {
            // Submit multiple tasks concurrently to execute queries
            List<Future<?>> futures = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                Future<DatabaseConnection> future = connectionPool.getConnectionAsync();
                futures.add(future);
            }

            // Wait for all tasks to complete
            for (Future<?> future : futures) {
                future.get(); // Blocking call
            }

        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            connectionPool.shutdown();
        }
    }
}
