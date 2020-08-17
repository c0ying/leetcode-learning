package com.c0ying.algorithm.s_110;

import com.c0ying.algorithm.TreeNode;

public class Solution {

    public static boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        return deepth(root) >=0;
    }

    public static int deepth(TreeNode root){
        if (root == null) return 0;
        int left = deepth(root.left);
        int right = deepth(root.right);
        if (left >= 0 && right >=0 && Math.abs(left-right) <=1){
            return Math.max(left, right)+1;
        }else{
            return -1;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode a = new TreeNode(2);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(3);
        TreeNode e = new TreeNode(4);
        TreeNode f = new TreeNode(4);
        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        c.left = e;
        c.right = f;
        System.out.println(isBalanced(root));
    }
}
