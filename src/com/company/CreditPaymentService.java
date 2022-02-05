package com.company;

public class CreditPaymentService
{
    public double calculate(double loanAmount, double annualProcent, int months)
    {
        double percent_monthly = annualProcent/12;
        //а где взяла формулу, не скажу :-)
        return loanAmount*percent_monthly*Math.pow(1+percent_monthly, months)/(Math.pow(1+percent_monthly, months)-1);
    }
}
