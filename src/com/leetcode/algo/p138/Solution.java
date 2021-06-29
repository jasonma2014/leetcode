package com.leetcode.algo.p138;

import java.util.HashMap;

class Node {
    int val;
    Node next;
    Node random;

    public Node (int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }

    public Node(int val, Node next, Node random) {
        this.val = val;
        this.next = next;
        this.random = random;
    }
}
public class Solution {
    private HashMap<Node, Node> visited = new HashMap<>();

    public Node copyRandomList(Node head) {

        if (head == null) {return  null; }
        if (visited.containsKey(head)) return visited.get(head);
        Node root = new Node(head.val, null, null);
        root.next = copyRandomList(head.next);
        root.random = copyRandomList(head.random);
        return root;
    }
}
