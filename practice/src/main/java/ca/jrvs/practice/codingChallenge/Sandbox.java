package ca.jrvs.practice.codingChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Sandbox {

  public static void main(String[] args) {
    Answers answers = new Answers();

    int[] ints = {0,1,2,3,4,5,6,7,8,9,10};

    List<Integer> list = new ArrayList<>();

    for(int i: ints){
      list.add(i);
    }

    list.stream().forEach(i->{
      if(i%2==0){
        System.out.println(i);
      }
    });
    
  


  }

}
