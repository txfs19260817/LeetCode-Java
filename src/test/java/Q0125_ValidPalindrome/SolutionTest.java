package Q0125_ValidPalindrome;

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
                new Object[]{"A man, a plan, a canal: Panama", true},
                new Object[]{"race a car", false},
                new Object[]{"0P", false},
                new Object[]{" ", true},
        };
    }

    @Test(dataProvider = "examples")
    public void testIsPalindrome(String s, boolean expect) {
        boolean actual = solution.isPalindrome(s);
        assertEquals(expect, actual);
    }
}