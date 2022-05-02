package ca.jrvs.practice.codingChallenge;



import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.junit.Test;

public class BinarySearchTest {

  @Test
  public void binarySearchRecursion() {
    BinarySearch binarySearch = new BinarySearch();
    List<Integer> list = new ArrayList<Integer>();
    list.add(1);
    list.add(6);
    list.add(10);
    list.add(15);
    list.add(32);
    list.add(120);

    assertEquals(Optional.of(2).get(), binarySearch.binarySearchIteration(list,10));
    assertEquals(Optional.of(-1).get(), binarySearch.binarySearchIteration(list,100));


  }

  @Test
  public void binarySearchIteration() {
    BinarySearch binarySearch = new BinarySearch();
    List<Integer> list = new ArrayList<Integer>();
    list.add(1);
    list.add(6);
    list.add(10);
    list.add(15);
    list.add(32);
    list.add(120);
    assertEquals(Optional.of(2).get(), binarySearch.binarySearchRecursion(list,10));
    assertEquals(Optional.of(-1).get(), binarySearch.binarySearchRecursion(list,100));
  }
}