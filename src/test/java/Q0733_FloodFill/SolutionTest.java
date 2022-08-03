package Q0733_FloodFill;

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
                new Object[]{new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 0, 1}}, 1, 1, 2, new int[][]{{2, 2, 2}, {2, 2, 0}, {2, 0, 1}}},
                new Object[]{new int[][]{{0, 0, 0}, {0, 0, 0}}, 0, 0, 0, new int[][]{{0, 0, 0}, {0, 0, 0}}},
        };
    }

    @Test(dataProvider = "examples")
    public void testFloodFill(int[][] image, int sr, int sc, int color, int[][] expect) {
        int[][] actual = solution.floodFill(image, sr, sc, color);
        assertEquals(expect, actual);
    }
}