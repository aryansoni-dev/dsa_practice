package dsa_practice.greedy_questions;

// Question Link : https://www.hackerrank.com/contests/dsa004/challenges

public class Equal {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 7};
        int min = Integer.MAX_VALUE;

        for (int v : arr) {
            min = Math.min(min, v);
        }

        int result = Integer.MAX_VALUE;

        for (int offset = 0; offset < 5; offset++) {
            int target = min - offset;
            int operations = 0;

            for (int v : arr) {
                int diff = v - target;
                operations += diff / 5;
                diff %= 5;
                operations += diff / 2;
                diff %= 2;
                operations += diff;
            }

            result = Math.min(result, operations);
        }

        System.out.println(result);
    }
}
