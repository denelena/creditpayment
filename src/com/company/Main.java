package com.company;

public class Main {
    public static void main(String[] args) {
        CreditPaymentService cps = new CreditPaymentService();
        System.out.println("Ежемесячные платежи:");
        System.out.println("миллион на 12 мес., под 9.99% : " + cps.calculate(1000000, 0.0999, 12));
        System.out.println("миллион на 24 мес., под 9.99% : " + cps.calculate(1000000, 0.0999, 24));
        System.out.println("миллион на 36 мес., под 9.99% : " + cps.calculate(1000000, 0.0999, 36));
    }
}
