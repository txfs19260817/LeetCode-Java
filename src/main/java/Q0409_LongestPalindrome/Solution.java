package Q0409_LongestPalindrome;

class Solution {
    public int longestPalindrome(String s) {
        int[] ch2cnt = new int[128];
        for (int i = 0; i < s.length(); i++) {
            ch2cnt[s.charAt(i)]++;
        }
        int sum = 0, odd = 0;
        for (int cnt : ch2cnt) {
            if (cnt % 2 == 0) {
                sum += cnt;
            } else {
                if (odd == 0) odd = 1; // add a char with odd occurrence
                sum += cnt - 1; // take even # from odd occurrence
            }
        }
        return sum + odd;
    }
}