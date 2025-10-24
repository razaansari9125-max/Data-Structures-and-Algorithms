class Product {
    int id;
    String name;
    double price;

    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Price: " + price);
    }

    public static void main(String[] args) {
        Product p1 = new Product();
        p1.id = 101;
        p1.name = "Laptop";
        p1.price = 55000.50;
        p1.display();
    }
}