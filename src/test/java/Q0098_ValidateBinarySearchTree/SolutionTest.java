package Q0098_ValidateBinarySearchTree;

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
                new Object[]{new Integer[]{2, 1, 3}, true},
                new Object[]{new Integer[]{5, 1, 4, null, null, 3, 6}, false},
        };
    }

    @Test(dataProvider = "examples")
    public void testIsValidBST(Integer[] rootArray, boolean expect) {
        var actual = solution.isValidBST(TreeNode.fromArray(rootArray));
        assertEquals(expect, actual);
    }
}