import java.util.Scanner;
import java.util.Arrays;

 public class LargestNum{
  public static void main(String[] args){
   Scanner scanner = new Scanner(System.in);

    int[] number = new int[1];
     int[] numberTwo = new int[1];

   for(int count=0; count<number.length; count++){
    System.out.print("Enter a number:");
    number[count] = scanner.nextInt();

   for(int index=0; index<number.length; index++){
    System.out.print("Enter a number:");
    numberTwo[index] = scanner.nextInt();


    if(number[count] > numberTwo[index]){
     System.out.printf("The largest number is %d",number[count]);
    }
    else if(number[count] < numberTwo[index]){
      System.out.printf("The smallest number is %d ",number[count]);
    }
    if(numberTwo[index] > number[count]){
     System.out.printf("The largest number is %d",numberTwo[index]);
    }
    else if(numberTwo[index] < numberTwo[count]){
      System.out.printf("The smallest number is %d",numberTwo[index]);
    }

    }
    
  }
  
 }

}