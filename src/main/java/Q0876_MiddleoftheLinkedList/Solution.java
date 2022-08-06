package Q0876_MiddleoftheLinkedList;

import Common.ListNode;

class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode s = head, f = head;
        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }
        return s;
    }
}