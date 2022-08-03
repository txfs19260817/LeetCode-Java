package Q0242_ValidAnagram;

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
                new Object[]{"anagram", "nagaram", true},
                new Object[]{"rat", "car", false},
                new Object[]{"rat", "", false},
        };
    }

    @Test(dataProvider = "examples")
    public void testIsAnagram(String s, String t, boolean expect) {
        boolean actual = solution.isAnagram(s, t);
        assertEquals(expect, actual);
    }
}