public class DivBy3DigitSum {
    public static void main(String[] args) {
        int number = 36749;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            if (digit % 3 == 0)
                sum += digit;
            number /= 10;
        }

        System.out.println("Sum: " + sum);
    }
}