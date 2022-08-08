package Q0973_KClosestPointstoOrigin;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Comparator;

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
                new Object[]{new int[][]{{0, 1}, {1, 0}}, 2, new int[][]{{0, 1}, {1, 0}}},
                new Object[]{new int[][]{{1, 3}, {-2, 2}}, 1, new int[][]{{-2, 2}}},
                new Object[]{new int[][]{{3, 3}, {5, -1}, {-2, 4}}, 2, new int[][]{{3, 3}, {-2, 4}}},
        };
    }

    @Test(dataProvider = "examples")
    public void testKClosest(int[][] points, int k, int[][] expect) {
        int[][] actual = solution.kClosest(points, k);
        Arrays.sort(actual, Comparator.comparingInt(a -> a[0]));
        Arrays.sort(expect, Comparator.comparingInt(a -> a[0]));
        assertEquals(expect, actual);
    }
}