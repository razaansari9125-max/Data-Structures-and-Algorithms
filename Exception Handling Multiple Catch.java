class MultipleCatch {
    public static void main(String[] args) {
        try {
            int arr[] = new int[3];
            System.out.println(arr[5]); // ArrayIndexOutOfBounds
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Error");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Error");
        } catch (Exception e) {
            System.out.println("Other Exception");
        }
    }
}