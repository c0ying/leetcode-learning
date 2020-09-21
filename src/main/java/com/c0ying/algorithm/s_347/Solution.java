package com.c0ying.algorithm.s_347;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Solution {

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> counter = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (counter.containsKey(nums[i])) {
                Integer oldValue = counter.get(nums[i]);
                counter.put(nums[i], ++oldValue);
            }else{
                counter.put(nums[i], 1);
            }
        }
        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>(k, (x,y) -> x.getValue() - y.getValue());
        for (Map.Entry<Integer, Integer> entry: counter.entrySet()) {
            queue.offer(entry);
            if (queue.size() > k){
                queue.poll();
            }
        }
        int[] result = new int[k];
        int i = 0;
        while(!queue.isEmpty()){
            result[i++] = queue.poll().getKey();
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2)));
        System.out.println(Arrays.toString(topKFrequent(new int[]{1}, 1)));
    }
}
