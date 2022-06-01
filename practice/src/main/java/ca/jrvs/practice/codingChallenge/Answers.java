package ca.jrvs.practice.codingChallenge;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
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

  public int myAtoi(String s) {


    int index = 0;
    int result = 0;
    int MIN_INT = -2147483648;
    int MAX_INT = 2147483647;
    boolean isNegative = false;

    //if string is empty return 0
    if (s.length() == 0) {
      return 0;
    }
    //skipping white spaces
    while (index < s.length() && s.charAt(index) == ' ') {
      index++;
    }
    //getting to check weather or not the first non-space character is a - or +
    if (index < s.length()) {
      if (s.charAt(index) == '-') {
        isNegative = true;
        index++;
      } else if (s.charAt(index) == '+') {
        index++;
      }
    }
    // iterate the string until we reach a non-digit number
    while (index < s.length() && Character.isDigit(s.charAt(index))) {
      // subtract ascii number of character by the 0 ascii number
      // 4 = 52
      // 0 = 48
      // digit = 52 - 48 = 4
      int digit = s.charAt(index) - '0';


      // we are ensuring that the number is avoiding any integer overflow
      // by max_int/10 -> 9 digit (2147483647 -> 214748364)
      // if result were to be 214748365 and add a 0 to produce 2147483650
      // this result is now grater then 2147483650 > 214748364 && 2147483647 which will result in a integer overflow
      // So before we add the last integer we should just return the max_int value.
      // digit 7 means that if we are adding the last integer (result=214748364) and it was 8 which produces 21474836478 that will result in a overflow
      // so we will return the MAX_INT instead.
      if (result > MAX_INT/10 || (result == MAX_INT/10 && digit > 7)) {
        // if negative is true, result is a negative number else its positive
        return isNegative ? MIN_INT : MAX_INT;
      }

      // adding the digits in their correct location
      result = (result * 10) + digit;
      index++;
    }

      // if negative is true, result is a negative number else its positive
      return isNegative ? -result : result;
    }




  public boolean containsDuplicate(int[] nums){

    HashMap<Integer,Integer> hashMap = new HashMap<>();

    for (int i=0; i<nums.length; i++){
      if(!hashMap.containsKey(nums[i])){
        hashMap.put(nums[i],1);
      }else {
        return true;
      }
    }
    return false;
  }

  public void mergeIntuition(int[] nums1, int m, int[] nums2, int n) {
    // brute force/intuition
    // find where the last 0 is in nums1 and set that number to the numbers in nums2
    // use the sort funciton to sort nums1 array
    int i=m;
    int j=0;
    while(i<m+n){
      if(nums1[m]==0){
        nums1[m]=nums2[j];
        j++;
      }
      i++;
  }
    Arrays.sort(nums1);
  }

  public void merge(int[]nums1,int m , int[] nums2, int n){
    // set the last pointer in nums1
    int lastIndex = m+n-1;

    // walk through both arrays
    while(m>0 && n>0){

      //if last number in nums1 is bigger then the last number in nums2
      // set the element in m-1 to the last place in nums1 and move the pointer m down by 1
      // else set the last element in nums1 to the element in nums2
      if (nums1[m-1]>nums2[n-1]){
        nums1[lastIndex]=nums1[m-1];
        m--;
      }else{
        nums1[lastIndex]=nums2[n-1];
        n--;
      }
      lastIndex--;
    }

    // any left-over number in nums2 will be added to nums1 at the start of nums1

    while (n>0){
      nums1[lastIndex]=nums2[n-1];
      n --;
      lastIndex--;
    }
  }
  public boolean rotateString(String s, String goal) {

    //because we are going to end in a circle as we keep shifitng, we can create a string where its pattern is repeated twice
    // this will have all the number of shifts that could occur and if the pattern of goal exists in this fullString we return true
    // else it will be false.
    String fullString = s +s;

    return (s.length()==goal.length()) &&fullString.contains(goal);

  }

  public boolean isDigit(String s){
    int i=0;
    while(i < s.length()){
      if(!Character.isDigit(s.charAt(i))){
        return false;
      }
      i++;
    }
    return true;
  }

  public boolean isDigitAscii(String s){
    int first='0';
    int last ='9';
    int i=0;
    while(i<s.length()){
      int asciiNumber=s.charAt(i);
      if((asciiNumber>=first && asciiNumber<=last)!=true){
        return false;
      }
      i++;
    }
    return true;
  }

  public boolean validAnagram(String s,String t){
    if(s.length()!=t.length()){
      return false;
    }
    char[] tempS= s.toCharArray();
    char[] tempT = t.toCharArray();
    Arrays.sort(tempS);
    Arrays.sort(tempT);

    return Arrays.equals(tempS,tempT);
  }

  public boolean validAnagramTable(String s,String t){
    if(s.length()!=t.length()){
      return false;
    }
    int[] table = new int[26];

    for(int i=0; i<s.length();i++){
      table[s.charAt(i) - 'a']++;
    }
    for (int i=0; i<t.length(); i++){
      table[t.charAt(i)-'a']--;
      if(table[t.charAt(i)-'a']<0){
        return false;
      }
    }

    return true;
  }
  public ListNode remove(ListNode head,int n){
    ListNode dummy = new ListNode(0,head);
    ListNode left = dummy;
    ListNode right = head;
    while(n>0 && right!=null){
      right=right.next;
      n-=1;
    }

    while(right!=null){
      left=left.next;
      right=right.next;
    }
    left.next=left.next.next;

    return dummy.next;
  }


  public int findLargest(int[] arr){

    int max=arr[0];
    for(int i=1; i<arr.length;i++){
      if(arr[i]>max){
        max=arr[i];
      }
    }
    return max;
  }

  public int findLargest(List<Integer> arr){

    return arr.stream().max(Comparator.comparing(Integer::valueOf)).get();
    
  }
  public int findLargestCollection(List<Integer> arr){
    return Collections.max(arr);
  }

  public int findSmallest(int[] arr){
    int min = arr[0];

    for(int i=1; i<arr.length;i++){
      if(arr[i]<min){
        min=arr[i];
      }
    }
    return min;
  }

  public int findSmallest(List<Integer> arr){
    return arr.stream().min(Comparator.comparing(Integer::valueOf)).get();
  }

  public int findSmallestCollection(List<Integer> arr){
    return Collections.min(arr);
  }


  public int removeElement(int[] nums, int val) {
        

    int i=0;
    

    for(int j=0; j< nums.length; j++){
        if(nums[j]!=val){
            nums[i]=nums[j];
            i++;
        }
    }
    return i;
    }


    public HashSet<Character> findDuplicateCharacters(String string){

      HashMap<Character,Integer> hashMap = new HashMap<>();
      HashSet<Character> chars = new HashSet<>();

      String temp = string.toLowerCase().replace(" ", "");

      for(int i=0; i<temp.length(); i++){
        if(hashMap.containsKey(temp.charAt(i))){
          chars.add(temp.charAt(i));
        }
        else{
          hashMap.put(temp.charAt(i), 1); 
        }
      }

      return chars;
    }
  
    public String printLetterWithNumber(String input){

      
  
      String str = "";

      for(int i=0; i < input.length();i++){
        if(input.charAt(i)>96){
          int value = input.charAt(i)-96;
          str = str + input.charAt(i) + value;
        }else{
          int value = input.charAt(i)-64+26;
          str = str + input.charAt(i) + value;
        }



        
   
      }

      return str;
    }

    public ListNode middleNode(ListNode head) {
        
      ListNode node = head;
      
      //grab the length of the array
      int index =1;
      while(node !=null){
          node = node.next;
          index++;
      }
      
      
      //grab the middle number, if its even add 1 to the middle number
      int middle = 0;
      if(index%2==0){
          middle = index/2;
      }else{
          middle = (index/2)+1;
      }
   

      // set the head to the middle index
      
      int nodeIndex = 1;
      while(head !=null && nodeIndex != middle){
          head=head.next;
          nodeIndex++;
      }
      
      return head;
      
  }

  public boolean hasCycle(ListNode head) {
        
    ListNode slow = head, fast = head;
    
    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
        if(slow == fast){
            return true;
        }
    }
    return false;
    
    
  }

  public ListNode reverseListItertive(ListNode head) {
        
    ListNode prev = null;
    ListNode curr = head;
    while (curr !=null){
        ListNode next = curr.next;
        curr.next = prev;
        prev=curr;
        curr= next;
    }
    return prev;
    
  }
  public int countPrimes(int n) {
        
    if(n<=2){
      return 0;
    }
    
    boolean[] primes = new boolean[n];
    
    int limit = (int)Math.sqrt(n);
    
    
    for(int i=2; i<=limit; i++){
        if(primes[i]==false){
            for(int j=i*i; j<n; j+=i){
              primes[j]=true;
            }
        }
    }
    
    int count=0;
    
    for(int i=2; i<n; i++){
        if(primes[i]==false){
            count++;
        }
    }

    return count;
    
}





}

