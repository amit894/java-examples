package com.example.binaryTree;
import java.util.*;

public class InOrderTraversal {
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

    public List<Integer> inorderTraversalHelper ( TreeNode root, List result){
        if (root==null){
            return result;
        }

        inorderTraversalHelper(root.left,result);
        result.add(root.val);
        inorderTraversalHelper(root.right,result);
        return result;

    }
}
