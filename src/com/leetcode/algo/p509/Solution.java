package com.leetcode.algo.p509;

public class Solution {
    public int fib(int n) {
        if (n == 2 || n == 1)
            return 1;
        int prev = 1, curr = 1;

        for (int i = 3; i <= n; i++) {
            int sum = curr + prev;
            prev = curr;
            curr = curr + prev;
        }
        return curr;
    }
}
