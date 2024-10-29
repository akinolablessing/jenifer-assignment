import java.util.Random;
import java.util.Scanner;
  public class RandomNumber{
    public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);
      int random = new Random().nextInt(200);

    
       while(true){
        System.out.print("Guess a number between 1 and 200:");
        int guess = scanner.nextInt();
    
       System.out.printf("Randm %d%n",random);
       if (guess > random){
         System.out.println("Too high, try again!!");
        }
       if (guess < random){
         System.out.println("Too low, try again!!");
        } 
      if (guess == random){
        System.out.println("You are correct!!");
       }
     }
    }
  }