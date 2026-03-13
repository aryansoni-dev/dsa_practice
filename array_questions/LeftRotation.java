package dsa_practice.array_questions;

import java.util.ArrayList;
import java.util.List;

// Question Link : https://www.hackerrank.com/contests/dsa004/challenges

public class LeftRotation {
    public static void main(String[] args) {
        List<Integer> arr = List.of(1, 2, 3, 4, 5);
        int d = 2;
        int n = arr.size();
        d = d % n;

        List<Integer> result = new ArrayList<>(n);

        // add elements from d → end
        for (int i = d; i < n; i++) {
            result.add(arr.get(i));
        }
        // add first d elements
        for (int i = 0; i < d; i++) {
            result.add(arr.get(i));
        }

        System.out.println(result);
    }
}
