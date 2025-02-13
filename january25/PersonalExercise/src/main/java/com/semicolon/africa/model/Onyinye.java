package main.java.com.semicolon.africa.model;

public class Onyinye {
    private String animal;
    private int head;
    private String car;
    private int pinCode;
    private String complex;

    public Onyinye(String animal, int head, String car, int pinCode , String complex){
        this.animal = animal;
        this.head = head;
        this.car = car;
        this.pinCode = pinCode;
        this.complex = complex;
    }
    public Onyinye(String animal, int head, String car, int pinCode){
      this("Goat",5,"Lux",1234,"Dark");
    }
    public Onyinye(String animal, int head, String car){
        this("Goat",5,"Lux",1234,null);
    }
    public Onyinye(String animal, int head) {
     this("Goat",5,"Lux");
    }
    public Onyinye(String animal) {
        this("Goat",5,null);
    }
    public Onyinye() {
        this("Goat");
    }
}