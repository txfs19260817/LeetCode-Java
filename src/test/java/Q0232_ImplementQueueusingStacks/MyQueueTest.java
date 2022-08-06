package Q0232_ImplementQueueusingStacks;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MyQueueTest {
    @Test
    public void testMyQueue() {
        MyQueue myqueue = new MyQueue();
        assertTrue(myqueue.empty());
        myqueue.push(1);
        assertFalse(myqueue.empty());
        myqueue.push(3);
        assertEquals(1, myqueue.peek());
        myqueue.pop();
        assertEquals(3, myqueue.peek());
        assertFalse(myqueue.empty());
        myqueue.pop();
        assertTrue(myqueue.empty());
    }

    @Test
    public void testMyQueue1() {
        System.out.println("run test for MyQueue");
        MyQueue q = new MyQueue();
        assertTrue(q.empty());
        q.push(1);
        q.push(2);
        q.push(3);
        assertEquals(1, q.pop());
        assertFalse(q.empty());
        assertEquals(2, q.pop());
        assertEquals(3, q.pop());
        assertTrue(q.empty());
    }
}