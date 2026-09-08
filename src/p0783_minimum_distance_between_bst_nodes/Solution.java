package p0783_minimum_distance_between_bst_nodes;

import common.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private int minDiff = Integer.MAX_VALUE;
    private Integer lastVal = null;

    public int minDiffInBST(TreeNode root) {
        minDiffInBSTRec(root);
        return minDiff;
    }

    private void minDiffInBSTRec(TreeNode root)
    {
        if (root == null) return;

        minDiffInBSTRec(root.left);

        if (lastVal != null){
            int diff = root.val - lastVal;
            if (diff < minDiff) minDiff = diff;
        }

        lastVal = root.val;

        minDiffInBSTRec(root.right);
    }
}