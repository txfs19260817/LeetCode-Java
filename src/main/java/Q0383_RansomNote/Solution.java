package Q0383_RansomNote;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] ch2cnt = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            ch2cnt[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            int key = ransomNote.charAt(i) - 'a';
            ch2cnt[key]--;
            if (ch2cnt[key] < 0) {
                return false;
            }
        }
        return true;
    }
}