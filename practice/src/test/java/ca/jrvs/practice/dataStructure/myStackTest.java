package ca.jrvs.practice.dataStructure;

import static org.junit.Assert.*;

import org.junit.Test;

public class myStackTest {

  @Test
  public void testPush() {

    myStack myStack = new myStack();
    myStack.push(0);
    myStack.push(1);
    myStack.push(2);
    myStack.push(3);
    myStack.push(4);
    assertEquals("myStack{queue1=[0, 1, 2, 3, 4]}", myStack.toString());
  }

  @Test
  public void testIsEmpty() {

    myStack myStack = new myStack();
    myStack.push(0);
    myStack.push(1);
    myStack.push(2);
    myStack.push(3);
    myStack.push(4);

    assertEquals(false, myStack.isEmpty());
  }

  @Test
  public void testPop() {
    myStack myStack = new myStack();
    myStack.push(0);
    myStack.push(1);
    myStack.push(2);
    myStack.push(3);
    myStack.push(4);

    assertEquals(false,myStack.isEmpty());
    assertEquals(4, myStack.pop());
    assertEquals(3, myStack.pop());
    assertEquals(2, myStack.pop());
    assertEquals(1, myStack.pop());
    assertEquals(0, myStack.pop());
    assertEquals(true,myStack.isEmpty());

  }

  @Test
  public void testPeek() {
    myStack myStack = new myStack();
    myStack.push(0);
    myStack.push(1);
    myStack.push(2);
    myStack.push(3);
    myStack.push(4);
    assertEquals(4, myStack.peek());
    assertNotEquals(3,myStack.peek());

  }
}