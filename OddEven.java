import java.util.Scanner;
import java.util.Arrays;

 public class OddEven{
  public static void main(String[] args){
   Scanner scanner = new Scanner(System.in);

   int[] number = new int[5];
   for(int count=0; count<number.length; count++){
    System.out.print("Enter a number:");
    number[count] = scanner.nextInt();

    if(number[count] %2==0){
     System.out.println("True");
    }
    if(number[count] %2!=0){
      System.out.println("False");
    }
    
  }
  
 }

}