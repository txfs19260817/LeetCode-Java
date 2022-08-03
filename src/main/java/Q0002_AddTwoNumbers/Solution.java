package Q0002_AddTwoNumbers;

import Common.ListNode;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode p = head;
        int c = 0;
        while (l1 != null || l2 != null || c > 0) {
            int sum = c;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            c = sum / 10;
            p.next = new ListNode(sum % 10);
            p = p.next;
        }
        return head.next;
    }
}