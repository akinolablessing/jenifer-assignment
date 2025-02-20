package main.java.com.semicolon.africa.model;

public class Tiktaktoe {

    char[][] toe = new char[3][3];


    public char board(char[][] boardMethod){

        for(int count=0; count<3; count++){
            for(int index=0; index<3; index++){
               return boardMethod[count][index];
            }

            if(count<2){
                return '_';
            }

        }

        return ' ';
    }
    public  boolean score(char[][] scoreBoard, char userInput){
        if(scoreBoard[0][0] == userInput && scoreBoard[0][1]== userInput && scoreBoard[0][2] ==  userInput  ){
            return true;
        }

        return false;
    }
}
