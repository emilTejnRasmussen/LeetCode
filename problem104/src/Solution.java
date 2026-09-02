class Solution {
    public int maxDepth(TreeNode root) {
        return depthRec(root);
    }

    private int depthRec(TreeNode node)
    {
        if (node == null) return 0;
        return 1 + Math.max(depthRec(node.left), depthRec(node.right));
    }
}