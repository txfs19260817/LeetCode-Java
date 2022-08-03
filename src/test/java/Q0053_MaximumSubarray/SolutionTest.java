package Q0053_MaximumSubarray;

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
                new Object[]{new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}, 6},
                new Object[]{new int[]{1}, 1},
                new Object[]{new int[]{5, 4, -1, 7, 8}, 23},
        };
    }

    @Test(dataProvider = "examples")
    public void testMaxSubArray(int[] nums, int expect) {
        var actual = solution.maxSubArray(nums);
        assertEquals(expect, actual);
    }
}