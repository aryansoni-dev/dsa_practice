package dsa_practice;

import java.util.List;

// Question Link : https://www.hackerrank.com/contests/dsa003/challenges

public class Candies {
    public static void main(String[] args) {
        List<Integer> arr = List.of(1, 0, 2);
        int n = arr.size();
        long[] candies = new long[n];

        for (int i = 0; i < n; i++) {
            candies[i] = 1;
        }
        for (int i = 1; i < n; i++) {
            if (arr.get(i) > arr.get(i - 1)) {
                candies[i] = candies[i - 1] + 1;
            }
        }
        for (int i = n - 2; i >= 0; i--) {
            if (arr.get(i) > arr.get(i + 1)) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }

        long total = 0;
        for (long c : candies) {
            total += c;
        }

        System.out.println(total);
    }
}
