class Test {
    boolean isPerfect(int n) {
        int sum = 0;
        for(int i = 1; i < n; i++)
            if(n % i == 0) sum += i;
        return sum == n;
    }

    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.isPerfect(28));  
    }
}