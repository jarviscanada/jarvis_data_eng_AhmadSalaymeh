package ca.jrvs.practice.DynamicProgramming;

import java.util.HashMap;
import java.util.Map;

public class DynamicQnA {

  private Map<Integer, Integer> cache = new HashMap<Integer,Integer>(){{
    put(0,0);
    put(1,1);
  }};
  public int fib(int n){
    if (n==0){
      return 0;
    }
    if(n==1){
      return 1;
    }
    return fib(n-1)+fib(n-2);
  }

  public int fibDP(int n){
    if(cache.containsKey(n)){
      return cache.get(n);
    }
    cache.put(n,fibDP(n-1)+fibDP(n-2));
    return cache.get(n);
  }
  public int climbStairs(int n){

    return climbStairsHelper(0,n);
  }
  private int climbStairsHelper(int start, int n){

    if (start>n){
      return 0;
    }
    if (start==n){
      return 1;
    }

    return climbStairsHelper(start+1,n)+climbStairsHelper(start+2,n);
  }

  public int climbStairsDP(int n){

    int one = 1;
    int two = 1;
    for (int i=0; i<n-1; i++){
      int temp = one;
      one=one+two;
      two=temp;
    }
    return one;
  }

  public static void main(String[] args) {
    DynamicQnA dynamicQnA = new DynamicQnA();
    System.out.println(dynamicQnA.fibDP(44));
  }

}
