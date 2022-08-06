package Q0383_RansomNote;

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
                new Object[]{"a", "b", false},
                new Object[]{"aa", "ab", false},
                new Object[]{"aa", "aab", true},
        };
    }

    @Test(dataProvider = "examples")
    public void testCanConstruct(String ransomNote, String magazine, boolean expect) {
        var actual = solution.canConstruct(ransomNote, magazine);
        assertEquals(expect, actual);
    }
}