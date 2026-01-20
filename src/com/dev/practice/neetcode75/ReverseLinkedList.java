package com.dev.practice.neetcode75;

import java.util.LinkedList;

 class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode linkedList=new ListNode(45);


        System.out.println(linkedList);
        //reverseLinkedList(linkedList);
    }
    private static ListNode reverseLinkedList(ListNode head) {
       ListNode prev=null;
       ListNode curr=head;
       while (curr!=null) {
           ListNode temp=curr.next;
           curr.next=prev;
           prev=curr;
           curr=temp;
       }
       return prev;


    }
}
