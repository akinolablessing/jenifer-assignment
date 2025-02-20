package main.java.com.semicolon.africa.model;

public class Car extends Vehincle{

    @Override
    public void startEngine(){
       System.out.println("Car start with key");
    }
    @Override
    public void stopEngine(){
        System.out.println("Car stop with key");
    }
}
