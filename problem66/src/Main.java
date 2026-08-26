void main()
{
    Solution solution = new Solution();
    int[] a1 = new int[] {1,2,3};
    int[] a2 = new int[] {4,3,2,1};
    int[] a3 = new int[] {9};
    int[] a4 = new int[] {9,9,9};

    System.out.println(Arrays.toString(solution.plusOne(a1)));
    System.out.println(Arrays.toString(solution.plusOne(a2)));
    System.out.println(Arrays.toString(solution.plusOne(a3)));
    System.out.println(Arrays.toString(solution.plusOne(a4)));
}