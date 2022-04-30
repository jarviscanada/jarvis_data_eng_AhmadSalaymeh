package ca.jrvs.practice.codingChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sandbox {

  public static void main(String[] args) {

    Integer[] ints = new Integer[5];
    List<Integer> list = new ArrayList<>();

    for (int i=0; i < 5; i++){
      list.add(i);
    }

    ints = list.toArray(new Integer[0]);

    Arrays.stream(ints).forEach(System.out::println);
  }

}
