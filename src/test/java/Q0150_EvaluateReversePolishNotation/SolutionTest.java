package Q0150_EvaluateReversePolishNotation;

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
                new Object[]{new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"}, 22},
                new Object[]{new String[]{"10", "5", "-"}, 5},
        };
    }

    @Test(dataProvider = "examples")
    public void testEvalRPN(String[] tokens, int expect) {
        var actual = solution.evalRPN(tokens);
        assertEquals(expect, actual);
    }
}