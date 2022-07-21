package ca.jrvs.practice.algo;

import java.util.Arrays;
import java.util.Random;

public class InsertionSort {


  public void insertionSort(int[] ints){
    int length = ints.length;
    //we started with saying postion 0 is sorted, so i =1 (unsorted)
    for (int i=1; i<length; i++){
      // we hold a temp value of a[i] while we find the correct spot to insert it
      int key = ints[i];
      // j is set to the sorted section of the array which will use to compare and find
      // the correct sport for the key value, and shift the array to the right accordingly
      int j = i-1;

      while (j >= 0 && ints[j] > key){
        // this line is shifting the position of the sorted array to find a value
        // that is less than the key.
        ints[j+1]=ints[j];

        j=j-1;
      }
      // once found we shifted the sorted array the last postion of j either the start of the array
      // or has a value less than the key, we place it to the right of it.
      // process repeats until the array is sorted

      ints[j+1]=key;
    }
  }

  private void swap(int[] ints,int from, int to){
    int temp = ints[from];
    ints[from]=ints[to];
    ints[to]=temp;
  }

  public static void main(String[] args) {
    int[] ints = new int[5];
    Random random = new Random();
    for(int i=0; i<ints.length; i++){
      ints[i]= random.nextInt(10);
    }

    InsertionSort insertionSort = new InsertionSort();

    Arrays.stream(ints).forEach(System.out::println);
    System.out.println("==After sort==");
    insertionSort.insertionSort(ints);
    Arrays.stream(ints).forEach(System.out::println);


  }
}
