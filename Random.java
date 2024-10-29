import java.util.Random;
import java.util.Scanner;
   public class Random{
      public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int random = new Random().nextInt(200);

        System.out.print("Guess a number between 1 and 200:");
        int guess = scanner.nextInt();

      while(true){
      if (guess > random){
       System.out.print("Too high, try again!!");
      }
      if (guess < random){
       System.out.print("Too low, try again!!");
    }
    if (guess == random){
      System.out.print("You are correct!!");
    }
   }
  }
 }