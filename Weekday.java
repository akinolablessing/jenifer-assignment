import java.util.Scanner;
 public class Weekday{
  public static void main(String[] args){
  Scanner scanner = new Scanner(System.in);

   String name = "Monday";
   String name1 = "Tuesday";
   String name2 = "Wednesday";
   String name3 = "Tursday";
   String name4 = "Friday";
   String name5 = "Saturday";
   String name6 = "Sunday";

System.out.print("Enter a number:");
 int number = scanner.nextInt();

switch(number){
case(1):
 System.out.print(name);
break;

case(2):
 System.out.print(name1);
break;

case(3):
 System.out.print(name2);
break;

case(4):
 System.out.print(name3);
break;

case(5):
 System.out.print(name4);
break;

case(6):
 System.out.print(name5);
break;

case(7):
 System.out.print(name6);
break;

   }
  }
 }