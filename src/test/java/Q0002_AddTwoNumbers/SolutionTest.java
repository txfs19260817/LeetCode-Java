package Q0002_AddTwoNumbers;

import Common.ListNode;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class SolutionTest {

    @Test
    public void testAddTwoNumbers() {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode expected = new ListNode(7);
        expected.next = new ListNode(0);
        expected.next.next = new ListNode(8);

        ListNode actual = new Solution().addTwoNumbers(l1, l2);
        assertTrue(ListNode.equals(actual, expected));
    }
}