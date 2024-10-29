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

double determine = number1 * number1 - 4 * number * number2;


double sumOne =(-number1 + Math.sqrt(determine)/2*number);
double sumTwo =(-number1 - Math.sqrt(determine)/2*number);

System.out.print("The root are:"+sumOne+ "and"+ sumTwo );

   }
 }