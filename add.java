class Example {
    int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Example obj = new Example();
        int result = obj.add(5, 3);
        System.out.println("Sum: " + result);
    }
}