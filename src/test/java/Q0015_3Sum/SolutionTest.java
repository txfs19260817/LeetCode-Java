package Q0015_3Sum;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

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
                new Object[]{new int[]{-1, 0, 1, 2, -1, -4}, List.of(List.of(-1, -1, 2), List.of(-1, 0, 1))},
                new Object[]{new int[]{-1, -1, -1, 2}, List.of(List.of(-1, -1, 2))},
                new Object[]{new int[]{-100, -100, 0, 0, 0, 0, 1, 1, 2}, List.of(List.of(0, 0, 0))},
        };
    }

    @Test(dataProvider = "examples")
    public void testThreeSum(int[] nums, List<List<Integer>> expect) {
        var actual = solution.threeSum(nums);
        assertEquals(expect, actual);
    }
}