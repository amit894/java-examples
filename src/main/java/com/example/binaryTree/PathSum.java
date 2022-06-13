package com.example.binaryTree;

import apple.laf.JRSUIUtils;

public class PathSum {
    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode (int val){ this.val=val;}
        TreeNode (int val,TreeNode left, TreeNode right){
            this.val=val;
            this.left=left;
            this.right=right;
        }
    }

    private boolean isPathSum(TreeNode root, int sum){
        if (root==null)
            return false;
        sum-= root.val;
        if (root.left==null && root.right==null)
            return (sum==0);
        return (isPathSum(root.left,sum) || isPathSum(root.right,sum));
    }
}
