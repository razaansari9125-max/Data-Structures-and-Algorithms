import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        
        HashSet<String> set = new HashSet<>();

        
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Mango");
        set.add("Banana"); 

        
        System.out.println("HashSet elements: " + set);

        
        if (set.contains("Apple")) {
            System.out.println("Apple is in the set.");
        }

        
        set.remove("Orange");
        System.out.println("After removing Orange: " + set);

        
        System.out.println("Iterating through set:");
        for (String fruit : set) {
            System.out.println(fruit);
        }

        
        System.out.println("Size of set: " + set.size());
    }
}