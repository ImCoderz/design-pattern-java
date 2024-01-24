package BehavioralPatterns.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

// Subject (Observable)
interface Auction {
    void addObserver(Bidder observer);
    void removeObserver(Bidder observer);
    void notifyObservers();
    void placeBid(double amount);
}

// Concrete Subject
class AuctionImpl implements Auction {
    private List<Bidder> bidders;
    private double currentBid;

    public AuctionImpl() {
        this.bidders = new ArrayList<>();
        this.currentBid = 0.0;
    }

    @Override
    public void addObserver(Bidder observer) {
        bidders.add(observer);
    }

    @Override
    public void removeObserver(Bidder observer) {
        bidders.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Bidder bidder : bidders) {
            bidder.update(currentBid);
        }
    }

    @Override
    public void placeBid(double amount) {
        if (amount > currentBid) {
            currentBid = amount;
            notifyObservers();
        } else {
            System.out.println("Bid amount must be higher than the current bid of " + currentBid);
        }
    }
}

// Observer
interface Bidder {
    void update(double currentBid);
}

// Concrete Observer
class AuctionBidder implements Bidder {
    private String name;

    public AuctionBidder(String name) {
        this.name = name;
    }

    @Override
    public void update(double currentBid) {
        System.out.println(name + " got update: Current bid is now " + currentBid);
    }
}

public class ObserverExample {
    public static void main(String[] args) {
        // Create an auction
        Auction auction = new AuctionImpl();

        // Create bidders and add them to the auction
        Bidder bidder1 = new AuctionBidder("Bidder 1");
        Bidder bidder2 = new AuctionBidder("Bidder 2");

        auction.addObserver(bidder1);
        auction.addObserver(bidder2);

        // Place bids
        auction.placeBid(100.0);  // Bidder 1 and Bidder 2 get updates
        auction.placeBid(150.0);  // Bidder 1 and Bidder 2 get updates
        auction.placeBid(120.0);  // Bidder 1 and Bidder 2 get updates

        // Remove a bidder
        auction.removeObserver(bidder2);

        // Place another bid
        auction.placeBid(200.0);  // Only Bidder 1 gets an update
    }
}
