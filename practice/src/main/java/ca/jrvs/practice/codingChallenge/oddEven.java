package ca.jrvs.practice.codingChallenge;

public class oddEven {

  /**
   * This method takes an int (num) and checks if the number
   * is odd or even
   *
   * Big-O O(1)
   *
   * @param num
   * @return String (odd or even)
   */
  public String checkOddEven(int num){
    if (num % 2 ==0){
      return "even";
    }
    return "odd";
  }

}
