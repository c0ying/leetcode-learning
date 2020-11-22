package com.c0ying.algorithm.s_1002;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static List<String> commonChars(String[] A) {
        List<String> result = new ArrayList<>();
        int[] res = new int[26];
        for (char c: A[0].toCharArray()) {
            res[c - 'a']++;
        }
        for (int i = 1; i < A.length; i++) {
            int[] tmp = new int[26];
            for (char c: A[i].toCharArray()) {
                tmp[c - 'a']++;
            }
            for (int j = 0; j < res.length; j++) {
                res[j] = Math.min(res[j], tmp[j]);
            }
        }
        for (int i = 0; i < res.length; i++) {
            if (res[i] > 0){
                for (int j = 0; j < res[i]; j++) {
                    result.add(String.valueOf((char)('a' + i)));
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] test = new String[]{"bella","label","roller"};
        String[] test2 = new String[]{"cool","lock","cook"};
        //[e, l, l]
        System.out.println(commonChars(test));
        //[c, o]
        System.out.println(commonChars(test2));
    }
}
