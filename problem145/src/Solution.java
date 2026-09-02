import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postOrder(root, result);
        return result;
    }

    private void postOrder(TreeNode root, List<Integer> result) {
        if (root != null){
            postOrder(root.left, result);
            postOrder(root.right, result);
            result.add(root.val);
        }
    }
}