package Q0438_FindAllAnagramsinaString;

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
                new Object[]{"cbaebabacd", "abc", new int[]{0, 6}},
                new Object[]{"abab", "ab", new int[]{0, 1, 2}},
        };
    }

    @Test(dataProvider = "examples")
    public void testFindAnagrams(String s, String p, int[] expect) {
        var actual = solution.findAnagrams(s, p);
        assertEquals(expect, actual.stream().mapToInt(i -> i).toArray());
    }
}