package Q0542_01Matrix;

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
                {new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}}, new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}}},
                {new int[][]{{0, 0, 0}, {0, 1, 0}, {1, 1, 1}}, new int[][]{{0, 0, 0}, {0, 1, 0}, {1, 2, 1}}}
        };
    }

    @Test(dataProvider = "examples")
    public void testUpdateMatrix(int[][] in, int[][] expect) {
        var actual = solution.updateMatrix(in);
        assertEquals(expect, actual);
    }
}