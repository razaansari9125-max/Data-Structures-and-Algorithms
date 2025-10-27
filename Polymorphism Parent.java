class Parent {
    void show() {
        System.out.println("This is the Parent class");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("This is the Child class");
    }
}

public class DynamicDispatchExample {
    public static void main(String[] args) {
        Parent obj = new Child();  // Reference of parent, object of child
        obj.show();  // Calls child method at runtime
    }
}