package Q0226_InvertBinaryTree;

import Common.TreeNode;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class SolutionTest {

    @DataProvider(name = "examples")
    public Object[][] data() {
        return new Object[][]{
                new Object[]{new Integer[]{4, 2, 7, 1, 3, 6, 9}, new Integer[]{4, 7, 2, 9, 6, 3, 1}},
                new Object[]{new Integer[]{2, 1, 3}, new Integer[]{2, 3, 1}},
                new Object[]{new Integer[]{}, new Integer[]{}},
        };
    }

    @Test(dataProvider = "examples")
    public void testInvertTree(Integer[] root, Integer[] expectArray) {
        TreeNode actual = new Solution().invertTree(TreeNode.fromArray(root));
        TreeNode expect = TreeNode.fromArray(expectArray);
        assertTrue(TreeNode.isSameTree(expect, actual));
    }
}