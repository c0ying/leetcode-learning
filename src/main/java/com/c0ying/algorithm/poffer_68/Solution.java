package com.c0ying.algorithm.poffer_68;

import com.c0ying.algorithm.TreeNode;

public class Solution {

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null;
        if(root.val == p.val) return root;
        if(root.val == q.val) return root;
        TreeNode left =lowestCommonAncestor(root.left, p, q);
        TreeNode right =lowestCommonAncestor(root.right, p, q);
        if (left!=null && right!= null){
            return root;
        }else{
            if(left != null){
                return left;
            }
            if (right != null){
                return right;
            }
            return null;
        }
    }

    public static void main(String[] args) {

    }
}
