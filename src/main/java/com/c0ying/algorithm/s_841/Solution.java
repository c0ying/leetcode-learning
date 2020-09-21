package com.c0ying.algorithm.s_841;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] isVisited = new boolean[rooms.size()];
        isVisited[0] = true;
        for (int i = 0; i < rooms.get(0).size(); i++) {
            dfs(isVisited, rooms.get(0).get(i), rooms);
        }
        boolean result = true;
        for (boolean flag: isVisited) {
            result &= flag;
        }
        return result;
    }

    public void dfs(boolean[] isVisited, int room, List<List<Integer>> rooms){
        if (isVisited[room]) return;
        isVisited[room] = true;
        List<Integer> keys = rooms.get(room);
        for (int i = 0; i < keys.size(); i++) {
            dfs(isVisited, keys.get(i), rooms);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        //true
//        List<List<Integer>> rooms = new ArrayList<>();
//        List<Integer> room0 = new ArrayList<>();
//        room0.add(1);
//        List<Integer> room1 = new ArrayList<>();
//        room1.add(2);
//        List<Integer> room2 = new ArrayList<>();
//        room2.add(3);
//        List<Integer> room3 = new ArrayList<>();
//        rooms.add(room0);
//        rooms.add(room1);
//        rooms.add(room2);
//        rooms.add(room3);
        //false
        List<List<Integer>> rooms = new ArrayList<>();
        List<Integer> room0 = new ArrayList<>();
        room0.add(1);
        room0.add(3);
        List<Integer> room1 = new ArrayList<>();
        room1.add(3);
        room1.add(0);
        room1.add(1);
        List<Integer> room2 = new ArrayList<>();
        room2.add(2);
        List<Integer> room3 = new ArrayList<>();
        room3.add(0);
        rooms.add(room0);
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);
        System.out.println(solution.canVisitAllRooms(rooms));
    }
}
