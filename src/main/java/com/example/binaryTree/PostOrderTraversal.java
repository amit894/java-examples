package com.example.binaryTree;
import java.util.*;

public class PostOrderTraversal {
    TreeNode root;
    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode (int val){this.val=val;}
        TreeNode (int val,TreeNode left, TreeNode right){
            this.val=val;
            this.left=left;
            this.right=right;
        }
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List <Integer> result = new ArrayList<>();
        result=postorderTraversalHelper(root,result);
        return result;

    }

    public List<Integer> postorderTraversalHelper ( TreeNode root, List result){
        if (root==null){
            return result;
        }

        postorderTraversalHelper(root.left,result);
        postorderTraversalHelper(root.right,result);
        result.add(root.val);
        return result;

    }
}
