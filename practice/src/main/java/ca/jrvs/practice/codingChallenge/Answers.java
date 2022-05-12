package ca.jrvs.practice.codingChallenge;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicBoolean;

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


  /**
   * takes an array of ints and checks if there are two unique numbers
   * that add up ot target
   *
   * @param nums
   * @param target
   * @return an array of ints which has the index of the two numbers that add to target
   */
  public int[] twoSum(int[] nums, int target){
    int[] ans= new int[2];

    for(int i=0; i < nums.length -1; i++){
      for (int j=i+1; j<nums.length; j++){
        if (nums[i]+nums[j] == target){
          ans[0]=i;
          ans[1]=j;
          return ans;
        }
      }
    }
    return null;
  }


  /**
   * takes an array of ints and returns a the amount of unique items in the array
   * replaces all duplicats with unique values from the array
   * @param nums
   * @return
   */
  public int removeDuplicates(int[] nums){

    // this pointer is used to keep track of our last unique poistion
    int left=0;

    //the right pointer will be used to find unique values
    // and replaces them with the last known unique position +1
    for(int right=1;right<nums.length;right++){
      if(nums[left]!=nums[right]){
        nums[left+1]=nums[right];
        left++;
      }
    }
    return left+1;

  }

  /**
   *
   * @param nums
   * @return
   */

  public int findDuplicateSort(int[]nums){
    // sort the array so that we only need to find the first occurce of a dublict number
    Arrays.sort(nums);
    for(int i=0; i<nums.length-1;i++){
      // loop through the array
      if(nums[i]==nums[i+1]){
        // if we find two numbers that are the same return the number and end the loop
        return nums[i+1];
      }
    }
    //return -1 if all numbers are unique
    return -1;
  }


  public int findDuplicateSet(int[]  nums){
    // set can only have unique numbers
    Set<Integer> set = new HashSet<Integer>();

    for(int i: nums){
      // if number is already in the set return the number
      if(set.contains(i)){
        return i;
      }
      // add the number to the set
      set.add(i);
    }
    // return -1 if all numbers are unique
    return -1;
  }


  public <K,V> boolean compareMaps(Map<K,V> m1, Map<K,V>m2){
    // instinct approach
    AtomicBoolean flagValues = new AtomicBoolean(false);
    AtomicBoolean flagKeys = new AtomicBoolean(false);
    m1.values().stream().forEach((v1)-> flagValues.set(m2.containsValue(v1)));
    m1.keySet().stream().forEach((k1)->flagKeys.set(m2.containsKey(k1)));

    return flagValues.get() && flagKeys.get();
  }
  public <K,V> boolean compareMapsEquals(Map<K,V> m1, Map<K,V>m2){
    return m1.equals(m2);
  }


  /**
   *
   * @param string
   * @return
   */
  public boolean validPalindromPointer(String string){
    int left=0;
    int right=string.length()-1;

    while(left<right){
      while(left<right && this.palindromHelper(string.charAt(left))==false){
        left++;
      }
      while(left<right && this.palindromHelper(string.charAt(right))==false){
        right--;
      }
      if (Character.toUpperCase(string.charAt(left))!=Character.toUpperCase(string.charAt(right))){
        return false;
      }
      left++;
      right--;
    }
    return true;
  }

  public boolean validPalindromRecursion(String string){

    // calls the recursive call
    return palindromRecursion(string,0,string.length()-1);
  }

  private boolean palindromRecursion(String string, int left, int right){
    // the left pointer passes the right that means we reached the middle and the string is a palindrom
    if (left>right){
      return true;
    }
    // keep going left until we find a letter or number in the string
    if(left<right && palindromHelper(string.charAt(left))==false){
      return palindromRecursion(string,left+1,right);
    }
    // keep going right until we find a letter or number in the string
    if(right>left && palindromHelper(string.charAt(right))==false){
      return palindromRecursion(string,left,right-1);
    }
    // if both left and right are a letter or number check if they are the same if not return false
    if(Character.toUpperCase(string.charAt(left))!=Character.toUpperCase(string.charAt(right))){
     return false;
    }
    //if both left and right the same go to the next two characters in the string
    return palindromRecursion(string,left+1,right-1);
  }

  private boolean palindromHelper(char c){
    return Character.isLetterOrDigit(c);
  }













}
