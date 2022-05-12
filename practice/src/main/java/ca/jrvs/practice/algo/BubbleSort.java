package ca.jrvs.practice.algo;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {

  public void bubbleSort(int[] ints){

    // flag for the sorted items
    int sorted=ints.length;

    // i = the postion of items that are sorted

    for (int i=sorted-1; i > 0; i--){
    // j starts at the beginning of the array all the way up to i (sorted flag)
      for (int j=0; j < i; j++ ){
        //if j > j+1 we swap,
        if (ints[j]>ints[j+1]){
          swap(ints,j,j+1);
        }
        // after all items are swapped the sorted position goes down by one
        // and the loop is executed once again
      }
    }

  }


  // basic swap using a temp value
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

    Arrays.stream(ints).forEach(System.out::println);
    BubbleSort bubbleSort = new BubbleSort();
    System.out.println("==");
    bubbleSort.bubbleSort(ints);
    Arrays.stream(ints).forEach(System.out::println);
  }

}
