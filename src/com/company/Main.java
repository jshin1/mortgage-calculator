package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final byte MONTHS = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / PERCENT / MONTHS;

        System.out.print("Period (in years): ");
        byte years = scanner.nextByte();
        int numOfPayments = years * MONTHS;
    }
}
