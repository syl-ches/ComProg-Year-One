/*
Name: Caliva Mark Chester P.
Programming Date: September, 14 2023
Activity Name and Number: Prelim Programming Exercise 7

Problem:
Write a program that will read the amount of money that will be withdrawn from an ATM (e.g. P500 or P1200)
then compute and output the least number of peso bills (P100 peso bills, P500 peso bills, P1000 peso bills) that
will be dispensed by the machine for the requested amount.

Analysis:
        Input: Amount to be withdrawn
        Processes: Read the amount to be withdrawn.
                   Divide the amount by the largest bill first if possible, then get the remainder if any, then divide
                   remainder to the next bill until we reach the amount to be withdrawn.This is done to use the least
                   number of peso bills.
                   Multiply each quotient computed to the corresponding bill to show amount.
                   Use the computed quotient as the quantity of bills dispensed.
        Output: quantity of bills dispensed, amount of bills

Algorithm:
        1. Read/Accept the amount to be withdrawn
        2. Compute how much bills is needed in a way that would use the least amount of bills.
        3. Show the quantity of bills dispensed and amount.
 */
import java.util.Scanner;
public class Dispenser {
    public static void main(String[] args) {
        Scanner machine = new Scanner(System.in);

        System.out.println(" Enter amount to be withdrawn, whole numbers only: ");
        int amount;
        amount = Integer.parseInt(machine.nextLine());

        int largest = 1000;
        int mid = 500;
        int small = 100;

        int biggest = (amount % largest);
        int remain = amount/largest;
        int minus = remain * biggest;

        int divide = biggest % mid;
        int mean = biggest/mid;
        int wastes = mean * mid;

        int kind = divide / small;
        int wasted = kind * small;

        double bills = remain + mean + kind;

        System.out.println(" PESO BILLS           QUANTITY DISPENSED          AMOUNT ");
        System.out.println("============         ====================        ========");
        System.out.println(" " + largest + "                    " + remain + "                         " + minus + " ");
        System.out.println(" " + mid + "                     " + mean + "                         " + wastes + " ");
        System.out.println(" " + small + "                     " + kind + "                           " + wasted + " ");
        System.out.println("------------         --------------------        --------");
        System.out.println("Total number of bills        " + bills + "         " + amount + " ");

    }
}