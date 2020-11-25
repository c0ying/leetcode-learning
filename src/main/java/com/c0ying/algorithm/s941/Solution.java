package com.c0ying.algorithm.s941;

public class Solution {

    public static boolean validMountainArray(int[] A) {
        boolean isDown = false;
        if (A.length < 3) return false;
        for(int i =0; i<A.length-1; i++){
            if(!isDown){
                if(A[i+1] > A[i]){
                    continue;
                }else{
                    if(i>0 && A[i+1] < A[i]){
                        isDown = true;
                        continue;
                    }
                    return false;
                }
            }else{
                if(A[i+1] < A[i]){
                    continue;
                }else{
                    return false;
                }
            }
        }
        return isDown?true:false;
    }

    public static void main(String[] args) {
        System.out.println(validMountainArray(new int[]{3,5,5}));
        System.out.println(validMountainArray(new int[]{0,3,2,1}));
        System.out.println(validMountainArray(new int[]{3,2,3,4}));
        System.out.println(validMountainArray(new int[]{0,1,2,3,4,5,6,7,8,9}));
    }
}
