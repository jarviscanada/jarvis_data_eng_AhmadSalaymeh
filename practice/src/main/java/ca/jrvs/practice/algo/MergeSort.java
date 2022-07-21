package ca.jrvs.practice.algo;

import java.util.Arrays;
import java.util.Random;

public class MergeSort {

  public void mergesort(int[] ints){
    int[] helper = new int[ints.length];
    mergesort(ints,helper,0,ints.length-1);
  }
  private void mergesort(int[] ints,int[] helper, int low, int high){
    if(low < high){
      int mid = low + (high-low)/2;
      mergesort(ints,helper,0,mid);
      mergesort(ints,helper,mid+1,high);
      merge(ints,helper,low,mid,high);
    }
  }
  private void merge(int[] ints, int[] helper, int low, int mid, int high){
    // copying both halves into the helper array
    for (int i = low; i<=high; i++){
      helper[i]=ints[i];
    }
    int helperLeft = low;
    int helperRight = mid+1;
    int current = low;

    /**
     * iterate through the helper array. compare left and right
     * copying back the smaller elements from the two halves
     * into the original array
     */
    while (helperLeft<=mid && helperRight<=high){
      if(helper[helperLeft] <= helper[helperRight]){
        ints[current]=helper[helperLeft];
        helperLeft++;
      }else{
        ints[current]=helper[helperRight];
        helperRight++;
      }
      current++;
    }
    int remaining = mid - helperLeft;
    for(int i = 0; i<=remaining; i++){
      ints[current+i] = helper[helperLeft+i];
    }

  }


  public static void main(String[] args) {
    MergeSort mergeSort = new MergeSort();
    int[] ints = {9,3,7,5,6,4,8,2};
//    Random random = new Random();
//    for(int i=0; i<ints.length; i++){
//      ints[i]= random.nextInt(25);
//    }

    Arrays.stream(ints).forEach(System.out::println);
    System.out.println("==After sort==");
    mergeSort.mergesort(ints);
    Arrays.stream(ints).forEach(System.out::println);

  }
}
