class Solution {
    public boolean isPalindrome(int x) {
        boolean itIsPalindrome = true;
        String in = x + "";

        for (int i = 0; i < in.length(); i++)
        {
            if (in.charAt(i) != in.charAt(in.length() - 1 - i)){
                itIsPalindrome = false;
                break;
            }
        }
        return itIsPalindrome;
    }
}