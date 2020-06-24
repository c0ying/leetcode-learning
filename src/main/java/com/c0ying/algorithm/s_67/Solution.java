package com.c0ying.algorithm.s_67;

import java.util.Stack;

public class Solution {

    public static String addBinary(String a, String b) {
        int i = a.length()-1, j = b.length()-1;
        Stack<Character> stack = new Stack<>();
        boolean inJump = false;
        while(i>-1 && j>-1){
            if(a.charAt(i) == '1' && b.charAt(j) == '1'){
                if(inJump == true){
                    stack.push('1');
                }else{
                    stack.push('0');
                }
                inJump = true;
            }else if(a.charAt(i) == '1' && b.charAt(j) == '0' || a.charAt(i) == '0' && b.charAt(j) == '1'){
                if (inJump == true){
                    stack.push('0');
                    inJump = true;
                }else{
                    stack.push('1');
                }
            }else if (a.charAt(i) == '0' && b.charAt(j) == '0'){
                if (inJump == true){
                    stack.push('1');
                    inJump = false;
                }else{
                    stack.push('0');
                }
            }
            i--;
            j--;
        }
        if(i > -1 || j > -1){
            String tmp = null;
            int z = -1;
            if(i > -1){
                tmp = a;
                z = i;
            }else{
                tmp = b;
                z = j;
            }

            for(; z > -1; z--){
                if (tmp.charAt(z) == '1') {
                    if (inJump){
                        stack.push('0');
                    }else{
                        stack.push('1');
                    }
                }else if (tmp.charAt(z) == '0'){
                    if (inJump){
                        stack.push('1');
                        inJump = false;
                    }else{
                        stack.push('0');
                    }
                }
            }
        }
        if (inJump){
            stack.push('1');
            inJump = false;
        }
        StringBuilder result = new StringBuilder();
        while(!stack.isEmpty()){
            result.append(stack.pop());
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(addBinary("11", "1"));
        System.out.println(addBinary("1010", "1011"));
    }
}
