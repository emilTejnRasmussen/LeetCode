package p0013_roman_to_integer;

class SolutionTest
{
    static void main()
    {
        Solution solution = new Solution();
        System.out.println(solution.romanToInt("III"));
        System.out.println(solution.romanToInt("LVIII"));
        System.out.println(solution.romanToInt("MCMXCIV"));
    }
}
