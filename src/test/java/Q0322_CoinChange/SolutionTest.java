package Q0322_CoinChange;

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
                new Object[]{new int[]{1, 2, 5}, 11, 3},
                new Object[]{new int[]{2}, 3, -1},
                new Object[]{new int[]{1}, 0, 0},
        };
    }

    @Test(dataProvider = "examples")
    public void testCoinChange(int[] coins, int amount, int expect) {
        var actual = solution.coinChange(coins, amount);
        assertEquals(expect, actual);
    }
}