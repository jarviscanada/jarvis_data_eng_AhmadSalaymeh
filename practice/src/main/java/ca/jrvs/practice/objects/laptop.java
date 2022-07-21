package ca.jrvs.practice.objects;

public abstract class laptop {

  private String name;
  public void setName(String name){
    this.name = name;
  }
  public String getName(){
    return this.name;
  }
  public abstract void setPrice(int price);
}
