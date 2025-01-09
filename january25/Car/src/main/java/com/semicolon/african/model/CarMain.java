package main.java.com.semicolon.african.model;

public class CarMain {
    public static void main(String[] args){

        Car car = new Car();
            car.setMake("Camry");
            car.setModel("Carrera");
            car.setDoors(20);
            car.setConvertible(true);
            car.setColor("Black");

        System.out.println("Make: "+car.getMake());
        System.out.println("Model:"+car.getModel());
        System.out.println("Color:"+car.getColor());
        System.out.println("Convertible:"+car.isConvertible());

       car.describeCar();
    }
}
