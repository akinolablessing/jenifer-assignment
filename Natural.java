import java.util.Scanner;
  public class Natural{
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter starting number:");
    int s = scanner.nextInt();
    System.out.print("Enter ending number:");
    int e = scanner.nextInt();

    while (s>=e){
     System.out.println(s);
     s++;
    }
  }
 }