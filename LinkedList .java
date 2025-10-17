class Node {
    int data;
    Node next;
}

public class LinkedListSimple {
    public static void main(String[] args) {
        Node first = new Node();
        Node second = new Node();
        Node third = new Node();

        first.data = 10;
        second.data = 20;
        third.data = 30;

        first.next = second;
        second.next = third;
        third.next = null;

        Node temp = first;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}