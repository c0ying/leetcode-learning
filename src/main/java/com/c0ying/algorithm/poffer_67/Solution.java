package com.c0ying.algorithm.poffer_67;

public class Solution {
    public static int strToInt(String str) {
        if(str.length() == 0) return 0;
        boolean negative = false;
        long result = 0;
        int start =0;
        while(true){
            if (str.charAt(start) == ' '){
                start++;
                if(start >= str.length()) return 0;
                continue;
            }else{
                break;
            }
        }
        if (str.charAt(start) == '+'){
            start++;
        }else if (str.charAt(start) == '-') {
            negative = true;
            start++;
        }
        for(int i=start; i<str.length(); i++){
            if(str.charAt(i)<'0'||str.charAt(i)>'9')break;
            if(str.charAt(i)>='0'&&str.charAt(i)<='9'){
                result = result*10+(str.charAt(i)-'0');
                if (result > Integer.MAX_VALUE) {
                    if (negative) {
                        return Integer.MIN_VALUE;
                    }else {
                        return Integer.MAX_VALUE;
                    }
                }
            }
        }
        if (negative) {
            result = -result;
        }
        return (int)result;
    }

    public static void main(String[] args) {
        System.out.println(strToInt("4193 with words"));
        System.out.println(strToInt("words and 987"));
        System.out.println(strToInt("-91283472332"));
        System.out.println(strToInt("+-2"));
    }
}
