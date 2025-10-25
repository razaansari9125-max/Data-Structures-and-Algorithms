class Student {
    String name;
    int age;

    // Constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ObjectExample2 {
    public static void main(String[] args) {
        Student s1 = new Student("Raza", 21);
        Student s2 = new Student("Ali", 22);
        s1.display();
        s2.display();
    }
}