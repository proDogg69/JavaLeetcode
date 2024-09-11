package easymode;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String set = ")(){}";
        Stack<Character> stack = new Stack<Character>();
        boolean state = true;
        for (int i = 0; i < set.length(); i++) {
            if (set.charAt(i) == '[' || set.charAt(i) == '{' || set.charAt(i) == '(') {
                stack.push(set.charAt(i));
            }
            if (set.charAt(i) == '}' || set.charAt(i) == ']' || set.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    state = false;
                    i = set.length() + 1;
                } else if (!(stack.lastElement() == '[' && set.charAt(i) == ']'
                        || stack.lastElement() == '{' && set.charAt(i) == '}'
                        || stack.lastElement() == '(' && set.charAt(i) == ')')) {
                    state = false;
                    System.out.println(stack.lastElement());
                } else {
                    stack.pop();
                }
            }
        }
        if (state == false) {
            System.out.println("False");
        } else if (stack.isEmpty()) {
            System.out.println("True");
        } else if (!(stack.isEmpty())) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }
    }
}
