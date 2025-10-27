class MathOperation {
    // Method Overloading
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class OverloadingExample {
    public static void main(String[] args) {
        MathOperation obj = new MathOperation();

        System.out.println("Sum of two integers: " + obj.add(5, 10));
        System.out.println("Sum of two doubles: " + obj.add(4.5, 3.2));
        System.out.println("Sum of three integers: " + obj.add(2, 4, 6));
    }
}