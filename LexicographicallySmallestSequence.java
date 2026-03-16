package dsa_practice;

import java.util.Deque;
import java.util.LinkedList;

// Question Link : https://www.hackerrank.com/contests/batch18class16mar/challenges/the-lexicographically-smallest-sequence/problem

public class LexicographicallySmallestSequence {
    public static void main(String[] args) {
        int n = 6, k = 3;
        int[] sequence = { 10, 20, 10, 30, 5, 40};

        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < n; i++) {

            while (!deque.isEmpty() && sequence[deque.peekLast()] > sequence[i] && deque.size() - 1 + (n - i) >= k) {
                deque.pollLast();
            }
            deque.offerLast(i);
        }
        for (int i = 0; i < n - k; i++) {
            System.out.print(sequence[deque.pollFirst()] + " ");
        }
    }
}
