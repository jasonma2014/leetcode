package com.leetcode.algo.p53;

public class Solution2 {
    // dp
    public int maxSubarray(int[] nums) {
        int pre = 0, maxAns = nums[0];
        for (int x: nums) {
            pre = Math.max(pre + x, x);
            maxAns = Math.max(maxAns, pre);
        }
        return maxAns;
    }
}
