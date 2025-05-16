public class Hcf {

        public static int getHcf(int... numbers) {
            int higestCommonFactor = numbers[0];
            for (int index = 1; index < numbers.length; index++) {
                higestCommonFactor = getHcfOfTwoNumbers(higestCommonFactor, numbers[index]);
            }
            return higestCommonFactor;
        }
    private static int getHcfOfTwoNumbers(int firstNumber, int secondNumber) {
        while (secondNumber != 0) {
            int number = secondNumber;
            secondNumber = firstNumber % secondNumber;
            firstNumber = number;
        }
        return firstNumber;
    }

}
