package xyz.trixnet;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter loan amount: ");
        int loanAmount = scanner.nextInt();

        System.out.print("Enter interest rate (%): ");
        float interestRatePercent = scanner.nextFloat();
        float monthlyInterest = interestRatePercent / PERCENT / MONTHS_IN_YEAR;

        System.out.print("Enter mortgage term (years): ");
        byte mortgageTerm = scanner.nextByte();
        int mortgageTermMonths = mortgageTerm * MONTHS_IN_YEAR;

        double monthlyRepayment = loanAmount * ( (monthlyInterest * Math.pow((1 + monthlyInterest), mortgageTermMonths)) / (Math.pow((1 + monthlyInterest), mortgageTermMonths) - 1) );
        System.out.println("Monthly repayment: " + NumberFormat.getCurrencyInstance().format(monthlyRepayment));
    }
}
