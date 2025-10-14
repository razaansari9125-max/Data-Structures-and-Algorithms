class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name; this.age = age;
    }
    public String getName(){ return name; }
    public int getAge(){ return age; }
    public void setAge(int age){ this.age = age; }
    @Override
    public String toString(){ return name + " (" + age + ")"; }
}

public class OOPDemo {
    public static void main(String[] args) {
        Person p = new Person("Asha", 28);
        System.out.println(p);
        p.setAge(29);
        System.out.println("Updated: " + p.getAge());
    }
}