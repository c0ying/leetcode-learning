package com.c0ying.algorithm.s_125;

public class Solution {

    public static boolean isPalindrome(String s) {
        if (s.length() <= 0) return true;
        String c = s.toLowerCase();
        int j = s.length()-1;
        for (int i=0; i< j; ){
            if(c.charAt(i) >= 'a' && c.charAt(i) <='z' || c.charAt(i) >='0' && c.charAt(i) <='9'){
                while(!(c.charAt(j) >= 'a' && c.charAt(j) <='z') && !(c.charAt(j) >='0' && c.charAt(j) <='9')){
                    j--;
                }
                if(j<i || c.charAt(i) != c.charAt(j)){
                    return false;
                }else{
                    i++;
                    j--;
                    continue;
                }
            }else{
                i++;
            }
        }
        return true;
    }

    public static void main(String[] args) {
//        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
//        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome("a."));
    }
}
