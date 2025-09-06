class Example {
    double divide(int a, int b) {
        return (double) a / b;
    }

    public static void main(String[] args) {
        Example e = new Example();
        System.out.println("Result: " + e.divide(10, 4));
    }
}