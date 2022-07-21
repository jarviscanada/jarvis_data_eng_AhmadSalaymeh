package ca.jrvs.practice.dataStructure;

import java.util.LinkedList;
import java.util.Stack;

public class myQueue {

  private Stack<Integer> stack1 = new Stack<>();
  private Stack<Integer> stack2 = new Stack<>();

  /**
   * add's an item to the queue
   * @param item
   */
  public void add(int item){
    this.stack1.push(item);
  }

  /**
   * check if the queue is empty
   * @return boolean
   *
   */

  public boolean empty(){
    return this.stack1.isEmpty();
  }


  public int remove(){

    this.swap(this.stack1,this.stack2);
    int temp = this.stack2.pop();
    this.swap(this.stack2,this.stack1);
    return temp;
  }

  public int peek(){
    this.swap(this.stack1,this.stack2);
    int temp = this.stack2.pop();
    this.stack2.push(temp);
    this.swap(this.stack2,this.stack1);

    return temp;
  }

  private void swap (Stack stack1, Stack stack2){
    while(stack1.isEmpty()==false && stack1.peek()!=null){
      stack2.push(stack1.pop());
    }
  }


  @Override
  public String toString() {
    return "myQueue{" +
        "stack1=" + stack1 +
        '}';
  }
}
