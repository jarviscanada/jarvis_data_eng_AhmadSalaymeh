package ca.jrvs.practice.objects;

public class carimp implements car{

  private int price;
  private String car;
  @Override
  public void pirce(int price){
    this.price = price;
  }

  @Override
  public String getCar(String car) {
    this.car= car;
    return this.car;
  }
}
