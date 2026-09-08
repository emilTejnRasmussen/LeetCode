package p0897_increasing_order_search_tree;

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
    private TreeNode last = null;
    private TreeNode root = null;

    public TreeNode increasingBST(TreeNode root) {
        increasingBSTRec(root);
        return this.root;
    }

    private void increasingBSTRec(TreeNode node)
    {
        if (node == null) return;

        increasingBSTRec(node.left);


        if (last == null) root = node;
        else{
            last.right = node;
        }

        node.left = null;
        last = node;

        increasingBSTRec(node.right);
    }
}