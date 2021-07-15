package com.leetcode.algo.p283;

public class Solution {
    public void moveZeros(int[] nums) {
        int n = nums.length;
        if (n == 0) return;
        int left = 0, right = 0;
        while (right < n) {
            if (nums[right] != 0 ) {
                swap(nums, left, right);
                left++;
            }
            right++;
        }
    }

    private void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
