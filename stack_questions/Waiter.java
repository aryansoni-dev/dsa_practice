package dsa_practice.stack_questions;

import java.util.ArrayList;
import java.util.Stack;
import java.util.List;

public class Waiter {
    public static void main(String[] args) {
        List<Integer> nums = List.of(2, 3, 4, 5, 6, 7);
        int q = 3;
        List<Integer> ans = new ArrayList<Integer>();
        Stack<Integer> A = new Stack<Integer>();
        Stack<Integer> B = new Stack<Integer>();
        int[] primes = new int[q];
        
        int count = 0;
        int n = 2;
        while (count < q) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primes[count] = n;
                count++;
            }
            n++;
        }
        // System.out.println("Primes : " + primes);

        for (int num : nums) {
            A.push(num);
        }
        int i = 0;
        while (i < q) {
            Stack<Integer> temp = new Stack<Integer>();
            while (!A.isEmpty()) {
                int top = A.pop();
                if (top % primes[i] == 0) {
                    B.push(top);
                } else {
                    temp.push(top);
                }
            }
            A = temp;
            System.out.println("Stack A : " + A);
            System.out.println("Stack B : " + B);
            while (!B.isEmpty()) {
                ans.add(B.pop());
            }
            i++;
        }
        if (!A.isEmpty()) {
            while (!A.isEmpty()) {
                ans.add(A.pop());
            }
        }
        System.out.println("\nStack Ans : " + ans);
    }
}
