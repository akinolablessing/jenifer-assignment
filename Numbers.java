import java.util.Scanner;
  public class Numbers{
   public static void main(String[] args){
   Scanner scanner = new Scanner(System.in);

     int number = 0;
     int number1 = 0;
     String ques ="";

     do{
     System.out.print("Enter first number:");
     number = scanner.nextInt();
     System.out.print("Enter second number:");
     number1 = scanner.nextInt();

     int sum = number + number1; 
     System.out.printf("The sum of the two number is:%d%n",sum);
     System.out.print("Would you like to perform the operation again?");
      ques = scanner.next();

   }while(ques.equals("yes"));

  }
 }