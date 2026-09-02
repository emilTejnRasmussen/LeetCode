class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isSymmetricRec(root.left, root.right);
    }

    private boolean isSymmetricRec(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;
        if (left.val != right.val) return false;

        return isSymmetricRec(left.left, right.right) && isSymmetricRec(left.right, right.left);
    }
}