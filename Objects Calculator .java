class Calculator {
    int num;

    Calculator(int n) {
        num = n;
    }

    void addNumber(Calculator c) {
        int sum = num + c.num;
        System.out.println("Sum: " + sum);
    }
}

public class ObjectExample3 {
    public static void main(String[] args) {
        Calculator c1 = new Calculator(10);
        Calculator c2 = new Calculator(20);
        c1.addNumber(c2);
    }
}