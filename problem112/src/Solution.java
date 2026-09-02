class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return hasPathSumRec(root, targetSum, 0);

    }

    private boolean hasPathSumRec(TreeNode root, int targetSum, int currentSum) {
        if (root == null) return false;

        currentSum += root.val;

        if (root.left == null && root.right == null){
            return targetSum == currentSum;
        }

        return hasPathSumRec(root.left, targetSum, currentSum) ||
                hasPathSumRec(root.right, targetSum, currentSum);
    }
}