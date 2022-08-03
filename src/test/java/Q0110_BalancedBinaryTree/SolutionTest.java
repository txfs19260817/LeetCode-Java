package Q0110_BalancedBinaryTree;

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
                new Object[]{new Integer[]{3, 9, 20, null, null, 15, 7}, true},
                new Object[]{new Integer[]{1, 2, 2, 3, 3, null, null, 4, 4}, false},
                new Object[]{new Integer[]{}, true},
        };
    }

    @Test(dataProvider = "examples")
    public void testIsBalanced(Integer[] rootArray, boolean expect) {
        TreeNode root = TreeNode.fromArray(rootArray);
        boolean actual = solution.isBalanced(root);
        assertEquals(expect, actual);
    }
}