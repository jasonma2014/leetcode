package com.leetcode.algo.p252;

import java.util.Arrays;

public class Solution {
    public boolean canAttendMeetings(int[][] intervals) {
        if (intervals == null) return false;
        if (intervals.length == 1) return true;
        Arrays.sort(intervals, (int[] a, int[] b) -> { return  a[0] - b[0]; });
        for (int i = 1; i < intervals.length; i++) {
            if(intervals[i][0] < intervals[i - 1][1]) {
                return false;
            }
        }
        return true;
    }
}
