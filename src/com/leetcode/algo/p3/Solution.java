package com.leetcode.algo.p3;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int lengthOfLongestSubstring(String s) {
        Set<Character> occ = new HashSet<>();
        int n = s.length();
        int rk = -1, ans = 0;
        for (int i = 0; i < n; i++) {
            if (i != 0) {
                occ.remove(s.charAt(i-1));
            }
            while(rk + 1 < n && !occ.contains(s.charAt(rk+1))) {
                // keep moving to right
                occ.add(s.charAt(rk + 1));
            }
            ans = Math.max(ans, rk + 1);
        }
        return ans;
    }
}
