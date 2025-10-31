class GrandParent {
    void message() {
        System.out.println("This is GrandParent class");
    }
}

class Parent extends GrandParent {
    void greet() {
        System.out.println("This is Parent class");
    }
}

class Child extends Parent {
    void info() {
        System.out.println("This is Child class");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.message();
        obj.greet();
        obj.info();
    }
}