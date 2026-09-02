void main() {
    Solution solution = new Solution();

    TreeNode head = new TreeNode(3,
            new TreeNode(9), new TreeNode(20,
            new TreeNode(15), new TreeNode(7)));

    System.out.println(solution.minDepth(head));
}