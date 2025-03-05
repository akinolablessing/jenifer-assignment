package main.java.com.semicolon.africa.model;

public class SecondMultiple {

    public int[] generateMultiples(int numberA, int numberB, int numberC) {
        int count = 0;
        for (int index = numberA; index <= numberB; index++) {
            if (index % numberC == 0) {
                count++;
            }
        }

        int[] multiples = new int[count];
        int counter = 0;
        for (int secondIndex = numberA; secondIndex <= numberB; secondIndex++) {
            if (secondIndex % numberC == 0) {
                multiples[counter++] = secondIndex;
            }
        }

        return multiples;
    }
}


