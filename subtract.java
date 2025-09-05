class Example {
    int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        Example e = new Example();
        System.out.println("Result: " + e.subtract(10, 4));
    }
}