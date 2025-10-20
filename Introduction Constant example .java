class ConstantExample {
    public static void main(String[] args) {
        final double PI = 3.14159;
        System.out.println("Value of PI: " + PI);
        // PI = 3.14;  // Error! Cannot change value of final variable
    }
}