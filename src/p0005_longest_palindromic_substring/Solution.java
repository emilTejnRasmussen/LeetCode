package p0005_longest_palindromic_substring;

class Solution {
    public String longestPalindrome(String s) {
        int currentLongest = 0;
        String longestString = "";

        for (int i = 0; i < s.length(); i++) {
            String odd = longestPalindrome(i, i, s);
            String even = longestPalindrome(i, i + 1, s);

            String result = odd.length() > even.length() ? odd : even;

            if (result.length() > currentLongest){
                currentLongest = result.length();
                longestString = result;
            }
        }

        return longestString;
    }

    private String longestPalindrome(int left, int right, String s){

        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        int start = left + 1;
        int end = right;

        return s.substring(start, end);
    }
}