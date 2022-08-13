package Q0005_LongestPalindromicSubstring;

class Solution {
    public String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s;
        }
        String ans = "";
        for (int i = 0; i < s.length() - 1; i++) {
            String palindrome = getPalindrome(s, i, i);
            if (palindrome.length() > ans.length()) {
                ans = palindrome;
            }
            palindrome = getPalindrome(s, i, i + 1);
            if (palindrome.length() > ans.length()) {
                ans = palindrome;
            }
        }
        return ans;
    }

    private String getPalindrome(String s, int l, int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return s.substring(l + 1, r);
    }
}