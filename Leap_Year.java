import java.util.Scanner;
  public class Leap_Year{
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
 
   System.out.print("Enter a year:");
    int year = scanner.nextInt();

if (year % 4 ==0){
   System.out.printf("%d it is a leap year",year);
  }
else if (year % 4 !=0){
   System.out.printf("%d it is not a leap year",year);
  }
 }
}