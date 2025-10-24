class BankAccount {
    int accNo;
    String holderName;
    double balance;

    void deposit(double amt) {
        balance += amt;
        System.out.println("Deposited: " + amt);
    }

    void withdraw(double amt) {
        balance -= amt;
        System.out.println("Withdrawn: " + amt);
    }

    void showBalance() {
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        b1.accNo = 12345;
        b1.holderName = "Raza";
        b1.balance = 10000;
        b1.deposit(5000);
        b1.withdraw(2000);
        b1.showBalance();
    }
}