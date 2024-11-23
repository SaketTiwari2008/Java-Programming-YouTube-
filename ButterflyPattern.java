public class ButterflyPattern {
    // butterfly pattern method
    public static void butterflyPattern(int n){
        // for 1st half
        // loop for line or rows
        for (int i = 1; i <= n; i++){
            // loop for stars
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            // loop for print spaces
            for(int j = 1; j <= 2*(n-i); j++){
                System.out.print(" ");
            }
            // loop for print stars
            for (int j=1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // 2nd half pattern
        for(int i = n; i >= 1; i--){
            //loop for star
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            // loop for spaces
            for(int j = 1; j <= 2*(n-i); j++){
                System.out.print(" ");
            }
            //loop for star
            for (int j=1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        butterflyPattern(10);
    }
}
