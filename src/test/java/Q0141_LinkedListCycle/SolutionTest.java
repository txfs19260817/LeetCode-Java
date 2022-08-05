package Q0141_LinkedListCycle;

import Common.ListNode;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {

    private Solution solution;

    @BeforeMethod
    public void setUp() throws Exception {
        this.solution = new Solution();
    }

    @DataProvider(name = "examples")
    public Object[][] data() {
        return new Object[][]{
                new Object[]{new int[]{3, 2, 0, -4}, 1, true},
                new Object[]{new int[]{1, 2}, 0, true},
                new Object[]{new int[]{1, 2}, -1, false},
                new Object[]{new int[]{1}, -1, false},
        };
    }

    @Test(dataProvider = "examples")
    public void testHasCycle(int[] array, int pos, boolean expect) {
        boolean actual = solution.hasCycle(ListNode.createListFromArray(array, pos));
        assertEquals(actual, expect);
    }
}