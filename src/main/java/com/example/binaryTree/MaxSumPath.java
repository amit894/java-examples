package com.example.binaryTree;

public class MaxSumPath {
    private class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode ( int val){ this.val=val;}
        TreeNode ( int val, TreeNode left, TreeNode right){
            this.val=val;
            this.left=left;
            this.right=right;
        }
    }


    public int maxSumPath(TreeNode node, int res) {
        if (node==null)
            return 0;
        int left_max_path=Math.max(maxSumPath(node.left,res),0);
        int right_max_path=Math.max(maxSumPath(node.right,res),0);
        int max_one = Math.max(node.val, Math.max(left_max_path,right_max_path));
        int max_root= Math.max(max_one, node.val+left_max_path+right_max_path);
        res=Math.max(res,max_root);
        return res;

    }
    public int maxPathSum(TreeNode root){
        int res=0;
        res=maxSumPath(root,res);
        return res;

    }
}
