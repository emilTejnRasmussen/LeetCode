import java.util.Arrays;

class Solution
{
    public int[] plusOne(int[] digits)
    {
        int lastIndex = digits.length - 1;
        if (digits[lastIndex] != 9) digits[lastIndex]++;
        else
        {
            for (int i = lastIndex; i >= 0; i--)
            {
                if (i == 0 && digits[i] == 9)
                {
                    int[] newArr = new int[digits.length + 1];
                    digits[i] = 0;
                    newArr[0] = 1;
                    System.arraycopy(digits, 0, newArr, 1, digits.length);

                    return newArr;
                }

                if (digits[i] == 9) digits[i] = 0;
                else
                {
                    digits[i]++;
                    break;
                }
            }
        }
        return digits;
    }
}