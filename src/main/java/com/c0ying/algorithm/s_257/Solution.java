package com.c0ying.algorithm.s_257;

import com.c0ying.algorithm.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) return Collections.emptyList();
        List<String> result = new ArrayList<>();
        dfs(root, new ArrayList<>(), result);
        return result;
    }

    public void dfs(TreeNode root, List<Integer> tmp, List<String> result){
        if (root == null){
            result.add(tmp.stream().map(v->String.valueOf(v)).collect(Collectors.joining("->")));
            return;
        }
        tmp.add(root.val);
        if (root.left!=null || (root.left == null && root.right==null)) dfs(root.left, tmp, result);
        if (root.right!=null) dfs(root.right, tmp, result);

        tmp.remove(tmp.size()-1);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode a = new TreeNode(2);
        TreeNode b = new TreeNode(3);
        TreeNode c = new TreeNode(5);
        root.left=a;
        root.right=b;
        a.right=c;
        Solution solution = new Solution();
        System.out.println(solution.binaryTreePaths(root));
    }
}
