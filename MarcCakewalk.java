package dsa_practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Question Link: https://www.hackerrank.com/contests/testad-1/challenges/marcs-cakewalk

public class MarcCakewalk {
    public static void main(String[] args) {
        List<Integer> calories = new ArrayList<>(List.of(7, 4, 9, 6));
        long minMiles = 0, i = 0;
        while (!calories.isEmpty()) {
            int maxVal = Collections.max(calories);
            minMiles += Math.pow(2, i) * maxVal;
            calories.remove(Integer.valueOf(maxVal));
            i++;
        }
        System.out.println(minMiles);
    }
}
