package com.leetcode.algo.p509;

public class Solution {
    public int fib(int n) {
        if (n == 1 || n == 2) {
            return n;
        }

        int prev = 1, curr = 2;
        for (int i = 3; i <= n; i++) {
            int sum = prev + curr;
            prev = curr;
            curr = sum;
        }
        return curr;
    }
}
