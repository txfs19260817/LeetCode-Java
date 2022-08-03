package Q0704_BinarySearch;

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
                new Object[]{new int[]{-1, 0, 3, 5, 9, 12}, 9, 4},
                new Object[]{new int[]{-1, 0, 3, 5, 9, 12}, 2, -1},
        };
    }

    @Test(dataProvider = "examples")
    public void testSearch(int[] nums, int target, int expect) {
        int actual = solution.search(nums, target);
        assertEquals(expect, actual);
    }
}