package main.java.com.semicolon.africa.model;

public class MotherDaughterMenu {
    public static void main(String[] args){
        Mother mother = new Mother("mom","cooking",5,"Dark","yellow","brilliant");
         allDoings(mother,"Dance");
         Daughter daughter = new Daughter();
         allDoings(daughter,"Coding");
    }
    public static void allDoings(Mother mother,String behave){
       mother.motherBehaviour(behave);
       mother.howManyFingers();
       mother.intelligent();
       mother.setComplextion();
       System.out.println(mother);
       System.out.println("____________________");
    }
}
