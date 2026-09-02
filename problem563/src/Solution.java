class Solution {
    private int tilt;
    public int findTilt(TreeNode root) {
        tiltOfNode(root);
        return tilt;
    }

    private int tiltOfNode(TreeNode root) {
        if (root == null) return 0;

        int leftSum = tiltOfNode(root.left);
        int rightSum = tiltOfNode(root.right);

        tilt += Math.abs(leftSum - rightSum);

        return root.val + leftSum + rightSum;
    }
}