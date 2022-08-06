package Q0278_FirstBadVersion;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
    @DataProvider(name = "examples")
    public Object[][] data() {
        return new Object[][]{
                new Object[]{4, 5},
                new Object[]{5, 5},
        };
    }

    @Test(dataProvider = "examples")
    public void testFirstBadVersion(int expectedBadVersion, int totalVersions) {
        Solution badVersion = new Solution() {
            @Override
            public boolean isBadVersion(int version) {
                return version >= expectedBadVersion;
            }
        };

        int firstBadVersion = badVersion.firstBadVersion(totalVersions);
        assertEquals(expectedBadVersion, firstBadVersion);
    }
}