package main.java.com.semicolon.africa.model;

public class Rectangle {
    private int width;
    private int height;
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;

    }
    public double getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public double getArea() {
        return  this.width * height;
    }
    public double getPerimeter() {
        return  (this.width + this.height);
    }
}
