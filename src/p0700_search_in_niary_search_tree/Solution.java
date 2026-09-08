package p0700_search_in_niary_search_tree;

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
    public TreeNode searchBST(TreeNode root, int val) {
        return searchBSTRec(root, val);
    }

    private TreeNode searchBSTRec(TreeNode node, int val)
    {
        if (node == null) return null;

        if (node.val == val) return node;
        else if (node.val < val) return searchBSTRec(node.right, val);
        return searchBSTRec(node.left, val);
    }
}