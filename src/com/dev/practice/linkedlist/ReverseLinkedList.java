package com.dev.practice.linkedlist;

class ListNode1 {
    int val;
    ListNode1 next;
    ListNode1(int val) {
        this.val = val;
    }
}
public class ReverseLinkedList {
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode nextNode = current.next; // store next
            current.next = prev;              // reverse pointer
            prev = current;                   // move prev
            current = nextNode;               // move current
        }
        return prev; // new head
    }
    // Helper to print list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        System.out.println("Original:");
        printList(head);
        head = reverseList(head);
        System.out.println("Reversed:");
        printList(head);
    }
}

