package Q0042_TrappingRainWater;

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
                new Object[]{new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}, 6},
                new Object[]{new int[]{4, 2, 0, 3, 2, 5}, 9},
        };
    }

    @Test(dataProvider = "examples")
    public void testTrap(int[] height, int expect) {
        var actual = solution.trap(height);
        assertEquals(expect, actual);
    }
}