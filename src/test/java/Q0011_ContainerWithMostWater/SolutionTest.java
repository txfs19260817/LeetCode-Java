package Q0011_ContainerWithMostWater;

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
                new Object[]{new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}, 49},
                new Object[]{new int[]{1, 1}, 1},
        };
    }

    @Test(dataProvider = "examples")
    public void testMaxArea(int[] nums, int expect) {
        var actual = solution.maxArea(nums);
        assertEquals(expect, actual);
    }
}