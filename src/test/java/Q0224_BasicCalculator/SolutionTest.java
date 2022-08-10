package Q0224_BasicCalculator;

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
                new Object[]{"1 + 1", 2},
                new Object[]{" 2-1 + 2 ", 3},
                new Object[]{"1-(-2)", 3},
                new Object[]{"(1+(4+5+2)-3)+(6+8)", 23},
        };
    }

    @Test(dataProvider = "examples")
    public void testCalculate(String s, int expect) {
        var actual = solution.calculate(s);
        assertEquals(expect, actual);
    }
}