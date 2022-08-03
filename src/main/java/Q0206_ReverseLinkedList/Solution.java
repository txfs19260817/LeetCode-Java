package Q0206_ReverseLinkedList;

import Common.ListNode;

class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode temp, p = head.next;
        head.next = null;
        while (p != null) {
            temp = p.next;
            p.next = head;
            head = p;
            p = temp;
        }
        return head;
    }
}