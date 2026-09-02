import java.util.ArrayList;
import java.util.List;

class Solution {

    List<Integer> modes = new ArrayList<>();

    int currentValue;
    int currentCount = 0;
    int maxCount = 0;

    public int[] findMode(TreeNode root) {
        traverse(root);
        return modes.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    private void traverse(TreeNode root) {
        if (root == null) return;

        traverse(root.left);

        if (root.val == currentValue){
            currentCount++;
        }
        else {
            currentValue = root.val;
            currentCount = 1;
        }

        if (currentCount > maxCount){
            maxCount = currentCount;
            modes.clear();
            modes.add(currentValue);
        } else if (currentCount == maxCount) {
            modes.add(currentValue);
        }

        traverse(root.right);
    }
}