package ca.jrvs.practice.codingChallenge;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class BinarySearch{

//
//  /**
//   * find the target index in a sorted array
//   *
//   * @param arr input array is sorted
//   * @param target value to be serached
//   * @return target index or Optional.empty() if no found
//   */
//
//  public <E> Optional<Integer> binarySearchRecursion(E[] arr, E target){
//    return Optional.empty();
//  }
//
//  /**
//   * find the target index in a sorted array
//   *
//   * @param arr input array is sorted
//   * @param target value to be searched
//   * @return target index or Optional.empty() if not found
//   */
//  public <E> Optional <Integer> binarySearchIteration(E[] arr, E target) {
//    return Optional.empty();
//  }


  public Integer binarySearchRecursion(List<Integer>list,Integer target){

    // calls a recursive function to the helper method,
    return this.binarySearchHelper(list,target,0,list.size()-1);
  }

  private int binarySearchHelper(List<Integer>list, Integer target,int left, int right){

    //base case: if the left pointer is greater than right,
    // that means the target was not found and we need to
    // end the recursion and return -1
    if (left > right){
      return -1;
    }
    int middle = Math.floorDiv(right+left,2);
    //FIRST CALL
    //==========
    // left = 0
    // right = 5
    // middle = 2
    // e.g [1,6,10,15,32,120] target = 6

    //SECOND CALL
    //==========
    // left = 0
    // right = 1
    // middle = 1/2 = 0
    // [1,6]
    // list[0] = 1 < 6

    //THIRD CALL
    //==========
    //left=1
    //right=1
    //middle = 1+1/2 = 1
    //list[1] = 6

    if(list.get(middle)<target){
      //SECOND CALL
      //==========
      // left=0 + 1
      // we call the recursive function with the updated pointers
      // [1,6] -> [6]
      return this.binarySearchHelper(list,target,middle+1,right);

    }else if (list.get(middle)>target){
      //FIRST CALL
      //==========
      // list[2] = 10 > 6
      // left = 0
      // right = 2 -1
      // we call the recursive function with the updated pointers
      // [1,6,10,15,32,120] -> [1,6,10]

      return this.binarySearchHelper(list,target,left,middle-1);


    //THIRD CALL
    //==========
    // because list[middle] = 6 that means its neither greater then or less target
    // and our left pointer did not pass the right
    // we found the index and we can return it as such
    // middle = 1
    }else{
      return middle;
    }

  }
  public Integer binarySearchIteration(List<Integer> list, Integer target){

    int left = 0;
    int right = list.size()-1;
    int middle;

    //this checks to see if the left pointer is located below the right pointer
    // if left> right that means we reached the end of the array and could not find
    // the target
    while (left <= right){
      // grab the middle of the array
      middle = Math.floorDiv(right+left,2);

      // if the middle is less then the target
      // the right becomes the middle -1
      // e.g [1,6,10,15,32,120] target = 6
      // left = 0
      // right = 5
      // middle = 2 = arr[3]=10 > 6

      if (list.get(middle) > target){

        // right = 2 -1
        right= middle -1;
      }
      // e.g [1,6,10,15,32,120] target = 6
      // [1,6]
      // left = 0
      // right = 1
      // middle = 0 = arr[0]= 1 < 6

      else if(list.get(middle) < target){
        // left = 0+1
        left = middle +1;


      //left = 1
      // right =1
      // middle = 1+1 / 2 = 1 arr[1] = 6 == 6
      // if its not less and not greater then target that means we found the number.
      // return the index of the number
      }else{
        return middle;
      }


    }
    // if the left pointer passes the right that means we did not find the target value
    // return -1
    return -1;

  }
}
