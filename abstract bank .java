abstract class Bank {
    int rate;

    abstract int getRate();

    void show() {
        System.out.println("Bank Rate: " + rate);
    }
}

class SBI extends Bank {
    int getRate() {
        rate = 8;
        return rate;
    }
}

class PNB extends Bank {
    int getRate() {
        rate = 9;
        return rate;
    }
}

public class Test {
    public static void main(String[] args) {
        Bank b = new SBI();
        System.out.println("SBI Rate: " + b.getRate());

        b = new PNB();
        System.out.println("PNB Rate: " + b.getRate());
    }
}