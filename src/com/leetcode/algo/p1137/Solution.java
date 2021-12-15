package com.leetcode.algo.p1137;

public class Solution {
    public int tribonacchi(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int f = 0, s = 1, t = 1, r= 2;

        for (int i = 3; i <= n; i++) {
            f = s;
            s = t;
            t = r;
            r = f + s + t;
        }
        return r;
    }
}
