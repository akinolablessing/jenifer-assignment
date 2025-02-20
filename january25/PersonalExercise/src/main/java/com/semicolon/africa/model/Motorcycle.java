package main.java.com.semicolon.africa.model;

public class Motorcycle extends Vehincle {

    @Override
    public void startEngine(){
      System.out.println("Motor start with turtle");
    }
    public void stopEngine(){
      System.out.println("\"Motorcycle engine stopped when ignition was turned off.");
    }
}
