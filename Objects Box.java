class Box {
    int length;

    Box(int l) {
        length = l;
    }

    Box doubleLength() {
        return new Box(length * 2);
    }
}

public class ObjectExample4 {
    public static void main(String[] args) {
        Box b1 = new Box(5);
        Box b2 = b1.doubleLength();
        System.out.println("Original length: " + b1.length);
        System.out.println("Doubled length: " + b2.length);
    }
}