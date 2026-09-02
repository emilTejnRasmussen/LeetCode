import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();

        binaryTreePathsRec(root, new StringBuilder(), result);
        return result;
    }

    private void binaryTreePathsRec(TreeNode root, StringBuilder path, List<String> result) {
        if (root == null) return;

        int oldLength = path.length();

        path.append(root.val);

        if (root.left == null && root.right == null) {
            result.add(path.toString());
        } else {
            path.append("->");

            binaryTreePathsRec(root.left, path, result);
            binaryTreePathsRec(root.right, path, result);
        }

        path.setLength(oldLength);
    }
}