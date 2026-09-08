package p0011_container_with_most_water;

public class SolutionTest
{
    static void main()
    {
        Solution solution = new Solution();

        int [] height = new int[] {1,8,6,2,5,4,8,3,7};

        int res = solution.maxArea(height);
        System.out.println(res);
    }
}
