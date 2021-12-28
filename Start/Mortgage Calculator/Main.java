package com.codewithmosh;

public class Main {

    public static void main(String[] args) {

        int principal = (int) console.readNumber("Principal: ", 1000, 1_000_000);
        float annualInterest = (float) console.readNumber("Annual Interest Rate: ", 1, 30);
        byte years = (byte) console.readNumber("Period (Years): ", 1, 30);

        MortgageCalculator mortgageCalculator=new MortgageCalculator(principal,annualInterest,years);
        MortgageReport mortgageReport=new MortgageReport(mortgageCalculator);

        mortgageReport.printMortgage();
        mortgageReport.printPaymentSchedule();

    }

}
