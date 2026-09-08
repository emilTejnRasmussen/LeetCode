package p0230_kth_smallest_element_in_a_bst;

import common.TreeNode;

import java.util.PriorityQueue;
import java.util.Queue;

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
    int k;
    int count = 0;
    int result;

    public int kthSmallest(TreeNode root, int k) {
        this.k = k;
        kthSmallestRec(root);
        return result;
    }

    private void kthSmallestRec(TreeNode node)
    {
        if (node == null) return;

        kthSmallestRec(node.left);

        count++;

        if (count == k){
            result = node.val;
            return;
        }

        kthSmallestRec(node.right);
    }
}
