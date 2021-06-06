/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Mauricio Rios
 */
package ex12;

import java.util.Scanner;

public class App {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        int principal = myApp.getPrincipal();
        double interest = myApp.getInterest();
        int years = myApp.getYears();
        int amount = myApp.getAmount(principal, interest, years);
        String outputString = myApp.generateOutputString(interest, years, amount);
        myApp.printOutput(outputString);
    }

    public int getPrincipal() {
        System.out.print("Enter the principal: ");
        return in.nextInt();
    }

    public double getInterest() {
        System.out.print("Enter the rate of interest: ");
        return in.nextDouble();
    }

    public int getYears() {
        System.out.print("Enter the number of years: ");
        return in.nextInt();
    }

    public int getAmount(int principal, Double interest, int years){
        double amount =  principal*(1+((interest/100)*years));
        amount = Math.round(amount);
        return (int) amount;
    }

    public String generateOutputString(Double interest, int years, int amount) {
        return "After "+years+" at "+interest+"%, the investment will be worth $"+amount+".";
    }

    public void printOutput(String outputString) {
        System.out.print(outputString);
    }
}




