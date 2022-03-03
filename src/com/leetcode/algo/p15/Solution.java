package com.leetcode.algo.p15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        int n = nums.length;
        Arrays.sort(nums);
        for (int first = 0; first < n; first++) {
            if( first > 0 && nums[first] == nums[first-1]) {
                continue;
            }
            // c 对应的指针在数组的最右端
            int third = n - 1;
            int target = -nums[first];
            for(int second = first + 1; second < n; second++) {
                // 和上次枚举不同
                if(second > first + 1 && nums[second] == nums[second-1]) {
                    continue;
                }
                // 保证b 在c的左侧
                while(second < third && nums[second] + nums[third] > target) {
                    third--;
                }
                // 如果重合了
                if (second == third) {
                    break;
                }

                if (nums[second] + nums[third] == target) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[first]);
                    list.add(nums[second]);
                    list.add(nums[third]);
                    res.add(list);
                }
            }
        }
        return res;
    }
}
