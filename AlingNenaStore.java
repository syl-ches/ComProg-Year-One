/*
Name: Caliva Mark Chester P.
Programming Date: September, 13 2023
Activity Name and Number: Prelim Programming Exercise Number 6

Problem:
Write a Java program that will be used at the check-out counter of Aling Nena's Sari-Sari Store with the following
assumptions: Aling Nena's customers always buy only one type of product, but may buy one or more pieces of the
said product. For example, a customer may buy a dozen eggs. Depending on the customer, Aling Nena may decide to
give the customer a discount, expressed as an integer value from 1 to 100, which indicates the percentage deducted
from the total amount of the customer's purchase. For example, assuming that eggs cost P5.00 a piece, a dozen eggs
would cost a total of P60.00, and if the customer is then given a 10 percent discount, then the customer will have to
pay only P54.00 for one dozen of eggs. Customers who are not entitled to discounts are given zero (0) percent discount.
Aling Nena's customers always pay in cash, and the cash amount tendered is always greater than or equal to the total purchase
amount.

Analysis:
        Input: Product Name
               Product Quantity
               Unit Price
               Discount
               Cash Tendered
        Processes: Reads the product name, quantity, unit price, discount, and cash tendered
                   Computes the total amount, total discount, amount to be paid, and change
                   Display results
        Algorithm:
                1. Read/Accept the inputted product name, quantity, unit price, discount, and cash tendered
                2. Compute the total purchase amount = unit price * quantity
                3. Compute the total discount: (discount*amount)/100
                4. Compute amount to be paid = amount - discount
                5. Compute change = cash tendered - amount to be paid
 */
import java.util.Scanner;
public class AlingNenaStore {
    public static void main(String[] args) {
        Scanner nena = new Scanner(System.in);
        // below asks user to input product name, quantity, price, discount, and cash tendered
        System.out.println(" Input product name: ");
        String product = nena.nextLine();

        System.out.println(" Input product quantity: ");
            double quantity;
            quantity = Double.parseDouble(nena.nextLine());
        
        System.out.println(" Input unit price: ");
            double price;
            price = Double.parseDouble(nena.nextLine());

        System.out.println(" Input discount: ");
            double discount;
            discount = Double.parseDouble(nena.nextLine());

        System.out.print(" Input cash tendered: ");
            double cash;
            cash = Double.parseDouble(nena.nextLine());

            double amount;
            amount = quantity * price;

            double disc;

            double s;
            s = discount;
            disc = (s*amount)/100; //formula for computing discount

            double amountToPay;
            amountToPay = amount - disc;

            double change;
            change = cash - amountToPay;

            System.out.println(" Total Purchase Amount: "+amount+" ");
            System.out.println(" Total Discount "+disc+" ");
            System.out.println(" Amount to be paid: "+amountToPay+" ");
            System.out.println(" Change: "+change+" ");

            System.exit(0);


    }
}
