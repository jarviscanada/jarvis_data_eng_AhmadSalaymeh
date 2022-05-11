package ca.jrvs.practice.dataStructure;

import ca.jrvs.practice.dataStructure.Graph.Vertex;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.ArrayList;

class SandBox {

  // Your program begins with a call to Main().
  public static void main(String args[]) {

    ArrayList elementData = new ArrayList<>();

    elementData.add(1);
    elementData.add(2);

    int oldCapacity = elementData.size();
    int newCapacity = oldCapacity + (oldCapacity >> 1);

    System.out.println(newCapacity);

  }
}
