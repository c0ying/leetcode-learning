package com.c0ying.algorithm.s_14;

public class Solution {

    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 1) return strs[0];
        String commonPrefix = "";
        for(int i =0; i < strs[0].length(); i++){
            if(i < strs[1].length() && strs[0].charAt(i) == strs[1].charAt(i)){
                commonPrefix += strs[0].charAt(i);
            }else{
                break;
            }
        }
        if(commonPrefix.length() > 0){
            for(int i =2; i< strs.length; i++){
                if(!strs[i].startsWith(commonPrefix)){
                    String tmpPrefix = "";
                    for(int j =0; j < commonPrefix.length(); j++){
                        if(j < strs[i].length() && strs[i].charAt(j) == commonPrefix.charAt(j)){
                            tmpPrefix += strs[i].charAt(j);
                        }else{
                            break;
                        }
                    }
                    commonPrefix = tmpPrefix;
                }
            }
        }
        return commonPrefix;
    }

    public static void main(String[] args) {
//        String[] array = {"flower","flow","flight"};
//        String[] array = {"dog","racecar","car"};
//        String[] array = {"abab","aba",""};
        String[] array = {"aca","cba"};
        System.out.println("longestCommonPrefix(array) = " + longestCommonPrefix(array));
    }
}
