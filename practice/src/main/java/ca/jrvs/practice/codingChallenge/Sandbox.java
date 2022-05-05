package ca.jrvs.practice.codingChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Sandbox {

  public static void main(String[] args) {
    Answers answers = new Answers();

    int[] ints = {0,0,1,1,1,2,2,3,3,4};

    for(int i=0; i<ints.length;i++){
      System.out.print(ints[i]+" ");
    };
    System.out.println("\n");

    System.out.println("===========");
    System.out.println(answers.removeDuplicates(ints));
    System.out.println("===========");
    System.out.println("\n");
    for(int i=0; i<ints.length;i++){
      System.out.print(ints[i]+" ");
    };


  }

}
