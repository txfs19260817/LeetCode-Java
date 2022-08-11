package Q0199_BinaryTreeRightSideView;

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
                new Object[]{new Integer[]{3, 9, 20, null, null, 15, 7}, new Integer[]{3, 20, 7}},
                new Object[]{new Integer[]{1}, new Integer[]{1}},
                new Object[]{new Integer[]{}, new Integer[]{}},
        };
    }

    @Test(dataProvider = "examples")
    public void testRightSideView(Integer[] rootArray, Integer[] expect) {
        Integer[] actual = solution.rightSideView(TreeNode.fromArray(rootArray)).toArray(new Integer[0]);
        assertEquals(expect, actual);
    }
}