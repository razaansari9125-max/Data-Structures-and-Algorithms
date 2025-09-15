public class N {
    public static void main(String[] args) {
        int k=2;
        for(int i=1; i<=5; i++) {
            for(int j=1; j<=5; j++) {
                if(j==1 || j==5 || j+i==k) {
                    System.out.print(" *");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
            k=k+2;
        }
    }
}