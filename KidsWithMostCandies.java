package dsa_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Question Link: https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/?envType=study-plan-v2&envId=leetcode-75

public class KidsWithMostCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxVal = Arrays.stream(candies).max().getAsInt();
        List<Boolean> ans = new ArrayList<>(candies.length);
        for (int c : candies) {
            if ((c + extraCandies) >= maxVal) {
                ans.add(true);
            } else {
                ans.add(false);
            }
        }
        return ans;
    }
}
