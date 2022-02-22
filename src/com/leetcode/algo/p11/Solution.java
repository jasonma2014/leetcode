package com.leetcode.algo.p11;

public class Solution {
    //double pointer
    // 1. put l, r to the leftmost/rightmost
    public int maxArea(int[] height) {
        int l = 0, r  = height.length -1;
        int ans =  0;
        while(l < r) {
            int area = Math.min(height[l], height[r]) * (r -1);
            ans = Math.max(ans, area);
            if (height[l] <= height[r]) {
                ++l;
            } else {
                --r;
            }
        }
        return ans;
    }
}
