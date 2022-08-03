package Q0021_MergeTwoSortedLists;

import Common.ListNode;

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode p = head;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                p.next = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                p.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            p = p.next;
        }
        while (list1 != null) {
            p.next = new ListNode(list1.val);
            list1 = list1.next;
            p = p.next;
        }
        while (list2 != null) {
            p.next = new ListNode(list2.val);
            list2 = list2.next;
            p = p.next;
        }
        return head.next;
    }
}