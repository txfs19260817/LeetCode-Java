package Q0102_BinaryTreeLevelOrderTraversal;

import Common.TreeNode;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

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
                new Object[]{new Integer[]{3, 9, 20, null, null, 15, 7}, new Integer[][]{{3}, {9, 20}, {15, 7}}},
                new Object[]{new Integer[]{1}, new Integer[][]{{1}}},
                new Object[]{new Integer[]{}, new Integer[][]{}},
        };
    }

    @Test(dataProvider = "examples")
    public void testLevelOrder(Integer[] rootArray, Integer[][] expect) {
        List<List<Integer>> actualList = solution.levelOrder(TreeNode.fromArray(rootArray));
        var actual = actualList.stream().map(l -> l.toArray(Integer[]::new)).toArray(Integer[][]::new);
        assertEquals(expect, actual);
    }
}