package practice;

import java.util.Scanner;

public class findLoanIntrest {

    // Method to calculate EMI
    public static double findInterest(double loan, double interest, int months) {
        double i = interest / 1200;  // convert annual % to monthly decimal
        return (loan * i * Math.pow(1 + i, months)) / (Math.pow(1 + i, months) - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Loan Amount (Rs): ");
        double loan = sc.nextDouble();

        System.out.print("Enter Tenure in Months: ");
        int months = sc.nextInt();

        System.out.print("Enter Monthly EMI you are paying: ");
        double targetEmi = sc.nextDouble();

        double interestRate = 1.0;  // starting interest rate
        double calculatedEmi;

        // Loop to find approximate interest rate
        while (interestRate <= 50) {
            calculatedEmi = findInterest(loan, interestRate, months);

            if (Math.abs(calculatedEmi - targetEmi) < 1) {
                break; // match found
            }

            interestRate += 0.1;  // increment correctly
            
        }
        System.out.println(interestRate);
        double fianlinterest=interestRate/2;
        

        // Final calculations
        double totalPaid = targetEmi * months;
        double totalInterestPaid = totalPaid - loan;
        

        System.out.println("\n========= RESULTS =========");
        System.out.println("Estimated Interest Rate: " + Math.round(fianlinterest)+" %");
        System.out.println("Total Amount to Pay   : Rs " + Math.round(totalPaid));
        System.out.println("Total Interest Paid   : Rs " + Math.round(totalInterestPaid));
        System.out.println("===========================");

        sc.close();
    }
}
