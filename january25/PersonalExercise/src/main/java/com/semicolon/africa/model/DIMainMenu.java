package main.java.com.semicolon.africa.model;

public class DIMainMenu {
    public static void main(String[] args){
        DIEngine engine = new DIEngine();
        DICar car = new DICar(engine);
        System.out.println(car.start());
        System.out.println(car.stop());
    }
}
