package ca.jrvs.practice.codingChallenge;

import java.util.HashMap;
import java.util.Stack;

public class Answers {

  /**
   * Given a string s containing just the characters (){}[]
   * deterime if the input string is valid
   *
   * open brackets must be closed by the same type of  brackets
   * open brackets must be closed in the correct order
   *
   * Big-O: O(n)
   *
   *
   *
   * @param s
   * @return
   */

  public boolean validParentheses(String s){


    //I created a hashMap to get the matching pair whenever we encounter a closing bracket
    HashMap<Character,Character> hashMap = new HashMap<>();

    hashMap.put(')','(');
    hashMap.put('}', '{');
    hashMap.put(']','[');

    // myStack will be used to push opening brackets into the myStack and pop when ever we get a closing bracket that has the matching pair
    Stack<Character> stack = new Stack<>();

    // convert the S to an array of characters in order to get each single character in the string
    for (char ch: s.toCharArray()){
      // check if the myStack is not empty,
      // check if the current character is a closing bracket
      // if it is grab the value from the hashmap (opening bracket) and see if it matches the last item in the myStack
      // if it does pop, else push charcter into the myStack
      if(stack.empty()!=true && hashMap.containsKey(ch) && hashMap.get(ch)==stack.peek()){
        stack.pop();
      }else{
        stack.push(ch);
      }
    }

    //return true if the myStack is empty else false
    return stack.empty();
  }

}
