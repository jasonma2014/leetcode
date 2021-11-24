package com.leetcode.algo.p213;

public class Solution {
    public int rob(int[] nums) {
        int length = nums.length;
        if (length == 1) {
            return nums[0];
        } else if (length == 2) {
            return Math.max(nums[0], nums[1]);
        }

        return Math.max(robRange(nums, 0, length -2), robRange(nums, 1, length -1));

    }
    private int robRange(int[] nums, int start, int end) {
        int first = nums[start]
    }
}
