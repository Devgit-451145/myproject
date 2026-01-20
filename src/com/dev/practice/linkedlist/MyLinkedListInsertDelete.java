package com.dev.practice.linkedlist;
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data=data;
        this.next=null;
    }
}

public class MyLinkedListInsertDelete {
    Node head;
    private static MyLinkedListInsertDelete deleteByKey(MyLinkedListInsertDelete list, int key) {
        Node currentNode=list.head,previousNode=null;
        if(currentNode!=null && currentNode.data==key) {
            list.head=currentNode.next;
            System.out.println(key+ "found and deleted");
            return list;
        }
        while(currentNode!=null && currentNode.data!=key) {
            previousNode=currentNode;
            currentNode=currentNode.next;
        }
        if(currentNode!=null) {
            previousNode.next=currentNode.next;
            System.out.println(key + "key found and deleted");
        }
        if(currentNode==null) {
            System.out.println(key+" not found");
        }
        return list;

    }

    private static void printLinkedList(MyLinkedListInsertDelete list) {
        Node currentNode=list.head;
        System.out.println("Linked list elements: ");
        while (currentNode!=null) {
            System.out.println(currentNode.data+ " ");
            currentNode=currentNode.next;
        }
    }

    private static MyLinkedListInsertDelete insert(MyLinkedListInsertDelete list, int key) {
        Node newNode=new Node(key);
        newNode.next=null;
        if(list.head==null) {
            list.head=newNode;
        } else {
            Node lastNode=list.head;
            while(lastNode.next!=null) {
                lastNode=lastNode.next;
            }
            lastNode.next=newNode;
        }
        return list;
    }
    public static void main(String[] args) {
        MyLinkedListInsertDelete linkedList=new MyLinkedListInsertDelete();
        linkedList=insert(linkedList,10);
        linkedList=insert(linkedList,20);
        linkedList=insert(linkedList,30);
        printLinkedList(linkedList);
        deleteByKey(linkedList,20);
        printLinkedList(linkedList);
    }
}
