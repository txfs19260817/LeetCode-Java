package Q0200_NumberofIslands;

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
                new Object[]{new char[][]{{'1', '1', '1', '1', '0'}, {'1', '1', '0', '1', '0'}, {'1', '1', '0', '0', '0'}, {'0', '0', '0', '0', '0'}}, 1},
                new Object[]{new char[][]{{'1', '1', '0', '0', '0'}, {'1', '1', '0', '0', '0'}, {'0', '0', '1', '0', '0'}, {'0', '0', '0', '1', '1'}}, 3},
        };
    }

    @Test(dataProvider = "examples")
    public void testNumIslands(char[][] grid, int expect) {
        var actual = solution.numIslands(grid);
        assertEquals(expect, actual);
    }
}