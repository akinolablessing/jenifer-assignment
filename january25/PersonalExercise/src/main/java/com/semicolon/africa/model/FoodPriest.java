package main.java.com.semicolon.africa.model;

public class FoodPriest extends Semicolon{
    private String name;
    private String food;
    public FoodPriest(String name, String food){
       this.name = name;
       this.food = food;
    }

    @Override
    String codingClass() {
        return "my name is "+name+"blaaaa";
    }

    @Override
    String designThinkingClass() {
        return "blaaaaaaaa";
    }

    @Override
    String industrialDesign() {
        return "blaaaaaa";
    }

    @Override
    String exercise() {
        return "blaaaaaaaaaaaaaa";
    }
}
