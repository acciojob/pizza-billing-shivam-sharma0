//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompil
package com.driver;

public class Main {
  public Main() {
  }

  public static void main(String[] args) {
    DeluxePizza dp = new DeluxePizza(false);
    System.out.println(dp.getPrice());
    dp.addTakeaway();
    dp.addExtraCheese();
    dp.addTakeaway();
    System.out.println(dp.getBill());
    Pizza p = new Pizza(false);
    p.addExtraCheese();
    p.addExtraToppings();
    p.addTakeaway();
    System.out.println(p.getBill());
  }
}
