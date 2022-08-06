package Q0876_MiddleoftheLinkedList;

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
                new Object[]{new int[]{1, 2, 3, 4, 5}, new int[]{3, 4, 5}},
                new Object[]{new int[]{1, 2, 3, 4, 5, 6}, new int[]{4, 5, 6}},
        };
    }

    @Test(dataProvider = "examples")
    public void testMiddleNode(int[] nums, int[] expectArray) {
        var actual = solution.middleNode(ListNode.createListFromArray(nums));
        var expect = ListNode.createListFromArray(expectArray);
        assertTrue(ListNode.equals(expect, actual));
    }
}