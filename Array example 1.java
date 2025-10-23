class ArrayExample6 {
    public static void main(String[] args) {
        int[] source = {10, 20, 30, 40};
        int[] dest = new int[source.length];

        for (int i = 0; i < source.length; i++) {
            dest[i] = source[i];
        }

        System.out.println("Copied Array:");
        for (int num : dest) {
            System.out.println(num);
        }
    }
}