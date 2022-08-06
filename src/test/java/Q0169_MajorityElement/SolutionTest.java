package Q0169_MajorityElement;

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
                new Object[]{new int[]{3, 2, 3}, 3},
                new Object[]{new int[]{2, 2, 1, 1, 1, 2, 2}, 2},
        };
    }

    @Test(dataProvider = "examples")
    public void testMajorityElement(int[] nums, int expect) {
        var actual = solution.majorityElement(nums);
        assertEquals(expect, actual);
    }
}