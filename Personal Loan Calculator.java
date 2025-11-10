import java.util.Scanner;

public class PersonalLoanCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter loan amount (P): ");
        double P = sc.nextDouble();

        System.out.print("Enter annual interest rate (%): ");
        double annualRate = sc.nextDouble();

        System.out.print("Enter loan tenure (in months): ");
        int N = sc.nextInt();

        double R = annualRate / (12 * 100); // Monthly interest rate

        double EMI = (P * R * Math.pow(1 + R, N)) / (Math.pow(1 + R, N) - 1);

        double totalPayment = EMI * N;
        double totalInterest = totalPayment - P;

        System.out.printf("\nMonthly EMI: ₹%.2f", EMI);
        System.out.printf("\nTotal Payment: ₹%.2f", totalPayment);
        System.out.printf("\nTotal Interest: ₹%.2f\n", totalInterest);

        sc.close();
    }
}