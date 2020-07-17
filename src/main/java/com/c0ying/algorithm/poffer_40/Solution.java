package com.c0ying.algorithm.poffer_40;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution {

    public static int[] getLeastNumbers(int[] arr, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(k, (v1, v2) -> v1 >= v2?-1:1);
        for (int i = 0; i < arr.length; i++) {
            if (queue.size() < k){
                queue.add(arr[i]);
            }else{
                if (queue.peek() > arr[i]) {
                    queue.poll();
                    queue.offer(arr[i]);
                }
            }
        }
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = queue.poll();
        }
        return result;
    }

    public static void main(String[] args) {
        int[] leastNumbers = getLeastNumbers(new int[]{3, 2, 1}, 2);
        System.out.println(Arrays.toString(leastNumbers));
    }
}
