package Q0133_CloneGraph;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class SolutionTest {

    private Solution solution;

    @BeforeMethod
    public void setUp() throws Exception {
        this.solution = new Solution();
    }

    @Test()
    public void testCloneGraph() {
        Node node1 = new Node(1, new ArrayList<>());
        Node node2 = new Node(2, new ArrayList<>());
        Node node3 = new Node(3, new ArrayList<>());
        Node node4 = new Node(4, new ArrayList<>());

        node1.neighbors.add(node2);
        node1.neighbors.add(node4);
        node2.neighbors.add(node1);
        node2.neighbors.add(node3);
        node3.neighbors.add(node2);
        node3.neighbors.add(node4);
        node4.neighbors.add(node1);
        node4.neighbors.add(node3);
        var actual = solution.cloneGraph(node1);
        assertEquals(node1.val, actual.val);
        assertEquals(node1.neighbors.stream().map(n -> n.val).sorted().toArray(), actual.neighbors.stream().map(n -> n.val).sorted().toArray());
        assertNotEquals(node1.hashCode(), actual.hashCode());
    }
}