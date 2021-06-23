package com.leetcode.algo.p253;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int minMeetingRoom(int[][] intervals) {
        if (intervals.length == 0) return 0;
        if (intervals.length == 1) return 1;

        Integer[] start = new Integer[intervals.length];
        Integer[] end = new Integer[intervals.length];

        for (int i = 0; i < intervals.length; i++) {
            start[i] = intervals[i][0];
            end[i] = intervals[i][1];
        }

        // sort the intervals by end time
        Arrays.sort(start, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        Arrays.sort(end, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        int startPtr = 0, endPtr = 0;
        int usedRooms = 0;

        while(startPtr < intervals.length) {
            if(start[startPtr] >= end[endPtr]) {
                usedRooms -= 1;
                endPtr += 1;
            }
            usedRooms += 1;
            startPtr += 1;
        }
        return usedRooms;
    }
}
