package ca.jrvs.practice.objects;

public  class Animal {

  public static String string = "hello class";

  public int value = 10;

  public Animal(){
    System.out.println("Animal constructor");
  }

  public int getValue() {
    return value;
  }

  public static void show(){
    System.out.println("i belong to the class");
  }
  final public void fShow(){
    System.out.println("Cant change me");
  }
  final public void fShow (int i){System.out.println("Cant change me"+i);}
}
