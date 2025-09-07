class Test {
    int sumEvenDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 == 0)
                sum += digit;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new Test().sumEvenDigits(123456)); 
    }
}