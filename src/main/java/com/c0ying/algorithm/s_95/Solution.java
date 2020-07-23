package com.c0ying.algorithm.s_95;

import com.c0ying.algorithm.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {

    public static List<TreeNode> generateTrees(int n) {
        if(n == 0) return Collections.emptyList();
        return generateSubTrees(1,n);
    }

    public static List<TreeNode> generateSubTrees(int start, int end){
        List<TreeNode> nodes = new ArrayList<>();
        if (start > end){
            nodes.add(null);
            return nodes;
        }
        for (int i = start; i <= end ; i++) {
            List<TreeNode> leftTree = generateSubTrees(start, i - 1);
            List<TreeNode> rightTree = generateSubTrees(i + 1, end);
            for (TreeNode node: leftTree) {
                for (TreeNode node2: rightTree) {
                    TreeNode root = new TreeNode(i);
                    root.right = node2;
                    root.left = node;
                    nodes.add(root);
                }
            }
        }
        return nodes;
    }

    public static void main(String[] args) {
        List<TreeNode> treeNodes = generateTrees(3);
        System.out.println(treeNodes.size());
    }
}
