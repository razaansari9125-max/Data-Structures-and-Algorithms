public class CompareString {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");

        System.out.println(s1 == s2);           // true (same memory)
        System.out.println(s1.equals(s3));      // true (same content)
    }
}