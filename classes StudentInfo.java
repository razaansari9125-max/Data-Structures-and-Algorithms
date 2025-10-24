class StudentInfo {
    int roll;
    String name;
    String course;

    void insert(int r, String n, String c) {
        roll = r;
        name = n;
        course = c;
    }

    void display() {
        System.out.println(roll + " " + name + " " + course);
    }

    public static void main(String[] args) {
        StudentInfo s1 = new StudentInfo();
        s1.insert(1, "Raza", "BCA");
        s1.display();
    }
}