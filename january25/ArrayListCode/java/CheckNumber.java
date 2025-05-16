public class CheckNumber {



        public static boolean isRotation(String num1, String num2) {

            if (num1.length() != num2.length()) {
                return false;
            }
            return (num1 + num1).contains(num2);
        }


}
