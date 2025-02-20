package main.java.com.semicolon.africa.model;

public class VehincleMain {
    public static void main(String[] args) {
        Vehincle car = new Car();
        Vehincle motor = new Motorcycle();


        startAndStopVencle(car);
        startAndStopVencle(motor);
    }
       public static void startAndStopVencle(Vehincle vehincle){
         vehincle.startEngine();
         vehincle.stopEngine();
    }
}
