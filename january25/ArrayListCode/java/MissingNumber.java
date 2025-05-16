public class MissingNumber {
    public static void main(String[] args){
        String input = "16, 7, 8, 10";


        String[] parts = input.split(", ");
        int[] numbers = new int[parts.length];


        for (int i = 0; i < parts.length; i++) {
            numbers[i] = Integer.parseInt(parts[i]);
        }


        int min = numbers[0];
        int max = numbers[0];

        for (int number : numbers) {
            if (number < min)
                min = number;
            if (number > max)
                max = number;
        }


        int expectedSum = (max * (max + 1)) / 2 - ((min - 1) * min) / 2;


        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }


        int missingNumber = expectedSum - sum;


        System.out.println("The missing number is: " + missingNumber);
    }
}
