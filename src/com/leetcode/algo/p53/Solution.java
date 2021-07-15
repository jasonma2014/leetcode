package com.leetcode.algo.p53;

public class Solution {
    public int maxSubarray(int[] nums) {
        // greedy
        int pre = 0, maxAns = Integer.MIN_VALUE;
        for (int x: nums) {
            if (pre < 0) {
                pre = 0;
            }

            pre = pre + x;
            maxAns = Math.max(pre, maxAns);
        }
        return maxAns;
    }
}
