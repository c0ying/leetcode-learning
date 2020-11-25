package com.c0ying.algorithm.s_925;

public class Solution {

    public static boolean isLongPressedName(String name, String typed) {
        int k =0;
        for (int i=0; i < typed.length(); ) {
            if (k < name.length() && name.charAt(k) == typed.charAt(i)){
                k++;
                i++;
            }else{
                if (i>0 && typed.charAt(i-1) == typed.charAt(i)){
                    i++;
                }else{
                    return false;
                }
            }
        }
        return k == name.length();
    }

    public static void main(String[] args) {
        System.out.println(isLongPressedName("alex", "aaleex"));
        System.out.println(isLongPressedName("saeed", "ssaaedd"));
        System.out.println(isLongPressedName("leelee", "lleeelee"));
        System.out.println(isLongPressedName("laiden", "laiden"));
        System.out.println(isLongPressedName("vtkgn", "vttkgnn"));
        System.out.println(isLongPressedName("algrlz", "allgrrll"));
    }
}
