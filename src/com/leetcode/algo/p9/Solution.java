package com.leetcode.algo.p9;

public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x == 0) return true;

        String s = Integer.toString(x);
        int start = 0;
        int end = s.length() -1;
        while( start <= end) {
            if(s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
