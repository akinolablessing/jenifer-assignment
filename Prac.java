import java.util.Scanner;
import java.util.Arrays;
 
public class Prac{
 public static void main(String[] args){
 Scanner scanner = new Scanner(System.in);

 int[] numbers = new int[7];
for(int count=0; count<numbers.length; count++){
 System.out.print("Enter a number:");
  numbers[count] = scanner.nextInt();

 }
 int max = 0;
 int min = numbers[0];

for(int count = 0; count<numbers.length; count++){
 if(numbers[count] >= max){
  max = numbers[count];
  }
  if(max > numbers[count] && numbers[count] < min){
   min = numbers[count];
 }
 }
 System.out.printf("The maximum value is %d%n",max);
 System.out.printf("The minimum value is %d%n",min);
 }
}