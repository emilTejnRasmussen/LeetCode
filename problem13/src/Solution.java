import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution
{
    private Map<Character, Integer> romanNumerals = new HashMap<>(Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
    ));

    public int romanToInt(String s)
    {
        int symbolAmount = s.length();
        int[] nums = new int[symbolAmount];

        int total = 0;

        for (int i = 0; i < symbolAmount; i++)
        {
            nums[i] = romanNumerals.get(s.charAt(i));
        }

        for (int i = 0; i < nums.length; i++)
        {
            if (i + 1 >= nums.length) total += nums[i];
            else if (nums[i] >= nums[i + 1]) total += nums[i];
            else
            {
                total += (nums[i + 1] - nums[i]);
                i++;
            }
        }

        return total;
    }
}