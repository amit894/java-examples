package com.example.binaryTree;
import java.util.*;

public class PreOrderStackTraversal {
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

    private List<Integer> preOrderTraversal(TreeNode root){
        List <Integer> result= new ArrayList<>();
        Stack <TreeNode> stack = new Stack<TreeNode>();
        if (root==null)
            return result;
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            result.add(node.val);
            if (node.right != null)
                stack.push(node.left);
            if (node.left != null)
                stack.push(node.left);
        }

        return result;

    }

    private List<Integer> preOrderTraversalQueue(TreeNode root){
        List <Integer> result= new ArrayList<>();
        Queue <TreeNode> queue = new LinkedList<>();
        if (root==null)
            return result;
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();
            result.add(node.val);
            if (node.left != null)
                queue.add(node.left);
            if (node.right != null)
                queue.add(node.left);
        }

        return result;

    }
}
