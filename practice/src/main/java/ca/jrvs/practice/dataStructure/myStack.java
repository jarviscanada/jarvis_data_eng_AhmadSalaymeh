package ca.jrvs.practice.dataStructure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Collectors;

public class myStack {

  //created two queues using linkedList
  Queue<Integer>queue1 = new LinkedList<>();
  Queue<Integer>queue2 = new LinkedList<>();

  //created a temp used for swaping only
  Queue<Integer> queue;

  /**
   * push items into the stack,Last In First Out (LIFO)
   * @param item
   */
  public void push(int item){
    this.queue1.add(item);
  }

  /**
   * check if the stack is empty
   *
   * @return boolean
   */
  public boolean isEmpty(){
    return this.queue1.size()==0;
  }

  /**
   * removes the last element in the stack and returns it
   *
   * @return int
   */
  public int pop(){
    while(this.queue1.size()!=1){
      this.queue2.add(this.queue1.remove());
    }
    int temp = this.queue1.remove();
    this.swap();
    return temp;
  }

  /**
   *  returns the last element in the stack but does not remove it
   * @return int
   */
  public int peek(){
    while(this.queue1.size()!=1){
      this.queue2.add(this.queue1.remove());
    }

    int temp = this.queue1.remove();
    this.swap();
    this.queue1.add(temp);
    return temp;
  }

  /**
   * swaps queue2 and queue 1 when ever we loop through queue1
   *
   */

  private void swap(){
    this.queue = this.queue2;
    this.queue2 = this.queue1;
    this.queue1 = this.queue;

  }

  
  @Override
  public String toString() {
    return "myStack{" +
        "queue1=" + queue1 +
        '}';
  }

}
