class StringExample5 {
    public static void main(String[] args) {
        String str = "Java";
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        System.out.println("Original: " + str);
        System.out.println("Reversed: " + rev);
    }
}