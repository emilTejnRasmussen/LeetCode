package p0543_diameter_of_binary_tree;

import common.TreeNode;

class Solution {
    private int diameter;

    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return diameter;
    }

    private int depth(TreeNode root) {
        if (root == null) return 0;

        int leftDepth = depth(root.left);
        int rightDepth = depth(root.right);

        diameter = Math.max(diameter, leftDepth + rightDepth);

        return 1 + Math.max(leftDepth, rightDepth);
    }
}