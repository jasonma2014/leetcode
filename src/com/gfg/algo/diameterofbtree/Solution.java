package com.gfg.algo.diameterofbtree;

class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class Solution {
    int x = 0;
    int diameter(Node root) {
        height(root);
        return x;
    }

    int height(Node node) {
        if (node == null) return 0;
        int height = 1 + height(node.left) + height(node.right);
        x = Math.max(x, height);
        return  height;
    }
}
