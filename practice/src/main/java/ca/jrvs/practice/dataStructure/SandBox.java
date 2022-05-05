package ca.jrvs.practice.dataStructure;

import ca.jrvs.practice.dataStructure.Graph.Vertex;
import java.util.LinkedList;

class SandBox {

  // Your program begins with a call to Main().
  public static void main(String args[]) {
    AbstractDataType adt = AbstractDataType.valueOf(true);
    System.out.println(adt.getEnd());
    System.out.println(adt.subString(2,4).charAt(0));
    System.out.println(adt.getA());


  }
}
