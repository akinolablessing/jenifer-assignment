package main.java.com.semicolon.africa.model;

public class AbstractMain {
    public static void main(String[] args){
        double r = 4.0;
        AbstractCircle abstractCircle = new AbstractCircle(5.8);
        AbstractTriangle abstractTriangle = new AbstractTriangle(6.1,5.0,1.3);

        System.out.println("The area of a circle is: "+abstractCircle.calculateArea());
        System.out.println("The parameter of a circle is: "+abstractCircle.calculateParameter());
        System.out.println("The area of a Triangle is : "+abstractTriangle.calculateArea());
        System.out.println("The parameter of a Triangle is: "+ abstractTriangle.calculateParameter());
    }

}
