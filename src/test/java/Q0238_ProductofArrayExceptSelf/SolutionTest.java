package Q0238_ProductofArrayExceptSelf;

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
                new Object[]{new int[]{1, 2, 3, 4}, new int[]{24, 12, 8, 6}},
                new Object[]{new int[]{-1, 1, 0, -3, 3}, new int[]{0, 0, 9, 0, 0}},
        };
    }

    @Test(dataProvider = "examples")
    public void testProductExceptSelf(int[] nums, int[] expect) {
        var actual = solution.productExceptSelf(nums);
        assertEquals(expect, actual);
    }
}