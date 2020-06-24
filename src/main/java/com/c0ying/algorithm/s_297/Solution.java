package com.c0ying.algorithm.s_297;

import com.c0ying.algorithm.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public static String serialize(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        StringBuilder str = new StringBuilder();
        str.append("[");
        while(!queue.isEmpty()){
            TreeNode tmp = queue.poll();
            if(tmp != null){
                str.append(tmp.val);
                queue.add(tmp.left);
                queue.add(tmp.right);
            }else{
                str.append("null");
            }
            str.append(",");
        }
        str.deleteCharAt(str.length()-1);
        str.append("]");
        return str.toString();
    }

    // Decodes your encoded data to tree.
    public static TreeNode deserialize(String data) {
        String content = data.replace("[","").replace("]", "");
        String[] strings = content.split(",");
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode root = new TreeNode(Integer.parseInt(strings[0]));
        queue.add(root);
        int i =1;
        while(!queue.isEmpty()){
            TreeNode treeNode = queue.poll();
            if(!strings[i].equals("null")){
                treeNode.left = new TreeNode(Integer.parseInt(strings[i]));
                queue.offer(treeNode.left);
            }
            i++;
            if(!strings[i].equals("null")){
                treeNode.right = new TreeNode(Integer.parseInt(strings[i]));
                queue.offer(treeNode.right);
            }
            i++;
        }
        return root;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode g = new TreeNode(4);
        TreeNode h = new TreeNode(5);
        root.left = b;
        root.right = c;
        c.left = g;
        c.right = h;
        System.out.println(serialize(root));
        System.out.println(deserialize("[1,2,3,null,null,4,5,null,null,null,null]"));
    }
}
