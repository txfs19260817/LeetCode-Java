package Q0543_DiameterofBinaryTree;

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
                new Object[]{new Integer[]{1, 2, 3, 4, 5}, 3},
                new Object[]{new Integer[]{1, 2}, 1},
        };
    }

    @Test(dataProvider = "examples")
    public void testDiameterOfBinaryTree(Integer[] nums, int expect) {
        var actual = solution.diameterOfBinaryTree(TreeNode.fromArray(nums));
        assertEquals(expect, actual);
    }
}