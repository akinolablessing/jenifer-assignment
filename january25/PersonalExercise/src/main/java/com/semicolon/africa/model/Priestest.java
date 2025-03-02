package main.java.com.semicolon.africa.model;

public class Priestest extends Semicolon{

    private String name;

    public Priestest(String name) {
        this.name = name;
    }

    @Override
    String codingClass() {
        return "my name is "+name+"we code different kind of code base on your capacity";
    }

    @Override
    String designThinkingClass() {
        return "we make alot of research and experiment";
    }

    @Override
    String industrialDesign() {
        return "we think and design alot";
    }

    @Override
    String exercise() {
        return "every friday";
    }
}
