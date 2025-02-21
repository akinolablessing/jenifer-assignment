package main.java.com.semicolon.africa.model;

public class AbstractCircle extends AbstractShape{

    private double radius;

    public AbstractCircle(double radius){
        this.radius = radius;
    }
    @Override
    public double calculateArea(){
     return Math.PI * radius * radius;
    }

    @Override
    double calculateParameter() {
        return 2 * Math.PI*radius*radius;
    }
}
