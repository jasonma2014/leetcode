package com.leetcode.algo.p1448;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) {this.val = val;}
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class Solution {
    int sum = 0;
    public int goodNodes(TreeNode root) {
        int max = root.val;
        traverse(root,max);
        return sum;
    }
    public void traverse(TreeNode root,int max){
        if(root == null){
            return;
        }
        if(root.val >= max){
            sum++;
            max = root.val;
        }
        traverse(root.left,max);
        traverse(root.right,max);
    }
}
