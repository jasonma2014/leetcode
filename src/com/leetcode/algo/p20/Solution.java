package com.leetcode.algo.p20;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        if ( n % 2 != 0) {
            return false;
        }

        Map<Character, Character> pairs = new HashMap() {{
          put(')', '(');
          put(']', '[');
          put('}', '{');
        }};
        Deque<Character> stack = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            Character ch = s.charAt(i);
            if (pairs.containsKey(ch)) {
                // this is the logic.
                if (stack.isEmpty() || stack.peek() != pairs.get(ch)) {
                    return false;
                }
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }
}
