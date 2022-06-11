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

    private List<Integer> preorderTraversalHelper ( TreeNode root, List result){
        if (root==null){
            return result;
        }

        result.add(root.val);
        preorderTraversalHelper(root.left,result);
        preorderTraversalHelper(root.right,result);
        return result;

    }

    public static void main (String [] args){
    }
}
