package com.c0ying.algorithm.s_700;

import com.c0ying.algorithm.TreeNode;

public class Solution {

    public static TreeNode searchBST(TreeNode root, int val) {
        if(root == null) return null;
        if(root.val == val) return root;
        if (val < root.val){
            return searchBST(root.left, val);
        }else{
            return searchBST(root.right, val);
        }
    }

    public static void main(String[] args) {

    }
}
