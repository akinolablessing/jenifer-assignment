package main.java.com.semicolon.africa.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingNumber {
    public static int missingNumber(int[] input) {
        int num = input.length + 1;

        int[] numbers = new int[num + 1];

        for (int i = 0; i < input.length; i++) {
            numbers[input[i]]++;
        }

        for (int i = 1; i <= num; i++) {
            if (numbers[i] == 0) {
                return i;
            }
        }
        return -1;
    }

}
