package dev.code.stack;

public class StackUsingArray {
    public static void main(String[] args) {
        Stack stack=new Stack();
        stack.push(4);
        stack.pop();
        stack.push(3);
        stack.push(9);
        stack.printStack();
        System.out.println(stack.peek());
    }
}
class Stack {
    private int [] arr=new int[3];
    int top;
    int size;
    public Stack() {
        size=arr.length;
        top=-1;
    }
    public void push(int data) {
    top++;
    if(top<size) {
            arr[top] = data;
        } else {
        System.out.println("stack over flow");
    }
    }
    public void printStack() {
        for(int n:arr) {
            System.out.print(n + " ");
        }
    }
    public int pop() {
        if(top>-1)
         return arr[top--];
        else {
            System.out.println("under flow");
        }
        return 0;
    }
    public int peek() {
       return arr[top];
    }

}