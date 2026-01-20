package m.dev.linkedlist;

import java.util.HashSet;

public class RemoveDuplicatesLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Adding nodes to the linked list
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(2);
        System.out.println("Original Linked List:");
        list.printList();
        // Remove duplicates
        list.removeDuplicates();
        System.out.println("Linked List after removing duplicates:");
        list.printList();
    }
}
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class LinkedList {
    Node head;

    // Method to remove duplicates from the linked list
    public void removeDuplicates() {
        HashSet<Integer> seen = new HashSet<>();
        Node current = head;
        Node previous = null;

        while (current != null) {
            if (seen.contains(current.data)) {
                // Duplicate found, remove it
                previous.next = current.next;
            } else {
                // Not a duplicate, add it to the set
                seen.add(current.data);
                previous = current; // Move the previous pointer
            }
            current = current.next; // Move to the next node
        }
    }
    // Method to add a new node to the linked list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }
    // Method to print the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}