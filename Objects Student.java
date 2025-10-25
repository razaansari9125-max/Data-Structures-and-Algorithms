// File: ObjectExample1.java
class Student {
    String name;
    int age;

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ObjectExample1 {
    public static void main(String[] args) {
        Student s1 = new Student(); // Object creation
        s1.name = "Raza";
        s1.age = 20;
        s1.display();
    }
}