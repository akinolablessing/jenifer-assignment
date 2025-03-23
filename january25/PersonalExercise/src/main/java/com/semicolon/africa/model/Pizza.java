package main.java.com.semicolon.africa.model;

public class Pizza implements Food{
    @Override
    public void cook() {
        System.out.println("I can cook Pizza");
    }

    @Override
    public void sell() {
        System.out.println("I can sell Pizza");
    }
}
