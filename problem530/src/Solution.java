class Solution {
    private int minimumDiff = Integer.MAX_VALUE;
    private Integer lastVal = null;

    public int getMinimumDifference(TreeNode root) {
        traverse(root);
        return minimumDiff;
    }

    private void traverse(TreeNode root) {
        if (root == null) return;

        traverse(root.left);

        if (lastVal != null) {
            int diff = root.val - lastVal;

            if (diff < minimumDiff) {
                minimumDiff = diff;
            }
        }

        lastVal = root.val;

        traverse(root.right);
    }
}