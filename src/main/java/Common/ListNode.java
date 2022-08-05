package Common;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public int hashCode() {
        int result = val;
        result = 31 * result + (next != null ? next.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ListNode{" + "val=" + val + ", next=" + next + '}';
    }

    public static boolean equals(Object self, Object that) {
        if (self == null && that == null) {
            return true;
        }

        if (!(that instanceof ListNode thatTemp) || !(self instanceof ListNode thisTemp)) {
            return false;
        } else {
            while (thisTemp != null) {
                if (thatTemp == null || thisTemp.val != thatTemp.val) {
                    return false;
                } else {
                    thisTemp = thisTemp.next;
                    thatTemp = thatTemp.next;
                }
            }
            return thatTemp == null;
        }
    }

    public static ListNode createListFromArray(int[] nums) {
        ListNode head = null;

        for (int i = nums.length - 1; i >= 0; i--) {
            ListNode temp = new ListNode(nums[i]);
            temp.next = head;
            head = temp;
        }

        return head;
    }

    public static ListNode createListFromArray(int[] nums, int pos) {
        ListNode head = null;
        ListNode cycle = null;
        ListNode tail = null;

        for (int i = nums.length - 1; i >= 0; i--) {
            ListNode temp = new ListNode(nums[i]);
            temp.next = head;
            head = temp;

            if (i == pos) {
                cycle = temp;
            }

            if (i == nums.length - 1) {
                tail = temp;
            }
        }

        if (tail != null && cycle != null) {
            tail.next = cycle;
        }

        return head;
    }
}