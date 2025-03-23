package main.java.com.semicolon.africa.model;

public class Burger implements Food{
    @Override
    public void cook() {
        System.out.println("I can cook Burger");
    }

    @Override
    public void sell() {
        System.out.println("I can sell Burger");
    }
}
