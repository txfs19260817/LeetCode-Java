package Q0020_ValidParentheses;

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
                new Object[]{"()", true},
                new Object[]{"()[]{}", true},
                new Object[]{"(]", false},
                new Object[]{"]", false},
        };
    }

    @Test(dataProvider = "examples")
    public void testIsValid(String s, boolean expect) {
        boolean actual = solution.isValid(s);
        assertEquals(expect, actual);
    }
}