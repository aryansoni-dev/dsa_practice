package dsa_practice.greedy_questions;

// Question Link : https://www.hackerrank.com/contests/dsa004/challenges

import java.util.Arrays;

public class GreedyFlorist {
    public static void main(String[] args) {
        int[] c = {1, 3, 5, 7, 9};
        int k = 3;
        
        Arrays.sort(c);
        int totalCost = 0, n = c.length;
        
        for (int i = 0; i < n; i++) {
            int price = c[n - 1 - i];
            int m = (i / k) + 1;
            totalCost += m * price;
        }
        
        System.out.println(totalCost);
    }
}
