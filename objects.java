class Student {
    
    int id;
    String name;

    
    void display() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
    }
}


public class ObjectExample {
    public static void main(String[] args) {
        
        Student s1 = new Student();
        Student s2 = new Student();

        
        s1.id = 101;
        s1.name = "Ravi";

        s2.id = 102;
        s2.name = "Priya";

        
        s1.display();
        s2.display();
    }
}