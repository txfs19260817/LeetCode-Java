package Q0094_BinaryTreeInorderTraversal;

import Common.TreeNode;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

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
                new Object[]{new Integer[]{1, null, 2, 3}, List.of(1, 3, 2)},
                new Object[]{new Integer[]{}, new ArrayList<Integer>()},
        };
    }

    @Test(dataProvider = "examples")
    public void testInorderTraversal(Integer[] rootArray, List<Integer> expect) {
        var actual = solution.inorderTraversal(TreeNode.fromArray(rootArray));
        assertEquals(expect, actual);
    }
}