package com.leetcode.algo.p838;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String pushDominoes(String dominoes) {
        List<String> res = new ArrayList<>();
        while(true) {
            String newDominoes = dominoes.replace("R.L", "R*L").replace("R.", "RR")
                    .replace(".L", "LL");
            if (res.contains(dominoes)) break;
            res.add(dominoes);
        }
        return dominoes.replace('*', '.');
    }
 }
