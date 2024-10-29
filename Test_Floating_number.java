import java.util.Scanner;
  public class Test_Floating_number{
   public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter first floating-point number:");
    float number = scanner.nextFloat();

    System.out.print("Enter second floating-point number:");
    float second_number = scanner.nextFloat();

   if (number==second_number){
      System.out.print("They are the same");
   }
   else if (number!=second_number){
      System.out.print("They are different");
   }
  }
 }
