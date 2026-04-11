//Number Pyramid
//This pattern prints the row number i, i times, with leading spaces to form a pyramid shape.


public class NumberPyramid {
    public static void main(String args[]) {
        int n = 5;

        for(int i=1; i<=n; i++) {
            // Spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            // Numbers (print row number, row number times)
            for(int j=1; j<=i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}


