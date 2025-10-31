class Parent {
    void display() {
        System.out.println("This is Parent class");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("This is Child class");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display(); // from Parent
        obj.show();    // from Child
    }
}