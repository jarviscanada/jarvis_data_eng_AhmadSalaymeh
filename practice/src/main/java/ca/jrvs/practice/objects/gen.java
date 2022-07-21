package ca.jrvs.practice.objects;

public class gen <T>{



  private T t;

  public void set(T t){
    this.t = t;
  }
  @Override
  public String toString() {

    return "gen{" +
        "t=" + t +
        '}';
  }

}
