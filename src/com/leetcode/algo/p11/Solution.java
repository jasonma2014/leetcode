package com.leetcode.algo.p11;

public class Solution {
    //double pointer
    // 1. put l, r to the leftmost/rightmost
    public int maxArea(int[] height) {
        int maxArea = 0, l = 0, r = height.length - 1;
        while(l < r) {
            maxArea = Math.max(maxArea, Math.min(height[l], height[r])*(r -l));
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return maxArea;
    }
}
