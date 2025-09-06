class Example {
    int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Example e = new Example();
        System.out.println("Result: " + e.multiply(4, 5));
    }
}