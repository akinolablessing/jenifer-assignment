package main.java.com.semicolon.africa.model;

public class AnimalIhrMain {
    public static void main(String[] args){
     AnimalUnderInheritance animalUnderInheritance = new AnimalUnderInheritance("Generic Animal","Huge",400);
     doAnimalStuff(animalUnderInheritance,"slow");
     DogA dogA = new DogA();
     doAnimalStuff(dogA,"fast");
    }
    public static void doAnimalStuff(AnimalUnderInheritance animalUnderInheritance , String speed){
      animalUnderInheritance.makeNoise();
      animalUnderInheritance.move(speed);
      System.out.println(animalUnderInheritance);
      System.out.println("_____");
    }
}
