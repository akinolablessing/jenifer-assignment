public class SumOfMissingNum {

        public static void main(String[] args) {
            String input = "0, 5";


            String[] parts = input.split(", ");
            int[] numbers = new int[parts.length];

            for (int i = 0; i < parts.length; i++) {
                numbers[i] = Integer.parseInt(parts[i]);
            }


            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            for (int number : numbers) {
                if (number < min) min = number;
                if (number > max) max = number;
            }

            int expectedSum = (max * (max + 1)) / 2 - ((min - 1) * min) / 2;


            int actualSum = 0;
            for (int number : numbers) {
                actualSum += number;
            }

            int missingNumber = expectedSum - actualSum;

            System.out.println("The missing number is: " + missingNumber);
        }


}
