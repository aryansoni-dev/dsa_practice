package dsa_practice.stack_questions;

import java.util.Stack;
import java.util.List;

// Question Link : https://www.hackerrank.com/contests/dsa003/challenges

public class LargestRectangle {
    public static void main(String[] args) {
        List<Integer> h = List.of(1, 2, 3, 4, 5);
        Stack<Integer> stack = new Stack<Integer>();
        long maxArea = 0;
        int i = 0;
        int n = h.size();

        while (i < n) {
            if (stack.isEmpty() || h.get(stack.peek()) <= h.get(i)) {
                stack.push(i++);
            } else {
                int top = stack.pop();
                long height = h.get(top);
                int width;

                if (stack.isEmpty())
                    width = i;
                else
                    width = i - stack.peek() - 1;

                maxArea = Math.max(maxArea, height * width);
            }
        }

        while (!stack.isEmpty()) {
            int top = stack.pop();
            long height = h.get(top);
            int width;

            if (stack.isEmpty())
                width = i;
            else
                width = i - stack.peek() - 1;

            maxArea = Math.max(maxArea, height * width);
        }

        System.out.println(maxArea);
    }
}
