interface A {
    void displayA();
}

interface B {
    void displayB();
}

class C implements A, B {
    public void displayA() {
        System.out.println("Display from A");
    }
    public void displayB() {
        System.out.println("Display from B");
    }
}

class Main {
    public static void main(String[] args) {
        C obj = new C();
        obj.displayA();
        obj.displayB();
    }
}