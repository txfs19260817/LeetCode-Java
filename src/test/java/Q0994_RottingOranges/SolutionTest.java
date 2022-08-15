package Q0994_RottingOranges;

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
                new Object[]{new int[][]{{0}}, 0},
                new Object[]{new int[][]{{1}}, -1},
                new Object[]{new int[][]{{1, 2, 1, 1, 2, 1, 1}}, 2},
                new Object[]{new int[][]{{2, 1, 1}, {0, 1, 1}, {1, 0, 1}}, -1},
        };
    }

    @Test(dataProvider = "examples")
    public void testOrangesRotting(int[][] grid, int expect) {
        var actual = solution.orangesRotting(grid);
        assertEquals(expect, actual);
    }
}