package Q0206_ReverseLinkedList;

import Common.ListNode;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class SolutionTest {

    private Solution solution;

    @BeforeMethod
    public void setUp() throws Exception {
        this.solution = new Solution();
    }

    @DataProvider(name = "examples")
    public Object[][] data() {
        return new Object[][]{
                new Object[]{new int[]{1, 2, 3, 4, 5}, new int[]{5, 4, 3, 2, 1}},
                new Object[]{new int[]{}, new int[]{}},
        };
    }

    @Test(dataProvider = "examples")
    public void testReverseList(int[] nums, int[] expect) {
        ListNode actual = solution.reverseList(ListNode.createListFromArray(nums));
        assertTrue(ListNode.equals(ListNode.createListFromArray(expect), actual));
    }
}