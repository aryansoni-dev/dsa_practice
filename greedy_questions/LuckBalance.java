package dsa_practice.greedy_questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Question Link: https://www.hackerrank.com/contests/testad-1/challenges/luck-balance

public class LuckBalance {
    public static int luckBalance(int k, List<List<Integer>> contests) {
        int luck = 0;
        List<Integer> imp = new ArrayList<>();
        
        for (List<Integer> c : contests) {
            int L = c.get(0);
            int T = c.get(1);
            if (T == 0) luck += L;
            else imp.add(L);
        }
        
        Collections.sort(imp, Collections.reverseOrder());
        
        for (int i = 0; i < imp.size(); i++) {
            if (i < k) luck += imp.get(i);
            else luck -= imp.get(i);
        }
        
        return luck;
    }
}
