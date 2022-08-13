package Q0155_MinStack;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MinStackTest {
    @Test
    public void testMinStack() {
        MinStack m = new MinStack();
        m.push(0);
        m.push(1);
        m.push(0);
        assertEquals(m.getMin(), 0);
        m.pop();
        assertEquals(m.getMin(), 0);
    }
}