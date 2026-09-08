package p0938_ranmge_sum_of_bst;

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
    private int sum = 0;
    private int low = 0;
    private int high = 0;

    public int rangeSumBST(TreeNode root, int low, int high) {
        this.low = low;
        this.high = high;

        rangeSumBSTRec(root);

        return sum;
    }

    private void rangeSumBSTRec(TreeNode root)
    {
        if (root == null) return;

        if (root.val >= low && root.val <= high) sum += root.val;

        if ((root.val > low)) rangeSumBSTRec(root.left);
        if ((root.val < high)) rangeSumBSTRec(root.right);
    }
}