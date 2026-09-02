void main() {
    Solution solution = new Solution();
    TreeNode threeVal = new TreeNode(3);
    TreeNode twoVal = new TreeNode(2, threeVal, null);
    TreeNode root = new TreeNode(1, null, twoVal);

    System.out.println(solution.inorderTraversal(root));
}