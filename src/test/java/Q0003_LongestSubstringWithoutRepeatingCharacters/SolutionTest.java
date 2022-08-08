package Q0003_LongestSubstringWithoutRepeatingCharacters;

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
                new Object[]{"abcabcbb", 3},
                new Object[]{"bbbbb", 1},
                new Object[]{"pwwkew", 3},
                new Object[]{"tmmzuxt", 5},
        };
    }

    @Test(dataProvider = "examples")
    public void testLengthOfLongestSubstring(String s, int expect) {
        var actual = solution.lengthOfLongestSubstring(s);
        assertEquals(expect, actual);
    }

    @Test(dataProvider = "examples")
    public void testLengthOfLongestSubstring2(String s, int expect) {
        var actual = solution.lengthOfLongestSubstring2(s);
        assertEquals(expect, actual);
    }
}