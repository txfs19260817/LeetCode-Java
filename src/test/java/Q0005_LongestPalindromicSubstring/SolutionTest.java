package Q0005_LongestPalindromicSubstring;

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
                new Object[]{"babad", "bab"},
                new Object[]{"a", "a"},
                new Object[]{"aa", "aa"},
        };
    }

    @Test(dataProvider = "examples")
    public void testLongestPalindrome(String s, String expect) {
        var actual = solution.longestPalindrome(s);
        assertEquals(expect, actual);
    }
}