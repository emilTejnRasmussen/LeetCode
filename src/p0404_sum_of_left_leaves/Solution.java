package p0404_sum_of_left_leaves;

import common.TreeNode;

class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;

        int sum = 0;

        if (root.left != null &&
                root.left.left == null &&
                root.left.right == null) {
            sum += root.left.val;
        }

        sum += sumOfLeftLeaves(root.left);
        sum += sumOfLeftLeaves(root.right);

        return sum;
    }
}