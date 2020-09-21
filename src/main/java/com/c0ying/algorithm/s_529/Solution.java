package com.c0ying.algorithm.s_529;

import java.util.Arrays;

public class Solution {

    public static char[][] updateBoard(char[][] board, int[] click) {
        int row = click[0];
        int col = click[1];
        if (board[row][col] == 'M'){
            board[row][col] ='X';
            return board;
        }else if (board[row][col] == 'B' || board[row][col] == 'X' || (board[row][col] >= '1' && board[row][col] == '8')){
            return board;
        }else {
            dfs(board, row, col);
            return board;
        }
    }

    public static void dfs(char[][] board, int row, int col){
        if (row >= board.length || row < 0 || col >= board[0].length || col < 0) return;
        if (board[row][col] == 'B' || (board[row][col] >= '1' && board[row][col] == '8')) return;
        int bomdNum = 0;
        for (int i = row-1; i<= row+1; i++){
            if (i >= board.length || i < 0) continue;
            for (int j = col-1; j<=col+1; j++){
                if (j >= board[0].length || j < 0) continue;
                if (i == row && j == col) continue;
                if (board[i][j] == 'M') bomdNum++;
            }
        }
        if (bomdNum > 0){
            board[row][col] = String.valueOf(bomdNum).charAt(0);
            return;
        }else{
            board[row][col] = 'B';
            dfs(board, row-1, col);
            dfs(board, row, col-1);
            dfs(board, row, col+1);
            dfs(board, row+1, col);
        }
    }

    public static void main(String[] args) {
        char[][] table = {{'E', 'E', 'E', 'E', 'E'},{'E', 'E', 'M', 'E', 'E'},{'E', 'E', 'E', 'E', 'E'},{'E', 'E', 'E', 'E', 'E'}};
        updateBoard(table, new int[]{3,0});
        for (char[] chars : table) {
            System.out.println(Arrays.toString(chars));
        }
        System.out.println("========");
        updateBoard(table, new int[]{1,2});
        for (char[] chars : table) {
            System.out.println(Arrays.toString(chars));
        }
    }
}
