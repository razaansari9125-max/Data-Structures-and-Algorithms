public class W {
    public static void main(String[] args) {
        
        for(int i=1; i<=5; i++) {
            for(int j=1; j<=5; j++) {
                if(j==1 || j==5 || (i==j & i>2) || (i==4 & j==2)) {
                    System.out.print(" *");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println( );
            
        }
    }
}