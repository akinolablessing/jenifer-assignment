package main.java.com.semicolon.africa.model;

public class ProductMain {
    public static void main(String[] args){
        ComputerCase theCse = new ComputerCase("2208","Dell","240");
        Monitor theMonitor = new Monitor("27inch Beast","Acer",
                27,"2540 * 1440");
        MotherBoard theMotherBoard = new MotherBoard("BJ-200","Asus",
                4,6,"v2.44");

        PersonalComputer thePc = new PersonalComputer("2208","Dell",
                theMonitor,theMotherBoard,theCse);
        thePc.getMonitor().drawPixelAt(10,10,"red");
        thePc.getMotherBoard().loadProgram("Windows OS");
        thePc.getComputerCase().pressPowerButton();
    }
}
