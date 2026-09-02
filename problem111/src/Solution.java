class Solution {
    public int minDepth(TreeNode root) {
        return minDepthRec(root);
    }

    private int minDepthRec(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null) return 1 + minDepthRec(root.right);
        if (root.right == null) return 1 + minDepthRec(root.left);

        return 1 + Math.min(minDepthRec(root.left), minDepthRec(root.right));
    }
}