package com.c0ying.algorithm.s_617;

public class Solution {

    public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1 == null && t2 == null) return null;
        if(t1 != null && t2 != null) {
            t1.val = t1.val + t2.val;
        }
        if(t1 == null && t2 != null){
            return t2;
        }
        if(t1 != null){

            t1.left = mergeTrees(t1==null?null:t1.left, t2==null?null:t2.left);
            t1.right = mergeTrees(t1==null?null:t1.right, t2==null?null:t2.right);
        }
        return t1;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x;}
    }

    public static void main(String[] args) {
//        TreeNode root = new TreeNode(1);
//        TreeNode b = new TreeNode(3);
//        TreeNode c = new TreeNode(2);
//        TreeNode d = new TreeNode(5);
//        root.left = b;
//        root.right = c;
//        b.left = d;
//
//        TreeNode root2 = new TreeNode(2);
//        TreeNode b2 = new TreeNode(1);
//        TreeNode c2 = new TreeNode(3);
//        TreeNode d2 = new TreeNode(4);
//        TreeNode e2 = new TreeNode(7);
//        root2.left = b2;
//        root2.right = c2;
//        b2.right = d2;
//        c2.right = e2;

        TreeNode root = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        root.left = b;
        b.left = c;

        TreeNode root2 = new TreeNode(1);
        TreeNode b2 = new TreeNode(2);
        TreeNode c2 = new TreeNode(3);
        root2.right = b2;
        b2.right = c2;

        mergeTrees(root, root2);
        System.out.println(root);
    }
}
