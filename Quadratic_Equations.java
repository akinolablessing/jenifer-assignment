import java.util.Scanner;
public class Quadratic_Equations{
  public static void main(String[] args){
  Scanner scanner = new Scanner(System.in);

System.out.print("Input a:");
double number = scanner.nextDouble();

System.out.print("Input b:");
double number1 = scanner.nextDouble();

System.out.print("Input c:");
double number2 = scanner.nextDouble();

double sum = number(number1*number1-4*number*number2)/2*number;
System.out.printf("The roots are:%.6f",sum);

   }
 }