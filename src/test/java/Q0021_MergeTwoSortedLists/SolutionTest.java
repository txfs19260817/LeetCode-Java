package Q0021_MergeTwoSortedLists;

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
                new Object[]{new int[]{1, 2, 3, 4, 5}, new int[]{1, 3, 4, 5}, new int[]{1, 1, 2, 3, 3, 4, 4, 5, 5}},
                new Object[]{new int[]{}, new int[]{0}, new int[]{0}},
                new Object[]{new int[]{}, new int[]{}, new int[]{}},
        };
    }

    @Test(dataProvider = "examples")
    public void testMergeTwoLists(int[] l1Array, int[] l2Array, int[] expectedArray) {
        ListNode actual = solution.mergeTwoLists(ListNode.createListFromArray(l1Array), ListNode.createListFromArray(l2Array));
        ListNode expected = ListNode.createListFromArray(expectedArray);
        assertTrue(ListNode.equals(expected, actual));
    }
}