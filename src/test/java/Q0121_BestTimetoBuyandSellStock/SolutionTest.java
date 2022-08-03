package Q0121_BestTimetoBuyandSellStock;

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
                new Object[]{new int[]{7, 1, 5, 3, 6, 4}, 5},
                new Object[]{new int[]{7, 6, 4, 3, 1}, 0},
        };
    }

    @Test(dataProvider = "examples")
    public void testMaxProfit(int[] prices, int expect) {
        int actual = solution.maxProfit(prices);
        assertEquals(expect, actual);
    }
}