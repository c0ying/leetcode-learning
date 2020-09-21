package com.c0ying.algorithm.s_538;

import com.c0ying.algorithm.TreeNode;

public class Solution {

    int num =0;

    public TreeNode convertBST(TreeNode root) {
        if (root != null){
            convertBST(root.right);
            root.val += num;
            num = root.val;
            convertBST(root.left);
        }
        return root;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        TreeNode root = new TreeNode(5);
//        TreeNode a = new TreeNode(2);
//        TreeNode b = new TreeNode(13);
//        root.left = a;
//        root.right = b;
//        System.out.println(solution.convertBST(root));
        TreeNode root = new TreeNode(2);
        TreeNode a = new TreeNode(0);
        TreeNode b = new TreeNode(3);
        TreeNode c = new TreeNode(-4);
        TreeNode d = new TreeNode(1);
        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        System.out.println(solution.convertBST(root));
    }
}
