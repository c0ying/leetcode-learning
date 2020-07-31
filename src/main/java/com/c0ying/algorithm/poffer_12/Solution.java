package com.c0ying.algorithm.poffer_12;

public class Solution {

    public boolean exist(char[][] board, String word) {
        if (board == null || board[0] == null || board.length == 0 || board[0].length == 0 || word == null || word.equals("")) {
            return false;
        }
        boolean[][] visited = new boolean[board.length][board[0].length];
        char[] chs = word.toCharArray();
        for (int i =0; i< board.length; i++){
            for (int j =0; j< board[i].length; j++){
                if (board[i][j] == chs[0]) {
                    if(dfs(board, visited, i, j, chs, 0)) return true;
                }
            }
        }
        return false;
    }

    public boolean dfs(char[][] board, boolean[][] visited, int row, int col, char[] chs, int index){
        if (index == chs.length) {
            return true;
        }
        if (row < 0 || col < 0 || row == board.length || col == board[0].length || visited[row][col] || board[row][col] != chs[index]) {
            return false;
        }
        visited[row][col] = true;
        boolean res = dfs(board, visited,row+1, col, chs, index+1)
                || dfs(board, visited, row-1, col, chs, index+1)
                || dfs(board, visited, row, col-1, chs, index+1)
                || dfs(board, visited, row, col+1, chs, index+1);
        visited[row][col] = false;
        return res;
    }
}
