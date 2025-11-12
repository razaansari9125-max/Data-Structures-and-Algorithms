interface Vehicle {
    void start();   // abstract method
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car starts with key");
    }
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike starts with button");
    }
}

class TestInterface {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();
        v1.start();
        v2.start();
    }
}