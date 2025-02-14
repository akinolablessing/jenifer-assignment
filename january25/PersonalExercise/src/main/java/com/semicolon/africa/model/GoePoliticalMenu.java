package main.java.com.semicolon.africa.model;

import java.util.Scanner;

public class GoePoliticalMenu {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

      System.out.println("Enter the state name");
      String stateName = scanner.nextLine();

    for(GeoPolitical states : GeoPolitical.values()){
     //System.out.println(states);
        for (String state : states.stateOne){
            //System.out.println(state);
            if(stateName.equalsIgnoreCase(state)){
              System.out.println("Your geo political zone is "+states);
            }
        }
    }

     }
}
