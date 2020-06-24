package com.c0ying.algorithm.s_1028;

import com.c0ying.algorithm.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static TreeNode recoverFromPreorder(String S) {
        String numStr = "";
        int level = 0;
        Map<Integer, TreeNode> stack = new HashMap<>();
        TreeNode treeNode = null;
        for (int i =0; i < S.length(); i++){
            if(S.charAt(i) >= '0' && S.charAt(i) <= '9'){
                numStr += S.charAt(i);
                if(i+1 >= S.length() || S.charAt(i+1) =='-'){
                    treeNode = new TreeNode(Integer.parseInt(numStr));
                    numStr = "";
                }else{
                    continue;
                }
            }
            if(S.charAt(i) == '-') {
                level++;
                continue;
            }
            if(stack.size() == 0 || stack.get(level) == null){
                stack.put(level, treeNode);
                level=-1;
            }else{
                if(stack.get(level).left == null){
                    stack.get(level).left=treeNode;
                }else{
                    stack.get(level).right=treeNode;
                }
                stack.put(level+1, treeNode);
                level=-1;
            }
        }
        return stack.get(0);
    }

    public static void main(String[] args) {
//        System.out.println(recoverFromPreorder("1-2--3--4-5--6--7"));
        System.out.println(recoverFromPreorder("1-401--349---90--88"));
    }
}
