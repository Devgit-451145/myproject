package m.oop.problem;

import java.util.Scanner;

public class BillSplitterApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Step 1: Get the total bill amount
        System.out.print("Enter the total bill amount: ");
        double totalBill = scanner.nextDouble();
        // Step 2: Get the number of friends
        System.out.print("Enter the number of friends: ");
        int numFriends = scanner.nextInt();
        // Step 3: Get each friend's contribution and calculate total paid
        double totalPaid = 0;
        double[] contributions = new double[numFriends];
        for (int i = 0; i < numFriends; i++) {
            System.out.print("Enter contribution of friend " + (i + 1) + ": ");
            contributions[i] = scanner.nextDouble();
            totalPaid += contributions[i];
            System.out.println("Total paid"+(i+1)+":"+totalPaid);
        }
        // Step 4: Calculate the equal share each friend should pay
        double equalShare = totalBill / numFriends;
        System.out.println("equalShare---"+equalShare);
        // Step 5: Show how much each friend owes or should receive
        System.out.println("\n--- Bill Breakdown ---");
        for (int i = 0; i < numFriends; i++) {
            double difference = contributions[i] - equalShare;
            if (difference > 0) {
                System.out.println("Friend " + (i + 1) + " should receive " + String.format("%.2f", difference) + " (overpaid).");
            } else if (difference < 0) {
                System.out.println("Friend " + (i + 1) + " owes " + String.format("%.2f", -difference) + " (underpaid).");
            } else {
                System.out.println("Friend " + (i + 1) + " has paid exactly their share.");
            }
        }
        scanner.close();
    }
}

