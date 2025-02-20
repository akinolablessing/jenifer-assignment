package main.java.com.semicolon.africa.model;

public class SportMain {
    public static void main(String[] args){

        Sport sport = new Sport();
        Football football = new Football();
        Basketball basketball = new Basketball();
        Rugby rugby = new Rugby();

        sport.play();
        football.play();
        basketball.play();
        rugby.play();
    }
}
