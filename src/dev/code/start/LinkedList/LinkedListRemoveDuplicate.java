package dev.code.start.LinkedList;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class LinkedListRemoveDuplicate {
    public static void main(String[] args) {
        // Creating a sorted linked list: 1 -> 1 -> 2 -> 3 -> 3
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);
        System.out.println("Original list:");
        printList(head);
        head = deleteDuplicates(head);
        System.out.println("List after removing duplicates:");
        printList(head);
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                // Skip the duplicate
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }

    // Utility function to print linked list
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
