package main.java.com.semicolon.africa.model;

public class RectangleTwo {
    private double length;
    private double width;

    public RectangleTwo(double length, double width){
       this.length = length;
       this.width = width;
    }


    public double getArea(){
      return length * width;
    }
}
