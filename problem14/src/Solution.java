import java.util.Arrays;
import java.util.Comparator;

class Solution
{
    public String longestCommonPrefix(String[] strs)
    {
        int longest = 0;

        Arrays.sort(strs, Comparator.comparing(String::length));

        for (int i = 0; i < strs[0].length(); i++)
        {
            boolean isSameChar = true;
            for (int j = 1; j < strs.length; j++)
            {
                if (strs[0].charAt(i) != strs[j].charAt(i))
                {
                    isSameChar = false;
                    break;
                }
            }

            if (isSameChar) longest++;
            else break;
        }

        if (longest == 0) return "";
        else return strs[0].substring(0, longest);
    }
}