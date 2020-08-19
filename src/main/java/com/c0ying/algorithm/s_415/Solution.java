package com.c0ying.algorithm.s_415;

public class Solution {
    public static String addStrings(String num1, String num2) {
        boolean inHigh = false;
        int l1 = num1.length()-1;
        int l2 = num2.length()-1;
        StringBuilder str = new StringBuilder();
        while (l1 >=0 && l2 >=0){
            int a = Integer.parseInt(String.valueOf(num1.charAt(l1)));
            int b = Integer.parseInt(String.valueOf(num2.charAt(l2)));
            int c = inHigh? a+b+1:a+b;
            if (c >=10){
                str.insert(0,c%10);
                inHigh=true;
            }else {
                str.insert(0,c);
                inHigh=false;
            }
            l1--;
            l2--;
        }
        while (l1 >=0){
            if (inHigh){
                int c = Integer.parseInt(String.valueOf(num1.charAt(l1)))+1;
                if (c<10){
                    inHigh=false;
                    str.insert(0, c);
                }else {
                    str.insert(0, c%10);
                }
            }else{
                str.insert(0,num1.charAt(l1));
            }
            l1--;
        }
        while (l2 >=0){
            if (inHigh){
                int c = Integer.parseInt(String.valueOf(num2.charAt(l2)))+1;
                if (c<10){
                    inHigh=false;
                    str.insert(0, c);
                }else {
                    str.insert(0, c%10);
                }
            }else{
                str.insert(0,num2.charAt(l2));
            }
            l2--;
        }
        if (inHigh){
            str.insert(0,1);
            inHigh=false;
        }
        return str.toString();
    }

    public static void main(String[] args) {
        System.out.println(addStrings("6994", "36"));
    }
}
