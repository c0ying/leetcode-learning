package com.c0ying.algorithm.poffer_26;

import com.c0ying.algorithm.TreeNode;

public class Solution {

    public static boolean isSubStructure(TreeNode A, TreeNode B) {
        if (B == null) return false;
        return find(A,B);
    }

    public static boolean find(TreeNode A, TreeNode B){
        if(A == null) return false;
        if(A.val == B.val) {
            return  sameStructure(A, B);
        }
        return find(A.left, B) || find(A.right, B);
    }

    public static boolean sameStructure(TreeNode A, TreeNode B){
        if(B==null) {
            return true;
        }
        if(A==null) {
            return false;
        }
        if(A.val!=B.val) {
            return false;
        }
        boolean flag = sameStructure(A.left, B.left) && sameStructure(A.right, B.right);
        return flag;
    }

    public static void main(String[] args) {
        TreeNode a_root = new TreeNode(1);
        TreeNode a_root2 = new TreeNode(2);
        TreeNode a_root3 = new TreeNode(3);
        a_root.left = a_root2;
        a_root.right = a_root3;

        TreeNode b_root = new TreeNode(3);
        TreeNode b_root2 = new TreeNode(1);
        b_root.left = b_root2;

//        TreeNode a_root = new TreeNode(3);
//        TreeNode a_root2 = new TreeNode(4);
//        TreeNode a_root3 = new TreeNode(5);
//        TreeNode a_root4 = new TreeNode(1);
//        TreeNode a_root5 = new TreeNode(2);
//        a_root.left = a_root2;
//        a_root.right = a_root3;
//        a_root2.left = a_root4;
//        a_root2.right = a_root5;
//
//        TreeNode b_root = new TreeNode(4);
//        TreeNode b_root2 = new TreeNode(1);
//        b_root.left = b_root2;

        boolean subStructure = isSubStructure(a_root, b_root);
        System.out.println(subStructure);
    }
}
