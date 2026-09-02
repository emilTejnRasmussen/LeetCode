void main() {
    Solution solution = new Solution();

    TreeNode root = new TreeNode(3,
            new TreeNode(9, null, null), new TreeNode(20,
            new TreeNode(15, null, null), new TreeNode(7, null, null)));
    System.out.println(solution.maxDepth(root));
}