package Q0003_LongestSubstringWithoutRepeatingCharacters;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0, l = 0;
        Map<Character, Integer> ch2idx = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch2idx.containsKey(ch)) {
                l = Math.max(l, ch2idx.get(ch) + 1); // if ch in map and its previous index is larger than l, update l
            }
            ans = Math.max(ans, i - l + 1);
            ch2idx.put(ch, i);
        }
        return ans;
    }

    public int lengthOfLongestSubstring2(String s) {
        int ans = 0, l = 0, r = 0;
        Map<Character, Integer> ch2cnt = new HashMap<>();
        while (l < s.length()) {
            if (r < s.length() && ch2cnt.getOrDefault(s.charAt(r), 0) == 0) {
                ch2cnt.merge(s.charAt(r), 1, Integer::sum);
                r++;
            } else {
                ch2cnt.merge(s.charAt(l), -1, Integer::sum);
                l++;
            }
            ans = Math.max(ans, r - l);
        }
        return ans;
    }
}