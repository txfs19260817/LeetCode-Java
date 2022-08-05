package Q0141_LinkedListCycle;

import Common.ListNode;

public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        for (ListNode s = head, f = head.next; s != f; s = s.next, f = f.next.next) {
            if (f == null || f.next == null) return false;
        }
        return true;
    }
}