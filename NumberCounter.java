import java.util.Scanner;
  public class NumberCounter{
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
 
    int negativeCounter = 0;
    int positiveCounter = 0;
    int zeroCounter = 0;
    int numberCounter = 1;

    while(numberCounter <= 6){
       
    	System.out.printf("Enter a number: ");
    	int number = scanner.nextInt();
 
    if (number > 0){
        positiveCounter += 1;
      }
    else if (number < 0){
         negativeCounter += 1;
      }
   else {
       zeroCounter += 1;
      }
       numberCounter++;

     }
   System.out.printf("There are %d positive numbers ",positiveCounter);
   System.out.printf("There are %d zeros",zeroCounter );
   System.out.printf("There are %d negative numbers ",negativeCounter);

    }
   }
