package com.c0ying.algorithm.s_107;

import com.c0ying.algorithm.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) return Collections.emptyList();
        List<List<Integer>> result = new ArrayList<>();
        List<TreeNode> l1 = new ArrayList<>();
        l1.add(root);
        helper(l1, result);
        return result;
    }

    public void helper(List<TreeNode> tmp, List<List<Integer>> result){
        if (tmp.isEmpty()) return;
        List<TreeNode> level = new ArrayList<>();
        for (TreeNode treeNode : tmp) {
            if(treeNode.left != null) level.add(treeNode.left);
            if(treeNode.right != null) level.add(treeNode.right);
        }
        helper(level, result);
        List<Integer> vals = new ArrayList<>();
        for (TreeNode treeNode : tmp) {
            vals.add(treeNode.val);
        }
        result.add(vals);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(3);
        TreeNode a = new TreeNode(9);
        TreeNode b = new TreeNode(20);
        TreeNode c = new TreeNode(15);
        TreeNode d = new TreeNode(7);
        root.left = a;
        root.right = b;
        b.left = c;
        b.right = d;
        System.out.println(solution.levelOrderBottom(root));
    }
}
