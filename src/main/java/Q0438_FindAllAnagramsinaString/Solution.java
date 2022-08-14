package Q0438_FindAllAnagramsinaString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        HashMap<Character, Integer> pCnt = new HashMap<>(), sCnt = new HashMap<>();
        for (int i = 0; i < p.length(); i++) {
            pCnt.merge(p.charAt(i), 1, Integer::sum);
        }
        int l = 0, r = 0;
        while (l < s.length()) {
            if (r < s.length() && r - l < p.length()) {
                sCnt.merge(s.charAt(r), 1, Integer::sum);
                r++;
            } else {
                sCnt.merge(s.charAt(l), -1, Integer::sum);
                sCnt.remove(s.charAt(l), 0); // delete entry whose value is 0 to enable `equals()` to work properly
                l++;
            }
            if (pCnt.equals(sCnt)) {
                ans.add(l);
            }
        }
        return ans;
    }
}