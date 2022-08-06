package Q0104_MaximumDepthofBinaryTree;

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
                new Object[]{new Integer[]{3, 9, 20, null, null, 15, 7}, 3},
                new Object[]{new Integer[]{1, null, 2}, 2},
                new Object[]{new Integer[]{}, 0},
        };
    }

    @Test(dataProvider = "examples")
    public void testMaxDepth(Integer[] rootArray, int expect) {
        var actual = solution.maxDepth(TreeNode.fromArray(rootArray));
        assertEquals(expect, actual);
    }
}