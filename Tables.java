import java.util.Scanner;
  public class Tables{
   public static void main(String[] args){
  Scanner scanner = new Scanner(System.in);


    for(int index=1; index<=9; index++){
      for(int count=1; count<=9; count++)
     
      System.out.print(count+ "*" +index+ "=" +index*count+ "\t");
       System.out.println();
   }
 }
} 