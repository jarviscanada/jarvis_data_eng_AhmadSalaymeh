package ca.jrvs.practice.codingChallenge;

import java.util.HashMap;
import java.util.Stack;

public class MidtermPrep implements midtermInterface {

    @Override
    public boolean validParentheses(String s) {
        // TODO Auto-generated method stub

        HashMap <Character,Character> hashMap= new HashMap<>();
        hashMap.put(')', '(');
        hashMap.put(']', '[');
        hashMap.put('}','{');
        Stack<Character> stack = new Stack<>();

        for (char bracket : s.toCharArray()){

            if(stack.empty()!=true && hashMap.containsKey(bracket) && hashMap.get(bracket)==stack.peek()){
                stack.pop();
            }else{
                stack.push(bracket);
            }
  
        }

        return stack.empty();
    }

    @Override
    public int[] twoSum(int[] nums, int target) {
        // TODO Auto-generated method stub

        int[] ans=new int[2];
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                    return ans;
                }
            }
        }


        return null;
    }

    public int[] twoSumHashMap(int[] nums, int target){

        HashMap<Integer,Integer> hashMap = new HashMap<>();
        int[] ans=new int[2];

        for(int i=0; i<nums.length; i++){
            int diff = target - nums[i];
            if(hashMap.containsKey(diff)){
                ans[0]=hashMap.get(diff);
                ans[1]=i;
                return ans;
            }else{
                hashMap.put(nums[i], i);
            }
        }


        return null;
    }

    @Override
    public int removeDuplicates(int[] nums) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int findDuplicateSort(int[] nums) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int findDuplicateSet(int[] nums) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean validPalindromPointer(String s) {
        // TODO Auto-generated method stub

        int left =0;
        int right = s.length()-1;

        while(left<right){
            while(left<right && checkAlphaNumeric(s.charAt(left)) == false){
                left++;
            }
            while(right>left && checkAlphaNumeric(s.charAt(right)) == false){
                right--;
            }

            if(Character.toUpperCase(s.charAt(left))!=Character.toUpperCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;

        }

        return true;
    }

    @Override
    public boolean validPalindromRecursion(String string) {
        // TODO Auto-generated method stub
        return false;
    }

    private boolean checkAlphaNumeric(char c){
        return Character.isLetterOrDigit(c);
    }

    @Override
    public boolean containsDuplicate(int[] nums) {
        // TODO Auto-generated method stub

        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for (int i=0; i<nums.length; i++){
            if(hashMap.containsValue(nums[i])){
                return true;
            }else{
                hashMap.put(i, nums[i]);
            }

        }


        return false;
    }

    @Override
    public void mergeIntuition(int[] nums1, int m, int[] nums2, int n) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean rotateString(String s, String goal) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean validAnagram(String s, String t) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public ListNode remove(ListNode head, int n) {
        // TODO Auto-generated method stub
        return null;
    }
    
    


}
