package com.company;

public class CreditPaymentService {
    public double calculate(double loanAmount, double annualProcent, int monthsTotal) {
        double percentMonthly = annualProcent / 12;
        //а где взяла формулу, не скажу :-)
        return loanAmount * percentMonthly * Math.pow(1 + percentMonthly, monthsTotal) / (Math.pow(1 + percentMonthly, monthsTotal) - 1);
    }
}
