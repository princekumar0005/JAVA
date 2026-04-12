//This code calculates the final amount based on the formula: A = P(1 + \frac{r}{n})^{nt}
//P = Principal amount
//r = Annual interest rate (decimal)
//n = Number of times interest is compounded per year
//t = Number of years
//Java Compound Interest Calculator


import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        //  Get principal amount
        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();

        //  Get interest rate and convert to decimal
        System.out.print("Enter the interest rate (in %): ");
        rate = scanner.nextDouble() / 100;

        //  Get compounding frequency
        System.out.print("Enter the number of times compounded per year: ");
        timesCompounded = scanner.nextInt();

        //  Get duration in years
        System.out.print("Enter the number of years: ");
        years = scanner.nextInt();

        //  Compound interest formula
        amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);

        //  Display formatted output using printf
        System.out.printf("The amount after %d years is $%.2f", years, amount);

        //  Close the scanner
        scanner.close();
    }
}

