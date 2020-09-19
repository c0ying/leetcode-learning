package com.c0ying.algorithm.s_17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {

    public static String[] data = new String[]{"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public List<String> letterCombinations(String digits) {
        if(digits == null || digits.length() ==0) return Collections.emptyList();
        List<String> result = new ArrayList<>();
        dfs(digits, 0, data, new StringBuilder(), result);
        return result;
    }

    public void dfs(String digits, int start, String[] data,StringBuilder tmp, List<String> result){
        if (start == digits.length()){
            result.add(tmp.toString());
            return;
        }
        char digit = digits.charAt(start);
        int index = digit - '0' - 2;
        String d = data[index];
        for (int i = 0; i < d.length(); i++) {
            tmp.append(d.charAt(i));
            dfs(digits, start+1, data, tmp, result);
            tmp.deleteCharAt(tmp.length()-1);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.letterCombinations("23"));
        System.out.println(solution.letterCombinations("2344"));
    }
}
