class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int sub(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("Addition: " + c.add(8, 2));
        System.out.println("Subtraction: " + c.sub(8, 2));
    }
}