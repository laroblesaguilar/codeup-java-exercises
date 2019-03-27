import java.util.Scanner;

public class MortgageCalculator {

    public static double payment(double principalAmount, double paymentMonths, double interest){
        return principalAmount * interest * (Math.pow(1 + interest, paymentMonths)) / (Math.pow(1 + interest,paymentMonths) - 1);
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double principalAmount;
        double interest;
        double years;

        System.out.println("Enter amount of loan");
        principalAmount = scnr.nextDouble();
        System.out.println("Enter interest rate");
        interest = scnr.nextDouble();
        System.out.println("Enter Mortgage period (years)");
        years = scnr.nextDouble();
        years*=12;
        interest = interest/100/12;
        System.out.format("Monthly payment: %.2f", payment(principalAmount, years, interest));

    }
}
