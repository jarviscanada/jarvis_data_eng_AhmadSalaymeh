package ca.jrvs.practice.dataStructure;

public class AbstractDataType {
  private char[] a;
  private int start;
  private int end;

  public char[] getA() {
    return a;
  }

  public int getStart() {
    return start;
  }

  public int getEnd() {
    return end;
  }


  public static AbstractDataType valueOf(boolean b){
    AbstractDataType adt = new AbstractDataType();
    adt.a = b ? new char[] {'t','r','u','e'} : new char[] {'f','a','l','s','e'};
    adt.start=0;
    adt.end=adt.a.length;
    return adt;
  }

  public int length(){
    return this.end - this.start;
  }
  public char charAt(int i){
    return this.a[this.start+i];
  }
  public AbstractDataType subString (int start,int end){
    AbstractDataType that = new AbstractDataType();
    that.a = this.a;
    that.start = this.start + start;
    that.end = this.start + end;
    return that;
  }



}
