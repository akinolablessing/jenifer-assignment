package main.java.com.semicolon.africa.model;

public class FlyableMenu {
    public static void main(String[] args){
    Flyable flyable = new Spacecraft();
    Flyable flyable1 = new Airplane();
    Flyable flyable2 = new Helicopter();
    flyable.flyObj();
    flyable1.flyObj();
    flyable2.flyObj();

    System.out.println("OR");
    Flyable[] flyables = {new Spacecraft(), new Airplane(), new Helicopter()};
    for(Flyable fly : flyables){
       fly.flyObj();
    }
    }
}
