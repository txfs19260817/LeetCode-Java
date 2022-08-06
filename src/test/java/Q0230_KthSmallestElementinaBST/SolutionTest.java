package Q0230_KthSmallestElementinaBST;

import Common.TreeNode;
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
                new Object[]{new Integer[]{3, 1, 4, null, 2}, 1, 1},
                new Object[]{new Integer[]{5, 3, 6, 2, 4, null, null, 1}, 3, 3},
        };
    }

    @Test(dataProvider = "examples")
    public void testKthSmallest(Integer[] nums, int k, int expect) {
        var actual = solution.kthSmallest(TreeNode.fromArray(nums), k);
        assertEquals(expect, actual);
    }
}