package p0450_delete_node_in_a_bst;

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
    public TreeNode deleteNode(TreeNode root, int key) {
        return deleteRec(root, key);
    }

    private TreeNode deleteRec(TreeNode node, int key)
    {
        if (node == null) return null;
        if (key < node.val) node.left = deleteRec(node.left, key);
        else if (key > node.val) node.right = deleteRec(node.right, key);

        else
        {
            // in case of node to delete has 1 child or a leaf
            if (node.left == null) return node.right;
            else if (node.right == null) return node.left;

            // in case of node to delete has 2 children
            else{
                int successor = findMinRec(node.right);
                node.val = successor;
                node.right = deleteRec(node.right, successor);
            }
        }
        return node;
    }

    private int findMinRec(TreeNode node)
    {
        if (node.left == null) return node.val;
        return findMinRec(node.left);
    }
}