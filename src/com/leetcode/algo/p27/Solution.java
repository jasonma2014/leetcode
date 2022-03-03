package com.leetcode.algo.p27;

public class Solution {
    public int removeElement(int[] nums, int val) {
        int res = nums.length;
        if ( nums.length == 0 )  return 0;
        int prt = 0;
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == val) {
                swap(nums[i], nums[i+1]);
            }
        }
    }

    private void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
 }
