//Solid Rhombus
//A rhombus is essentially a square shifted by spaces. The number of spaces decreases as the row number increases.


public class Rhombus {
    public static void main(String args[]) {
        int n = 5;

        for(int i=1; i<=n; i++) {
            // Spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            // Stars
            for(int j=1; j<=5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
