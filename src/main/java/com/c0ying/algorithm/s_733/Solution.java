package com.c0ying.algorithm.s_733;

import java.util.Arrays;

public class Solution {

    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int color = image[sr][sc];
        if (color == newColor) return image;
        dfs(image, sr, sc, color, newColor);
        return image;
    }

    public static void dfs(int[][] image, int sr, int sc, int originColor, int newColor){
        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length) return;
        if (image[sr][sc] == originColor){
            image[sr][sc] = newColor;
        }else{
            return;
        }
        dfs(image, sr-1, sc, originColor, newColor);
        dfs(image, sr+1, sc, originColor, newColor);
        dfs(image, sr, sc-1, originColor, newColor);
        dfs(image, sr, sc+1, originColor, newColor);
    }

    public static void main(String[] args) {
        int[][] image ={{1,1,1},{1,1,0},{1,0,1}};
        floodFill(image, 1, 1, 2);
        for (int[] im : image) {
            System.out.println(Arrays.toString(im));
        }
    }
}
