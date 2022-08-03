package Q0242_ValidAnagram;

import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> ch2cnt = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            ch2cnt.merge(s.charAt(i), 1, Integer::sum);
        }
        for (int i = 0; i < t.length(); i++) {
            var ch = t.charAt(i);
            ch2cnt.merge(ch, -1, Integer::sum);
            if (ch2cnt.get(ch) < 0) {
                return false;
            }
        }
        return true;
    }
}