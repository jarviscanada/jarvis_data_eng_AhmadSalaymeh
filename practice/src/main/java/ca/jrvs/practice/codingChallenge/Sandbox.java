package ca.jrvs.practice.codingChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Sandbox {

  public static void main(String[] args) {

    BinarySearch binarySearch = new BinarySearch();

    List<Integer> list = new ArrayList<Integer>();

    list.add(1);
    list.add(6);
    list.add(10);
    list.add(15);
    list.add(32);
    list.add(120);

    System.out.println(binarySearch.binarySearchIteration(list,6));
    System.out.println(binarySearch.binarySearchRecursion(list,10));


  }

}
