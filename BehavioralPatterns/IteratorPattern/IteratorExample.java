package BehavioralPatterns.IteratorPattern;

import java.util.ArrayList;
import java.util.List;

// Aggregate (Collection)
interface BookCollection {
    Iterator<Book> createIterator();
}

// Concrete Aggregate
class Library implements BookCollection {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public Iterator<Book> createIterator() {
        return new LibraryIterator(books);
    }
}

// Iterator
interface Iterator<T> {
    boolean hasNext();
    T next();
}

// Concrete Iterator
class LibraryIterator implements Iterator<Book> {
    private List<Book> books;
    private int currentIndex;

    public LibraryIterator(List<Book> books) {
        this.books = books;
        this.currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < books.size();
    }

    @Override
    public Book next() {
        if (hasNext()) {
            Book book = books.get(currentIndex);
            currentIndex++;
            return book;
        }
        return null;
    }
}

// Concrete Element
class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}

public class IteratorExample {
    public static void main(String[] args) {
        // Create a library
        Library library = new Library();
        library.addBook(new Book("The Great Gatsby"));
        library.addBook(new Book("To Kill a Mockingbird"));
        library.addBook(new Book("1984"));
        library.addBook(new Book("Pride and Prejudice"));

        // Create an iterator for the library
        Iterator<Book> iterator = library.createIterator();

        // Iterate through the books in the library
        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println("Book Title: " + book.getTitle());
        }
    }
}
