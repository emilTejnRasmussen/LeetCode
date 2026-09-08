package p0653_two_sum_iv_input_is_bst;

import common.TreeNode;

import java.util.HashSet;
import java.util.Set;

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
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> seen = new HashSet<>();
        return findTargetRec(root, k, seen);
    }

    private boolean findTargetRec(TreeNode node, int k, Set<Integer> seen)
    {
        if (node == null) return false;

        int needed = k - node.val;

        if (seen.contains(needed)) return true;

        seen.add(node.val);

        return findTargetRec(node.left, k, seen) || findTargetRec(node.right, k, seen);
    }
}
