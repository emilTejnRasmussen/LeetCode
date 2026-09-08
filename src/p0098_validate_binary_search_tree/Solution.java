package p0098_validate_binary_search_tree;

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
    private boolean isValid = true;
    private TreeNode last = null;

    public boolean isValidBST(TreeNode root) {
        traverse(root);
        return isValid;
    }

    private void traverse(TreeNode node)
    {
        if (node == null || !isValid) return;

        traverse(node.left);

        if (last != null) {
            if (last.val >= node.val){
                isValid = false;
                return;
            }
        }

        last = node;

        traverse(node.right);
    }
}