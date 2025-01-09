import java.util.Scanner;
public class Condition{
public static void main(String[] args){
 Scanner scanner = new Scanner(System.in);

System.out.print("Enter a number:");
int number = scanner.nextInt();
for(int count=0; count=number; count++){


if(number >=90 && number <=100){
  System.out.print("A");
 }
 else if(number >=80 && number < 90){
  System.out.print("B");
 }
 else if(number >=70 && number < 80){
  System.out.print("C");
 }
else if(number >=65 && number < 70){
  System.out.print("D");
 }
else if(number >=0 && number < 65){
  System.out.print("E");
 }
 }

 }
}