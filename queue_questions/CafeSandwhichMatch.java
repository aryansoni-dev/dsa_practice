package dsa_practice.queue_questions;

import java.util.ArrayDeque;
import java.util.Scanner;

public class CafeSandwhichMatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayDeque<Integer> studs = new ArrayDeque<>();
        ArrayDeque<Integer> sandwiches = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            studs.addLast(sc.nextInt());
        }
        for (int i = 0; i < N; i++) {
            sandwiches.addLast(sc.nextInt());
        }

        int rotations = 0;
        while (!studs.isEmpty() && rotations < studs.size()) {
            int student = studs.peekFirst();
            int sandwich = sandwiches.peekFirst();

            if (student == sandwich) {
                studs.removeFirst();
                sandwiches.removeFirst();
                rotations = 0;
            } else {
                studs.addLast(studs.removeFirst());
                rotations++;
            }
        }

        System.out.println(studs.size());
        sc.close();
    }
}
