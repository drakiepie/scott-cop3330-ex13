package org.example;
import java.text.DecimalFormat;
import java.util.Scanner;

public class compound {
    public static double compInt(double P, double r, int t, int n){
        double base = (1 + (r / n));
        double exponent = n * t;
        double amount = P * Math.pow(base, exponent);
        return amount;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("What is the principal amount? ");
        double P = input.nextDouble();

        System.out.print("What is the rate? ");
        double rate = input.nextDouble();
        double r = rate / 100;

        System.out.print("What is the number of years? ");
        int t = input.nextInt();

        System.out.print("What is the number of times the interest is compounded per year? ");
        int n = input.nextInt();

        double amount = compInt(P, r, t, n);

        DecimalFormat df = new DecimalFormat("$#,##0.00");
        System.out.print(df.format(P) + " invested at " + rate + "% for " + t + " years compounded " + n + " times per" +
                " year is " + df.format(amount) + ".");

    }
}
