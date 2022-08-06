package Q0070_ClimbingStairs;

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
                new Object[]{2, 2},
                new Object[]{3, 3},
                new Object[]{43, 701408733},
        };
    }

    @Test(dataProvider = "examples")
    public void testClimbStairs(int n, int expect) {
        var actual = solution.climbStairs(n);
        assertEquals(expect, actual);
    }
}