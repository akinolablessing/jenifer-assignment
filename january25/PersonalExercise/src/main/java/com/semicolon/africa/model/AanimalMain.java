package main.java.com.semicolon.africa.model;

public class AanimalMain {
    public static void main(String[] args){
        Aanimal aanimal = new Aanimal();
        Lion lion = new Lion();
        Tiger tiger = new Tiger();
        Panther panther = new Panther();

        aanimal.eat();
        lion.eat();
        tiger.eat();
        panther.eat();
        aanimal.sound();
        lion.sound();
        tiger.sound();
        panther.sound();
    }
}
