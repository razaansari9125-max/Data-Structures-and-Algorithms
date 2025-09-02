public class DigitSumWhile {
    public static void main(String[] args) {
        String input = "367 45";
        int sum = 0;
        int i = 0;

        while (i < input.length()) {
            char ch = input.charAt(i);
            if (Character.isDigit(ch)) {
                sum += Character.getNumericValue(ch);
            }
            i++;
        }

        System.out.println("Sum of all digits: " + sum);
    }
}