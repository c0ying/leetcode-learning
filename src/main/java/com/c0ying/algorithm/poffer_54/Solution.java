package com.c0ying.algorithm.poffer_54;

import com.c0ying.algorithm.TreeNode;

import java.util.ArrayList;
import java.util.List;

//TODO:可再优化
public class Solution {

    public static int kthLargest(TreeNode root, int k) {
        List<TreeNode> list = new ArrayList<>();
        serialList(root, list);
        return list.get(list.size()-k).val;
    }

    public static void serialList(TreeNode root, List<TreeNode> list){
        if(root == null) return;
        if(root.left != null) serialList(root.left, list);
        list.add(root);
        if(root.right != null) serialList(root.right, list);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(4);
        TreeNode c = new TreeNode(2);
        root.left = a;
        root.right = b;
        a.right = c;
        System.out.println(kthLargest(root, 1));
    }
}
