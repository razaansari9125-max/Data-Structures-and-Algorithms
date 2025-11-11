import java.text.DecimalFormat;

public class EmiCalculator {
    public static void main(String[] args) {
        double principal = 695140;      // Loan amount
        double annualRate = 0.1075;      // 10.8% annual interest
        int months = 36;               // Tenure in months

        double monthlyRate = annualRate / 12;  // Monthly interest rate
        double emi = (principal * monthlyRate * Math.pow(1 + monthlyRate, months))
                   / (Math.pow(1 + monthlyRate, months) - 1);

        DecimalFormat df = new DecimalFormat("0.00");

        double balance = principal;
        double totalInterest = 0;
        double totalPayment = 0;

        System.out.println("Month\tInterest\tPrincipal\tBalance");
        System.out.println("------------------------------------------------");

        for (int i = 1; i <= months; i++) {
            double interest = balance * monthlyRate;
            double principalPaid = emi - interest;
            balance -= principalPaid;

            totalInterest += interest;
            totalPayment += emi;

            if (balance < 0) balance = 0;

            System.out.println(i + "\t" + df.format(interest) + "\t\t"
                               + df.format(principalPaid) + "\t\t"
                               + df.format(balance));
        }

        System.out.println("------------------------------------------------");
        System.out.println("Monthly EMI: ₹" + df.format(emi));
        System.out.println("Total Payment: ₹" + df.format(totalPayment));
        System.out.println("Total Interest: ₹" + df.format(totalInterest));
    }
}