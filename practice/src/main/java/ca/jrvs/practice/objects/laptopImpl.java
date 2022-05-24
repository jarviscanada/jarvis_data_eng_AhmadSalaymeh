package ca.jrvs.practice.objects;

public class laptopImpl extends laptop {

  private int price;
  @Override
  public void setPrice(int price) {
    this.price = price;
  }
  public String toString(){
    return (super.getName()+" "+this.price);
  }
}
