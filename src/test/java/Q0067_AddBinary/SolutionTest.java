package Q0067_AddBinary;

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
                new Object[]{"11", "1", "100"},
                new Object[]{"1010", "1011", "10101"},
        };
    }

    @Test(dataProvider = "examples")
    public void testAddBinary(String a, String b, String expect) {
        var actual = solution.addBinary(a, b);
        assertEquals(expect, actual);
    }

    @Test(dataProvider = "examples")
    public void testAddBinary2(String a, String b, String expect) {
        var actual = solution.addBinary2(a, b);
        assertEquals(expect, actual);
    }
}