public class StringConcat {
    public static void main(String[] args) {
        String first = "Hello";
        String second = "World";
        
        // Using + operator
        String result1 = first + " " + second;
        
        // Using concat() method
        String result2 = first.concat(" ").concat(second);
        
        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
    }
}