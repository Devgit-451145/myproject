package m;

import java.util.*;
import java.util.stream.Collectors;

class Transaction {
    String cardMemberId;
    String merchant;
    double amount;
    String date;
    String location;
    String category;
    public Transaction(String cardMemberId, String merchant, double amount, String date, String location, String category) {
        this.cardMemberId = cardMemberId;
        this.merchant = merchant;
        this.amount = amount;
        this.date = date;
        this.location = location;
        this.category = category;
    }
}
public class TransactionSummary {
    // Method to summarize transactions
    public static Map<String, Map<String, Double>> summarizeTransactions(List<Transaction> transactions, String date, String location, String category) {
        Map<String, Map<String, Double>> summary = new HashMap<>();
        for (Transaction txn : transactions) {
            //if (txn.date.equals(date) && txn.location.equalsIgnoreCase(location) && txn.category.equalsIgnoreCase(category)) {
                summary.putIfAbsent(txn.cardMemberId, new HashMap<>());
                Map<String, Double> merchantMap = summary.get(txn.cardMemberId);
                merchantMap.put(txn.merchant, merchantMap.getOrDefault(txn.merchant, 0.0) + txn.amount);
            //}
        }
        return summary;
    }
    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
                new Transaction("CM001", "Amazon", 120.0, "2025-06-11", "New York", "Shopping"),
                new Transaction("CM001", "Amazon", 30.0, "2025-06-11", "New York", "Shopping"),
                new Transaction("CM001", "Walmart", 45.0, "2025-06-11", "New York", "Shopping"),
                new Transaction("CM002", "Starbucks", 15.0, "2025-06-11", "New York", "Food"),
                new Transaction("CM002", "Starbucks", 10.0, "2025-06-11", "New York", "Food"),
                new Transaction("CM001", "Amazon", 100.0, "2025-06-10", "New York", "Shopping") // Different date
        );
        String filterDate = "2025-06-11";
        String filterLocation = "New York";
        String filterCategory = "Shopping";
        Map<String, Map<String, Double>> result = summarizeTransactions(transactions, filterDate, filterLocation, filterCategory);
        for (String cardMemberId : result.keySet()) {
            System.out.println("Card Member: " + cardMemberId);
            Map<String, Double> merchantSummary = result.get(cardMemberId);
            for (String merchant : merchantSummary.keySet()) {
                System.out.printf("  Merchant: %-10s  Total Spent: $%.2f%n", merchant, merchantSummary.get(merchant));
            }
        }
    }
}