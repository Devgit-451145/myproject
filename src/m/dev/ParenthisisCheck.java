package m.dev;

import java.util.Stack;

public class ParenthisisCheck {
    public static void main(String[] args) {
        System.out.println(checkParanthysis("(())"));
    }

    private static boolean checkParanthysis(String s) {
        //System.out.println(s.length()%2);
        if(s.length()%2!=0) return false;
        Stack<Character> stack=new Stack<>();
        for(char c:s.toCharArray()) {
            if(c=='(') {
                stack.push(c);
            } else if(c==')') {
                if(stack.isEmpty()) return false;
                stack.pop();
            }

        }
        return stack.isEmpty();
    }
}
