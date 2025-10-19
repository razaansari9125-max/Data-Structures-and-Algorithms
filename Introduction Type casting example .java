class TypeCastingExample {
    public static void main(String[] args) {
        int num = 10;
        double d = num; // Widening casting (int → double)
        System.out.println("Widening: " + d);

        double x = 9.78;
        int y = (int) x; // Narrowing casting (double → int)
        System.out.println("Narrowing: " + y);
    }
}