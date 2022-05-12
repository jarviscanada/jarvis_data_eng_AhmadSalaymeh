package ca.jrvs.practice.dataStructure;

import static org.junit.Assert.*;

import org.junit.Test;

public class myQueueTest {

  @Test
  public void add() {
    myQueue queue = new myQueue();

    queue.add(1);
    queue.add(2);
    queue.add(3);

    assertEquals("myQueue{stack1=[1, 2, 3]}", queue.toString());
  }


  @Test
  public void empty() {
    myQueue queue = new myQueue();
    myQueue queue1 = new myQueue();
    queue.add(1);
    queue.add(2);
    queue.add(3);

    assertEquals(false, queue.empty());
    assertEquals(true, queue1.empty());
  }

  @Test
  public void remove() {
    myQueue queue = new myQueue();

    queue.add(1);
    queue.add(2);
    queue.add(3);
    assertEquals(1,queue.remove());
    assertEquals(2,queue.remove());
    assertEquals(3,queue.remove());

  }

  @Test
  public void peek() {
    myQueue queue = new myQueue();

    queue.add(1);
    queue.add(2);
    queue.add(3);
    assertEquals(1,queue.peek());
    assertEquals(1,queue.remove());
    assertEquals(2,queue.peek());


  }
}