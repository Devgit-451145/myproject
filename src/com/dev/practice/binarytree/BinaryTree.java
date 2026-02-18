package com.dev.practice.binarytree;

public class BinaryTree {
    Node root;
    public static void main(String[] args) {
        //IN ORDER (LEFT->ROOT->RIGHT)
        Node root = null;
        traverseTreeIn(root);

        //POST ORDER (LEFT->RIGHT->ROOT)
        traverseTreePost(root);

        //PRE ORDER (ROOT->LEFT->RIGHT)
        traverseTreePre(root);
    }
    private static void traverseTreeIn(Node root) {
        traverseTreeIn(root.left);
        System.out.println(root.data);
        traverseTreeIn(root.right);
    }
    private static void traverseTreePost(Node root) {
        traverseTreeIn(root.left);
        traverseTreeIn(root.right);
        System.out.println(root.data);
    }
    private static void traverseTreePre(Node root) {
        System.out.println(root.data);
        traverseTreeIn(root.left);
        traverseTreeIn(root.right);
    }
}
class Node {
    int data;
    Node left;
    Node right;
    public Node() {
        this.data=data;
    }
}