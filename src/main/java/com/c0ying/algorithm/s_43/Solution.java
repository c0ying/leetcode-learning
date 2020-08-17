package com.c0ying.algorithm.s_43;

public class Solution {

    public static String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) return "0";
        if (num1.equals("1")){
            return num2;
        }else if(num2.equals("1")){
            return num1;
        }
        int l1 = num1.length()-1;
        int l2 = num2.length()-1;
        int[] result = new int[l1+l2+2];
        StringBuilder str = new StringBuilder();
        for (int i = l1; i>=0; i--){
            int n1 = num1.charAt(i) - '0';
            for (int j = l2; j>=0; j--){
                int n2 = num2.charAt(j) -'0';
                int res = result[i+j+1]+n1*n2;
                result[i+j] += res/10;
                result[i+j+1] = res%10;
            }
        }

        for (int i=0; i<result.length; i++){
            if (i == 0 && result[i] == 0) continue;
            str.append(result[i]);
        }
        return str.toString();
    }

    public static void main(String[] args) {
        System.out.println(multiply("2", "3"));
        System.out.println(multiply("123", "456"));
    }
}
