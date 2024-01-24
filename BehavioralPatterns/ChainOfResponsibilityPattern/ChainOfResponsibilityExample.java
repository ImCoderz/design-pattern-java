package BehavioralPatterns.ChainOfResponsibilityPattern;

// Handler interface
interface Approver {
    void setNextApprover(Approver nextApprover);
    void processRequest(PurchaseRequest request);
}

// Concrete Handler 1
class Manager implements Approver {
    private Approver nextApprover;

    @Override
    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() <= 1000) {
            System.out.println("Manager approves purchase request #" + request.getRequestNumber());
        } else if (nextApprover != null) {
            nextApprover.processRequest(request);
        } else {
            System.out.println("No one can approve the purchase request #" + request.getRequestNumber());
        }
    }
}

// Concrete Handler 2
class Director implements Approver {
    private Approver nextApprover;

    @Override
    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() <= 5000) {
            System.out.println("Director approves purchase request #" + request.getRequestNumber());
        } else if (nextApprover != null) {
            nextApprover.processRequest(request);
        } else {
            System.out.println("No one can approve the purchase request #" + request.getRequestNumber());
        }
    }
}

// Concrete Handler 3
class VicePresident implements Approver {
    private Approver nextApprover;

    @Override
    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() <= 10000) {
            System.out.println("Vice President approves purchase request #" + request.getRequestNumber());
        } else if (nextApprover != null) {
            nextApprover.processRequest(request);
        } else {
            System.out.println("No one can approve the purchase request #" + request.getRequestNumber());
        }
    }
}
class PurchaseRequest {
    private int requestNumber;
    private double amount;

    public PurchaseRequest(int requestNumber, double amount) {
        this.requestNumber = requestNumber;
        this.amount = amount;
    }

    public int getRequestNumber() {
        return requestNumber;
    }

    public double getAmount() {
        return amount;
    }
}
public class ChainOfResponsibilityExample {
    public static void main(String[] args) {
        // Creating the chain of responsibility
        Approver manager = new Manager();
        Approver director = new Director();
        Approver vp = new VicePresident();

        manager.setNextApprover(director);
        director.setNextApprover(vp);

        // Simulating purchase requests
        PurchaseRequest request1 = new PurchaseRequest(1, 800);
        PurchaseRequest request2 = new PurchaseRequest(2, 3500);
        PurchaseRequest request3 = new PurchaseRequest(3, 12000);

        // Processing requests
        manager.processRequest(request1);
        System.out.println("--------------");
        manager.processRequest(request2);
        System.out.println("--------------");
        manager.processRequest(request3);
    }
}

