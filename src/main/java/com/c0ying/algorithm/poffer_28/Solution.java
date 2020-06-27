package com.c0ying.algorithm.poffer_28;

import com.c0ying.algorithm.TreeNode;

public class Solution {

    public static boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return sameNode(root.left, root.right);
    }

    public static boolean sameNode(TreeNode a, TreeNode b){
        if(a == null && b == null){
            return true;
        }
        if(a == null || b== null){
            return false;
        }
        return a.val == b.val && sameNode(a.left, b.right) && sameNode(a.right, b.left);
    }

    public static void main(String[] args) {
        //====result: true
        TreeNode root = new TreeNode(1);
        TreeNode a = new TreeNode(2);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(4);
        TreeNode f = new TreeNode(3);
        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        b.left = e;
        b.right = f;

        //====result:false
//        TreeNode root = new TreeNode(1);
//        TreeNode a = new TreeNode(2);
//        TreeNode b = new TreeNode(2);
//        TreeNode c = new TreeNode(3);
//        TreeNode d = new TreeNode(3);
//        root.left = a;
//        root.right = b;
//        a.right = c;
//        b.right = d;

        System.out.println(isSymmetric(root));
    }
}
