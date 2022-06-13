package com.example.binaryTree;

public class isSymmetric {

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){this.val=val;}
        TreeNode(int val, TreeNode left, TreeNode right){
            this.left=left;
            this.right=right;
            this.val=val;
        }
    }

    private boolean isSymmetricCheck (TreeNode root){
        return isMirror(root, root);
    }

    private boolean isMirror(TreeNode t1, TreeNode t2){
        if (t1==null && t2==null){return true;}
        if (t1==null || t2==null){ return false;}
        if (t1.val!=t2.val)
            return false;
        return (isMirror(t1.right,t2.left) && isMirror(t2.right,t1.left));
    }
}
