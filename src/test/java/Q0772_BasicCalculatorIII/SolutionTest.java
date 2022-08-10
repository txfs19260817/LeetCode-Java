package Q0772_BasicCalculatorIII;

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
                new Object[]{"3+2*2", 7},
                new Object[]{"2*(5+5*2)/3+(6/2+8)", 21},
                new Object[]{" 3+5 / 2 ", 5},
        };
    }

    @Test(dataProvider = "examples")
    public void testCalculate(String s, int expect) {
        var actual = solution.calculate(s);
        assertEquals(expect, actual);
    }
}