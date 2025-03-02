package main.java.com.semicolon.africa.model;


public class Priest extends Semicolon{
    private String name;

    public Priest(String name){
       this.name = name;
    }

    @Override
    String codingClass() {
        return "My name is "+name+"we are learning java,python,javaScript here.";
    }

    @Override
    String designThinkingClass() {
        return "We do alot of research";
    }

    @Override
    String industrialDesign() {
        return "We think alot";
    }

    @Override
    String exercise() {
        return "we do excercise every friday";
    }
}
