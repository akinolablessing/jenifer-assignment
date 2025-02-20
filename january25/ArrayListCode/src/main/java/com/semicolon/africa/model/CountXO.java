package main.java.com.semicolon.africa.model;

public class CountXO {

    public int countXandO(String[] input) {
        for (int count = 0; count < input.length; count++) {
            if (input[count].equalsIgnoreCase("x")) {
                return 1;
            }
            if (input[count].equalsIgnoreCase("O")) {
                return 0;
            }
        }

        return 0;
    }
}
