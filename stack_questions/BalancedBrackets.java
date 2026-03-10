package dsa_practice.stack_questions;

import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        String s = "{{[[(())]]}}";
        Stack<Character> stack = new Stack<Character>();
        boolean isBal = true;
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    isBal = false;
                    break;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                    isBal = false;
                    break;
                }
            }
        }
        if (!stack.isEmpty()) {
            isBal = false;
        }
        System.out.println(isBal ? "YES" : "NO");
    }
}
