import java.util.Scanner;
public class MyMethod{


 static void nuo(){
 for(int count =0; count<3; count++){
   
 Scanner scanner = new Scanner(System.in);
  System.out.print("What is your name: ");
  String decision = scanner.next(); 
   System.out.print("Your age: ");
    int age = scanner.nextInt();
   System.out.println("You can vote " +decision+ " because you are: "+age);

   }
   }

public static void main(String[] args){
 nuo();
 }
}