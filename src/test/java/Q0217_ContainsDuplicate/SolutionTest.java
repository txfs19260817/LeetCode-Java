package Q0217_ContainsDuplicate;

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
                new Object[]{new int[]{1, 2, 3}, false},
                new Object[]{new int[]{1, 2, 3, 1}, true},
        };
    }

    @Test(dataProvider = "examples")
    public void testContainsDuplicate(int[] nums, boolean expect) {
        var actual = solution.containsDuplicate(nums);
        assertEquals(expect, actual);
    }
}