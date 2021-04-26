package com.leetcode.algo.p1011;

import java.util.Arrays;

public class Solution {
    public int shipWithinDays(int[] weights, int D) {
        // calculate the left & right boundary.
        int left = Arrays.stream(weights).max().getAsInt(), right = Arrays.stream(weights).sum();
        while (left < right) {
            int mid = (left + right ) / 2;
            // need is the days of delivery
            // cur is the sum of package in one day
            int need = 1, cur = 0;
            for (int weight: weights) {
                if (cur + weight > mid) {
                    ++need;
                    cur = 0;
                }
                cur += weight;
            }
            if (need <= D) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
