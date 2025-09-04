public class Main {
    public static void main(String[] args) {
        int n = 36749, sum = 0;
        while (n > 0) {
            int d = n % 10;
            if (d % 3 == 0) sum += d;
            n /= 10;
        }
        System.out.println(sum);
    }
}