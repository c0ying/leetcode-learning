package com.c0ying.algorithm.poffer_32;

import com.c0ying.algorithm.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        List<TreeNode> level = new ArrayList<>();
        level.add(root);
        boolean flag = true;
        while(level.size() > 0){
            List<Integer> tmp = new ArrayList<>();
            List<TreeNode> dlevel = new ArrayList<>();
            for(TreeNode treeNode: level){
                if(treeNode.left!=null){
                    dlevel.add(treeNode.left);
                }
                if(treeNode.right!=null){
                    dlevel.add(treeNode.right);
                }
            }
            if (flag){
                for (TreeNode treeNode : level) {
                    tmp.add(treeNode.val);
                }
            }else{
                for (int i = level.size()-1; i >= 0 ; i--) {
                    tmp.add(level.get(i).val);
                }
            }
            result.add(tmp);
            level = dlevel;
            flag = !flag;
        }
        return result;
    }

    public static void main(String[] args) {
//        TreeNode root = new TreeNode(3);
//        TreeNode a = new TreeNode(9);
//        TreeNode b = new TreeNode(20);
//        TreeNode c = new TreeNode(15);
//        TreeNode d = new TreeNode(7);
//        root.left = a;
//        root.right = b;
//        b.left = c;
//        b.right = d;
        TreeNode root = new TreeNode(1);
        TreeNode a = new TreeNode(2);
        TreeNode b = new TreeNode(3);
        TreeNode c = new TreeNode(4);
        TreeNode d = new TreeNode(5);
        root.left = a;
        root.right = b;
        a.left = c;
        b.right = d;
        List<List<Integer>> lists = levelOrder(root);
        System.out.println(lists);
    }
}
