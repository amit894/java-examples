package com.example.binaryTree;
import java.util.*;

public class PreOrderTraversal {
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

    private List<Integer> preorderTraversalHelper ( TreeNode root) {
        List <Integer> result = new ArrayList<>();
        result=preorderTraversalHelper(root,result);
        return result;

    }


    private List<Integer> preorderTraversalHelper ( TreeNode root, List result){
        if (root==null)
            return result;
        result.add(root.val);
        if (root.left!=null)
            preorderTraversalHelper(root.left,result);
        if (root.right!=null)
            preorderTraversalHelper(root.right,result);
        return result;

    }

    public static void main (String [] args){
    }
}
