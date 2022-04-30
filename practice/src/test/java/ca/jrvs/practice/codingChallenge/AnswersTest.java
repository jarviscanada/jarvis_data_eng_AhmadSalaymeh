package ca.jrvs.practice.codingChallenge;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnswersTest {

  @Test
  public void checkValidParentheses() {
    Answers answers = new Answers();

    assertEquals(true,answers.validParentheses("()"));
    assertEquals(true,answers.validParentheses("{()}"));
    assertEquals(true,answers.validParentheses("[]{}()"));
    assertEquals(false,answers.validParentheses(")("));
    assertEquals(false,answers.validParentheses("{)"));
    assertEquals(false,answers.validParentheses("{]{]()"));

  }

  @Test
  public void twoSum() {
    Answers answers = new Answers();

    assertArrayEquals(new int[]{1,2}, answers.twoSum(new int[]{1,5,3,6},8));
    assertArrayEquals(new int[]{0,2}, answers.twoSum(new int[]{5,5,3,6},8));
    assertArrayEquals(null, answers.twoSum(new int[]{5,5,3,6},60));
  }
}