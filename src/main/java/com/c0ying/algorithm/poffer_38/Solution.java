package com.c0ying.algorithm.poffer_38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public String[] permutation(String s) {
        List<String> result = new ArrayList<>();
        dfs(0, s.toCharArray(), result);
        return result.toArray(new String[result.size()]);
    }

    public void dfs(int start, char[] s, List<String> result){
        if (start == s.length){
            result.add(new String(s));
            return;
        }
        for (int i = start; i < s.length; i++) {
            if (canSwap(s, start, i)){
                swap(s, start, i);
                dfs(start+1, s, result);
                swap(s, start, i);
            }
        }
    }

    private boolean canSwap(char[] s, int begin, int end){
        for (int i = begin; i < end; i++) {
            if (s[i] == s[end]){
                return false;
            }
        }
        return true;
    }

    private void swap(char[] s, int i, int j){
        char tmp = s[i];
        s[i] = s[j];
        s[j] = tmp;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.permutation("abc")));
    }
}
