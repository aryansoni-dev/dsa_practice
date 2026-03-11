package dsa_practice.queue_questions;

import java.util.ArrayDeque;
import java.util.Scanner;

public class CustomerSupportPortal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        
        for (int i = 0; i < N; i++) {
            int operation = sc.nextInt();
            
            if (operation == 1) {
                int id = sc.nextInt();
                queue.addLast(id);
            } 
            
            else if (operation == 2) {
                if (!queue.isEmpty()) {
                    queue.removeFirst();
                }
            } 
            
            else if (operation == 3) {
                if (queue.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(queue.peekFirst());
                }
            }
        }
        
        sc.close();
    }
}
