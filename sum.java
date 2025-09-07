class Test {
    int sum(int n) {
        int s = 0;
        while(n > 0) {
            s += n % 10;
            n /= 10;
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(new Test().sum(123));
    }
}