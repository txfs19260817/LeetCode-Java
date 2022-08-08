package Q0057_InsertInterval;

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
                new Object[]{new int[][]{{1, 3}, {6, 9}}, new int[]{2, 5}, new int[][]{{1, 5}, {6, 9}}},
        };
    }

    @Test(dataProvider = "examples")
    public void testInsert(int[][] intervals, int[] newInterval, int[][] expect) {
        var actual = solution.insert(intervals, newInterval);
        assertEquals(expect, actual);
    }
}