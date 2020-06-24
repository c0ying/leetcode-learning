package com.c0ying.algorithm.itview_09;

//#leetcode.面试题09
public class Solution {

    public boolean isPalindrome(int x) {
        if(x <0 || x== 10) return false;
        if(x >=0 && x<=9) return true;
        int reverNum = -1;
        int tmp = x;
        while(tmp > 0){

            reverNum = reverNum == -1? tmp%10: reverNum*10+tmp%10;
            tmp = tmp /10;
        }

        if(reverNum == x) return true;
        return false;
    }
}
