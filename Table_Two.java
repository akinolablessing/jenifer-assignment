import java.util.Scanner;
   public class Table_Two{
     public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);

     System.out.print("Input number of terms:");
     int number = scanner.nextInt();

     for (int index=0; index<=5; index++){
     int multiply = number*index;
     System.out.printf("%d * %d = %d%n",number,i,multiply);
   }
  }
 }