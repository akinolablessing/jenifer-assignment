import java.util.Scanner;
public class Testing{
 public static void main(String[] args){
   Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number:");
    int number = scanner.nextInt();
    String isTrue;
  
   isTrue = (number <= 10)? "true": "false" ;
   System.out.print(isTrue);
  }
 }