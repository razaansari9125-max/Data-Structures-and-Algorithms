interface Printable {
    void print();
}

interface Showable {
    void show();
}

class Display implements Printable, Showable {
    public void print() {
        System.out.println("Printing content...");
    }
    public void show() {
        System.out.println("Showing content...");
    }
}

public class MultipleInterfaceExample {
    public static void main(String[] args) {
        Display obj = new Display();
        obj.print();
        obj.show();
    }
}