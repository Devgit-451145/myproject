package m.dev.datastructure;

import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {
        //LIFO data structure
        //stores objects into a sort of vertical tower
        //push to add to the top
        //pop to remove from the top

        //use cases
        //unde/redo features in text editor
        //moving back/forward through browser history
        //backtracking algorithms
        Stack<String> stack=new Stack<>();
        System.out.println();
        stack.push("dev0"); //4
        stack.push("dev1"); //3
        stack.push("dev2");//2
        stack.push("dev3");//1
        //stack.pop==remove first inserted item
        //stack.peek(); ==check first inserted item

        System.out.println(stack.search("dev1"));//3
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
