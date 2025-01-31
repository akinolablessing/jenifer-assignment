package main.java.com.semicolon.africa.model;

public class Dog {
    private String name;
    private String breed;
    private String color;

   public Dog(String name, String breed, String color) {
        this.name = name;
        this.breed = breed;
        this.color = color;
    }
    public String getName() {
        return name;
    }
    public String getBreed() {
        return breed;
    }
    public String getColor() {
        return color;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
