package Q0125_ValidPalindrome;

class Solution {
    public boolean isPalindrome(String s) {
        for (int l = 0, r = s.length() - 1; l < r; ) {
            char chl = s.charAt(l);
            if (isNotLetterOrDigit(chl)) {
                l++;
                continue;
            }
            var chr = s.charAt(r);
            if (isNotLetterOrDigit(chr)) {
                r--;
                continue;
            }
            if (Character.toLowerCase(chl) != Character.toLowerCase(chr)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    private static boolean isNotLetterOrDigit(char c) {
        return (c < 'a' || c > 'z') &&
                (c < 'A' || c > 'Z') &&
                (c < '0' || c > '9');
    }
}