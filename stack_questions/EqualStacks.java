package dsa_practice.stack_questions;

import java.util.List;

public class EqualStacks {
    public static void main(String[] args) {
        List<Integer> h1 = List.of(3, 2, 1, 1, 1);
        List<Integer> h2 = List.of(4, 3, 2);
        List<Integer> h3 = List.of(1, 1, 4, 1);

        int h_s1 = 0, h_s2 = 0, h_s3 = 0;
        for (int x : h1) h_s1 += x;
        for (int x : h2) h_s2 += x;
        for (int x : h3) h_s3 += x;
        
        int i = 0, j = 0, k = 0;
        while(h_s1 != h_s2 && h_s1 != h_s3) {

            if(h_s1 == h_s2 && h_s2 == h_s3)
                System.out.println("All stacks are equal with height : " + h_s1);

            if(h_s1 >= h_s2 && h_s1 >= h_s3) {
                h_s1 -= h1.get(i++);
            }
            else if(h_s2 >= h_s1 && h_s2 >= h_s3) {
                h_s2 -= h2.get(j++);
            }
            else {
                h_s3 -= h3.get(k++);
            }
        }
        System.out.println("All stacks are equal with height : " + h_s1);
    }
}
