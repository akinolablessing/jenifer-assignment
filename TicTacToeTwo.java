import java.util.Scanner;
public class TicTacToe{
 public static void main(String[] args){
  
  char[][] toe = new char[3][3];
  emptySpace(toe);
  char letter = 'X';
  char letterZero = 'o';
  while(true){
    board(toe); 
    thePlayer(toe , letter);
    
    if(score(toe , letter) ){
      board(toe);
     System.out.print("You have won player " + letter);
     break;
     }
      letter = (letter=='X') ? 'O': 'X';


	

      }
  }
public static void emptySpace(char[][] space ){
 
  for(int count=0; count<3; count++){
   for(int index=0; index<3; index++){
     space[count][index] = ' '; 
     }
    }
    }
    public static void board(char[][] boardMethod){

	for(int count=0; count<3; count++){
          for(int index=0; index<3; index++){
           System.out.print(boardMethod[count][index]);
           if(index<2){
             System.out.print("|");
     }
   }
    System.out.println();
   if(count<2){
     System.out.print("--------");
   } 
   System.out.println();
  }

 }
 public static boolean score(char[][] scoreBoard, char userInput){
    if(scoreBoard[0][0] == userInput && scoreBoard[0][1]== userInput && scoreBoard[0][2] ==  userInput  ){
     return true; 
    }
    
  if(scoreBoard[1][0] == userInput && scoreBoard[1][1]== userInput && scoreBoard[1][2] ==  userInput){
   return true;
   }
   
  if(scoreBoard[2][0] == userInput && scoreBoard[2][1]== userInput && scoreBoard[2][2] ==  userInput){
    return true;
   }
  if(scoreBoard[0][0] == userInput && scoreBoard[1][0]== userInput && scoreBoard[2][0] ==  userInput  ){
     return true; 
    }
  if(scoreBoard[0][1] == userInput && scoreBoard[1][1]== userInput && scoreBoard[2][1] ==  userInput  ){
     return true; 
    }
   if(scoreBoard[0][2] == userInput && scoreBoard[1][2]== userInput && scoreBoard[2][2] ==  userInput  ){
     return true; 
    }
   if(scoreBoard[0][2] == userInput && scoreBoard[1][1]== userInput && scoreBoard[2][0] ==  userInput  ){
     return true; 
    }
   if(scoreBoard[0][0] == userInput && scoreBoard[1][1]== userInput && scoreBoard[2][2] ==  userInput  ){
     return true; 
    }
    
    return false;
 }
 public static void thePlayer(char[][] player, char playerSelection){
  Scanner scanner = new Scanner(System.in);
   while(true){
   System.out.print("Enter a number between 0 and 2(row): ");
   int row = scanner.nextInt();
   
   System.out.print("Enter a number between 0 and 2(column): ");
   int column = scanner.nextInt();

       
     if(row < 0 && row >= 3 && column < 0 && column>= 3){
        System.out.print("Enter a number between 0 and 2 !!!:");
        int num = scanner.nextInt();
        }
        if(row >= 0 && row <=2 && column >= 0 && column <=2 ){
          player[row][column] = playerSelection;
           break;
           }
          
         
      }
  }
}