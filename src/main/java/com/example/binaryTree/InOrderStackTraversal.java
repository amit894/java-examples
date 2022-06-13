package com.example.binaryTree;
import javax.swing.tree.TreeNode;
import java.util.*;

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

    private List <Integer>  InOrderTraversal (TreeNode root){
        List <Integer> result = new ArrayList<>();
        if (root==null)
            return result;
        TreeNode current_node = root;
        Stack <TreeNode> stack = new Stack<TreeNode>();
        while (current_node!=null || !stack.isEmpty()){
            while (current_node!=null){
                stack.push(current_node);
                current_node=current_node.left;
            }
            TreeNode node = stack.pop();
            result.add(node.val);
            current_node=current_node.right;

        }
        return  result;

    }
}
