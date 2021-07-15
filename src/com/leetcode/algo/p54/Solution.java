package com.leetcode.algo.p54;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> order = new ArrayList<>();

        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return  order;

        int rows = matrix.length;
        int cols = matrix[0].length;
        int left = 0, right = cols - 1, top = 0, bottom = rows -1;

        while (left <= right && top <= bottom) {
            for(int col = left; col <= right; col++) {
                order.add(matrix[top][col]);
            }
            for (int row = top + 1; row <= bottom; row++) {
                order.add(matrix[row][right]);
            }

            if (left < right && top < bottom) {
                for (int col = right - 1; col > left; col--) {
                    order.add(matrix[bottom][col]);
                }
                for (int row = bottom; row > top; row--) {
                    order.add(matrix[row][left]);
                }
            }

            left++;
            right--;
            top++;
            bottom--;
        }
        return  order;


    }

}
