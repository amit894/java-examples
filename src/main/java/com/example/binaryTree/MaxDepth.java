package com.example.binaryTree;

public class MaxDepth {
    private static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){this.val=val;}
        TreeNode(int val, TreeNode left, TreeNode right){
            this.val=val;
            this.left=left;
            this.right=right;
        }
    }

    private int maxDepth ( TreeNode root){
        int maxDepth=0;
        if (root==null)
            return maxDepth;

        int maxDepth_left = maxDepth(root.left);
        int maxDepth_right = maxDepth(root.right);
        return Math.max(maxDepth_left,maxDepth_right)+1;

    }
}
