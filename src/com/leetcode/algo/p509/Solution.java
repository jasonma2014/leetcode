package com.leetcode.algo.p509;

public class Solution {
    public int fib(int n) {
        if ( n < 2) return n;

        int p, q = 0, r = 1;

        for (int i = 2; i <= n; i++) {
            p = q;
            q = r;
            r = p + q;
        }
        return r;
    }
}
