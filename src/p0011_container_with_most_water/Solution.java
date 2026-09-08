package p0011_container_with_most_water;

class Solution {
    public int maxArea(int[] height) {
        int max = 0;

        int left = 0;
        int right = height.length - 1;

        while (left != right){
            int leftHeight = height[left];
            int rightHeight = height[right];

            int area = (right - left) * Math.min(leftHeight, rightHeight);

            if (leftHeight < rightHeight) left++;
            else right--;

            max = Math.max(area, max);
        }
        return max;
    }
}
