package Q0001_TwoSum;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static java.util.Arrays.sort;
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
                new Object[]{new int[]{2, 7, 11, 15}, 9, new int[]{0, 1}},
                new Object[]{new int[]{3, 3}, 6, new int[]{0, 1}},
                new Object[]{new int[]{3, 5}, 6, new int[]{}}
        };
    }

    @Test(dataProvider = "examples")
    public void testTwoSum(int[] nums, int target, int[] expect) {
        int[] actual = solution.twoSum(nums, target);
        sort(expect);
        sort(actual);
        assertEquals(expect, actual);
    }
}