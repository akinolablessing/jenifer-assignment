
public class OopPractice{
 public void theCar(){
 System.out.println("The name of my car is Range over!!");
 } 
 public void color(String colorType){
  System.out.println("My range over has: " +colorType+ " color");
 }
 public void tyre(int totalTyre){
 System.out.println("My range over has: " +totalTyre+ " tyre");
 }
 public void seat(int totalSeat){
  System.out.println("It has: " +totalSeat+ " seat");
 }
 public static void main(String[] args){
 OopPractice call = new OopPractice();
 call.theCar();
 call.color("Ash");
 call.tyre(4);
 call.seat(10);
 }
}