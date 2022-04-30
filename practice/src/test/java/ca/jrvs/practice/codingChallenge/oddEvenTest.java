package ca.jrvs.practice.codingChallenge;

import static org.junit.Assert.*;

import org.junit.Test;

public class oddEvenTest {

  @Test
  public void testCheckOddEven() {
    oddEven oddEven = new oddEven();
    assertEquals("even",oddEven.checkOddEven(2));
    assertEquals("odd",oddEven.checkOddEven(1));
  }
}