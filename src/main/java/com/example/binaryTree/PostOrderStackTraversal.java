package com.example.binaryTree;

import sun.java2d.loops.GraphicsPrimitive;

import java.util.*;

public class PostOrderStackTraversal {
    TreeNode root;

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode ( int val){this.val=val;}
        TreeNode ( int val, TreeNode left, TreeNode right){
            this.val=val;
            this.left=left;
            this.right=right;
        }
    }

    private List<Integer> postOrderTraversal ( TreeNode root){
        List <Integer> result = new ArrayList<>();
        if (root==null)
            return result;
        Stack <TreeNode> s1 = new Stack<>();
        Stack <TreeNode> s2 = new Stack<>();
        s1.push(root);

        while (!s1.isEmpty()){
            TreeNode node = s1.pop();
            s2.push(node);
            if (node.left!=null)
                s1.push(node.left);
            if (node.right!=null)
                s1.push(node.right);
        }

        while (!s2.isEmpty()){
            result.add(s2.pop().val);
        }

        return result;


    }
}
