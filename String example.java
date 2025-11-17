public class StringExamples {
    public static void main(String[] args) {
        String s1 = "Hello";                // literal (in string pool)
        String s2 = new String("World");    // explicit object
        String s3 = s1 + " " + s2;          // concatenation

        System.out.println("s3 = " + s3);              // Hello World
        System.out.println("length = " + s3.length()); // length
        System.out.println("charAt(1) = " + s3.charAt(1));    // 'e'
        System.out.println("substring(6) = " + s3.substring(6)); // "World"
        System.out.println("indexOf('o') = " + s3.indexOf('o')); // first 'o' index
        System.out.println("contains(\"lo Wo\") = " + s3.contains("lo Wo"));
        System.out.println("toUpperCase = " + s3.toUpperCase());
        System.out.println("trim demo: '" + ("  hello  ".trim()) + "'");
    }
}