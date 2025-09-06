class Example {
    int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Example e = new Example();
        System.out.println("Factorial of 5 is: " + e.factorial(5));
    }
}