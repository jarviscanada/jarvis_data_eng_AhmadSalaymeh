package ca.jrvs.practice.algo;

import java.util.Arrays;

public class QuickSort {

  public void quickSort(int[] ints,int start,int end){
    //first we grab the intial index/pivot point, to sort the array
    int index = partition(ints,start,end);

    // this will focus on the left side of the array
    // any number < than the first index of the first partition of the array
    if(start < index-1){
      quickSort(ints,start,index-1);
    }
    // this will focus on the right side of the array
    // any number > than the first index of the first partition of the array
    if(index<end){
      quickSort(ints,index,end);
    }


  }
  private int partition(int[] ints,int start,int end){
    //we will grab the middle number of the array to use as our pivot point
    int pivot = ints[start+(end-start)/2];
    // once the start cross the end we reached the end of the swapping
    while(start <= end){
      // start will increase as we look for a number that is greater than the pivot
      while(ints[start]<pivot){
        start++;
      }
      // end will decrease as we look for a number that is less than the pivot
      while (ints[end]>pivot){
        end--;
      }
      // once we find such numbers and the start is not crossing the end
      // we will swap the two numbers and increase start position and decrease the end position
      if(start<=end){
        int temp = ints[start];
        ints[start]=ints[end];
        ints[end]=temp;
        start++;
        end--;
      }
    }
    // returning the new start position that will be used for the next call.

    return start;
  }

  public static void main(String[] args) {
    int[] ints={1,10,5,8,16};

    QuickSort quickSort = new QuickSort();
    Arrays.stream(ints).forEach(System.out::println);
    System.out.println("==After sort==");
    quickSort.quickSort(ints,0,ints.length-1);
    Arrays.stream(ints).forEach(System.out::println);

  }
}
