package Q0236_LowestCommonAncestorofaBinaryTree;

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
                new Object[]{new Integer[]{6, 2, 8, 0, 4, 7, 9, null, null, 3, 5}, 2, 8, 6},
                new Object[]{new Integer[]{6, 2, 8, 0, 4, 7, 9, null, null, 3, 5}, 2, 4, 2},
                new Object[]{new Integer[]{2, 1}, 2, 1, 2},
        };
    }

    @Test(dataProvider = "examples")
    public void testLowestCommonAncestor(Integer[] rootArray, int p, int q, int expectValue) {
        TreeNode root = TreeNode.fromArray(rootArray);
        TreeNode expect = TreeNode.findByValue(root, expectValue);
        TreeNode actual = solution.lowestCommonAncestor(root, TreeNode.findByValue(root, p), TreeNode.findByValue(root, q));
        assertEquals(expect, actual);
    }
}