package com.example.binaryTree;

public class InOrderStackTraversal {
    TreeNode root;
    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode (int val){this.val=val;}
        TreeNode (int val, TreeNode left, TreeNode right){
            this.val=val;
            this.left=left;
            this.right=right;
        }
    }
}
