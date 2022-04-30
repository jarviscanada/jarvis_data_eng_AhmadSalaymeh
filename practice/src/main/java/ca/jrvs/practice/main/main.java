package ca.jrvs.practice.main;

import ca.jrvs.practice.objects.Bike;
import ca.jrvs.practice.codingChallenge.*;
import java.util.Arrays;

public class main {

  public static void main(String[] args) {

    Answers answers = new Answers();

    String[] strings = {"()","{()}","{)[){]",")("};

    for(int i =0; i < strings.length; i++){
      System.out.println(answers.validParentheses(strings[i]));
    }

  }

}
