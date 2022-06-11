package com.example.binaryTree;


public class HelloBinaryTree {
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

    public static void main (String [] args){
        TreeNode root= new TreeNode(2);
        TreeNode child_1 = new TreeNode(3);
        TreeNode child_2 = new TreeNode(4);
        root.left=child_1;
        root.right=child_2;
        System.out.println(root.left.val);
        System.out.println(root.right.val);

    }

}
