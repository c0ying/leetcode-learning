package com.c0ying.algorithm.poffer_07;

import com.c0ying.algorithm.TreeNode;

import java.util.Arrays;

//TODO:HashMap可以加快速度
public class Solution {

    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || preorder.length <=0) return null;
        if (inorder == null || inorder.length <=0) return null;
        TreeNode root = new TreeNode(preorder[0]);
        int root_in_index = -1;
        for (int i = 0; i < inorder.length; i++) {
            if(inorder[i] == preorder[0]){
                root_in_index = i;
                break;
            }
        }
        if(preorder.length >= 1 && root_in_index > -1){
            root.left = buildTree(Arrays.copyOfRange(preorder, 1, preorder.length), Arrays.copyOfRange(inorder, 0, root_in_index));
            root.right = buildTree(Arrays.copyOfRange(preorder, root_in_index+1, preorder.length), Arrays.copyOfRange(inorder, root_in_index+1, inorder.length));
            return root;
        }else{
            return null;
        }
    }

    public static void main(String[] args) {
        TreeNode treeNode = buildTree(new int[]{3,9,20,15,7}, new int[]{9,3,15,20,7});
        System.out.println(treeNode);
    }

}
