package com.leetcode.algo.p42;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Solution {
    public int trap(int[] height) {
        int max = 0;
        int n = height.length;

        if (n == 0) {
            return 0;
        }
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            if (height[i] >= max && max != 0) {

            }
        }


    }
}
