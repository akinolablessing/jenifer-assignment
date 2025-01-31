package main.java.com.semicolon.africa.model;

public class DogMainMenu {
    public static void main(String[] args) {
        Dog firstDog = new Dog("Poppy","boullDog","Black");
        Dog secondDog = new Dog("Sinky","LocalDog","Brown");

        System.out.println(firstDog.getName()+" is a "+firstDog.getBreed()+" it has "+firstDog.getColor()+ "Color");
        System.out.println(secondDog.getName()+ " is a "+secondDog.getBreed()+" it has "+secondDog.getColor()+ "Color");

        System.out.println("Let update it~~~~~~~~~~~~~~~~~~~");
        firstDog.setColor("BrownBlack");
        secondDog.setColor("FlashGreen");
        firstDog.setBreed("ForeignDog");
        secondDog.setBreed("BushDog");
        firstDog.setName("Christian");
        secondDog.setName("Esther");

        System.out.println(firstDog.getName()+" is a "+firstDog.getBreed()+" it has "+firstDog.getColor()+ " Color");
        System.out.println(secondDog.getName()+ " is a "+secondDog.getBreed()+" it has "+secondDog.getColor()+ " Color");
    }

}
