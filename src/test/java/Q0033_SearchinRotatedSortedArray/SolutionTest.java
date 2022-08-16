package Q0033_SearchinRotatedSortedArray;

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
                new Object[]{new int[]{4, 5, 6, 7, 0, 1, 2}, 0, 4},
                new Object[]{new int[]{4, 5, 6, 7, 0, 1, 2}, 3, -1},
                new Object[]{new int[]{1}, 0, -1},
                new Object[]{new int[]{1, 3, 5}, 1, 0},
        };
    }

    @Test(dataProvider = "examples")
    public void testSearch(int[] nums, int target, int expect) {
        var actual = solution.search(nums, target);
        assertEquals(expect, actual);
    }
}