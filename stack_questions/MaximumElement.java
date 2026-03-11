package dsa_practice.stack_questions;

import java.util.List;
import java.util.Stack;
import java.util.ArrayList;

public class MaximumElement {
    public List<Integer> getMax(List<String> operations) {
        List<Integer> max = new ArrayList<Integer>();
        Stack<Integer> stack = new Stack<Integer>();

        for (String op : operations) {
            String[] parts = op.split(" ");
            int type = Integer.parseInt(parts[0]);
            if (type == 1) {
                int value = Integer.parseInt(parts[1]);
                stack.push(value);
            } else if (type == 2) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (type == 3) {
                if (!stack.isEmpty()) {
                    max.add(stack.stream().max(Integer::compare).orElse(Integer.MIN_VALUE));
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        List<String> operations = new ArrayList<String>();
        List<Integer> max = new ArrayList<Integer>();

        operations.add("1 97");
        operations.add("2");
        operations.add("1 20");
        operations.add("2");
        operations.add("1 26");
        operations.add("1 20");
        operations.add("2");
        operations.add("3");
        
        MaximumElement me = new MaximumElement();
        max = me.getMax(operations);
        System.out.println(max);
    }
}
