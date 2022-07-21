package ca.jrvs.practice.main;

import ca.jrvs.practice.dataStructure.*;
import ca.jrvs.practice.objects.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

  @FunctionalInterface
  public interface ABC {
    void a();

  }

  public static void main(String[] args) {

    List<Integer> integerList = new ArrayList<>();
    Animal animal = new Animal();

    integerList.add(1);
    integerList.add(2);
    integerList.add(3);

    ABC a = () -> {
      System.out.println("here");
    };
    a.a();
    integerList.stream().map(i -> i * 2).forEach(System.out::println);
    integerList.stream().forEach(System.out::println);
    animal.fShow(1);

    laptopImpl laptop = new laptopImpl();
    car car1 = new carimp();
    laptop.setName("apple");
    laptop.setPrice(1234);
    System.out.println(laptop.toString());
    System.out.println(car1.getCar("honda"));

    gen<car> gen = new gen<>();

    gen.set(car1);
    System.out.println(gen);
    Object obj = car1;
    System.out.println(obj.toString());
  }
}
