class Addition {
    // Method with parameters and return type
    int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Addition obj = new Addition();
        int sum = obj.add(10, 20);
        System.out.println("Sum = " + sum);
    }
}