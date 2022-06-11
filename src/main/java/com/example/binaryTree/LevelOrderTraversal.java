package com.example.binaryTree;
import java.util.*;

public class LevelOrderTraversal {
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

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result= new ArrayList<>();
        if (root==null)
            return result;
        Queue <TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level=0;
        while (!queue.isEmpty()){
            int level_length= queue.size();
            result.add(new ArrayList<>());
            for (int i=0; i<level_length;i++){
                TreeNode node = queue.remove();
                result.get(level).add(node.val);
            }
            level++;
        }
        return result;

    }
}
