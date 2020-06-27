package com.c0ying.algorithm.poffer_55;

import com.c0ying.algorithm.TreeNode;

//TODO:可再优化
public class Solution {

    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        int lh = treeHeight(root.left);
        int rh = treeHeight(root.right);
        if(Math.abs(lh - rh) > 1){
            return false;
        }else{
            return isBalanced(root.left) && isBalanced(root.right);
        }
    }

    public int treeHeight(TreeNode root){
        if(root == null) return 0;
        return Math.max(treeHeight(root.left), treeHeight(root.right)) +1;
    }
}
