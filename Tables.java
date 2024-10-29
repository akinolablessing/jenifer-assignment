import java.util.Scanner;
  public class Tables{
   public static void main(String[] args){
  Scanner scanner = new Scanner(System.in);

  System.out.print("Input number of terms:");
     int number = scanner.nextInt();


    for(int one=1; one<=9; one++){
    
     int multiply = number*one;
     
    System.out.printf(" %d * %d = %d %n  ",number,one,multiply);
  }
}
}