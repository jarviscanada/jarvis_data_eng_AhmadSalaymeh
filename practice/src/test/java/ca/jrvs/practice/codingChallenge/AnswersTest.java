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
}