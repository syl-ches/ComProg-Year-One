package prog2.prelim;

import java.util.Scanner;

public class FractionArithmetic {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        FractionArithmetic myProgram;

        try {
            myProgram = new FractionArithmetic();
            myProgram.run();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.exit(0);
    }
    Fraction frac1; // Initializes the first fraction
    Fraction frac2; // Initializes the first fraction
    Fraction out; // Initializes the output

    private void run() {
        System.out.println("Welcome to the Fraction Calculator!"); // Welcome message
        System.out.println("This program allows you to reduce, and do arithmetic operations with fractions.\n");

        int input = -1; // Initializes the variable for the user's input for the operation to be used

        while (true) { // This method loops the program until the user exit by choosing <6> in input
            if (input == 0) { // Prompts the user for the next calculation
                System.out.println("\nYour previous calculation is saved, type \"ans\" on the fraction input to use the previous answer." +
                        "\nEnter the next operation.");
            }

            input = readOption(); // Reads the user's input for the operation to be used

            if (input != 5) {
                /**
                 * This condition is for when the user wants to reduce a fraction, it proceeds to
                 * construct a second fraction and continue to perform operations, or else it won't
                 * ask for a second fraction and performs the reduce method on the first fraction.
                  */
                 if (input == 6) { // Prints an exit message and stop the program
                    System.out.println("Thank you for using the Fraction Calculator!");
                    System.exit(0);
                }

                frac1 = readFraction(1); // Reads and constructs the user's input for the first fraction
                frac2 = readFraction(2); // Reads and constructs the user's input for the second fraction

                if (input == 1) { // Adds the two fractions and prints the sum
                    out = frac1.add(frac2);
                    System.out.println(out.toString());
                } else if (input == 2) { // Subtracts the two fractions and prints the difference
                    out = frac1.subtract(frac2);
                    System.out.println(out.toString());
                } else if (input == 3) { // Multiplies the two fractions and prints the product
                    out = frac1.multiply(frac2);
                    System.out.println(out.toString());
                } else if (input == 4) { // Divides the two fractions and prints the quotient
                    out = frac1.divide(frac2);
                    System.out.println(out.toString());
                }
            } else { // Reduce and prints the fraction
                frac1 = readFraction(0); // Reads and constructs the user's input for the first fraction
                out = frac1.reduce();
                System.out.println(out.toString());
            }

            input = 0; // Resets the input for the next loop
        }
    }
    private Fraction readFraction(int fracCount) {
        int numInput = 0, denInput = 0; // Initializes the inputs for the numerator and denominator
        boolean validValueRead = false; // Initializes the boolean value of the checker for the loop
        System.out.println("Please enter a fraction a/b, where a and b are integers.");

        while (!validValueRead) {
            try {
                if (fracCount == 0) { // Prints if the operation is to reduce a fraction
                    System.out.print("\nEnter fraction: ");
                } else // Prints if the operation is not to reduce a fraction
                    System.out.print("\nEnter fraction number " + fracCount + ": ");
                String inputFrac = scanner.nextLine(); // Takes the user's input as a string

                if (inputFrac.equalsIgnoreCase("ans")) {
                    if (fracCount == 1 || fracCount == 0) { // Saves and returns the previous answer to frac1
                        frac1 = out;
                        return frac1;
                    } else if (fracCount == 2) { // Saves and returns the previous answer to frac2
                        frac2 = out;
                        return frac2;
                    }
                }

                if (inputFrac.contains("/")) { // Splits the string with the "/" sign and puts it in an array
                    String[] fraction = inputFrac.split("/");
                    if (Integer.parseInt(fraction[1]) == 0) { // If the denominator is 0, the program will reject the input and tries again
                        System.out.println("\nPlease enter a valid fraction.");
                        continue;
                    }
                    /**
                     * Converts the string values of the array to an integer and saves it
                     */
                    numInput = Integer.parseInt(fraction[0]);
                    denInput = Integer.parseInt(fraction[1]);
                    validValueRead = true; // Changes the check value, ending the program
                } else // Construct a whole number value if the user inputs a whole number
                    return new Fraction(Integer.parseInt(inputFrac));
            } catch (NumberFormatException ex) { // Catches NumberFormatException error and tries again
                validValueRead = false;
                System.out.println("You may have entered an invalid input.");
                System.out.println("Try again.");
            }
        }
        return new Fraction(numInput, denInput);
    }

    public int readOption(){
        int value = -1; // Initializes the input for the option
        boolean validValueRead = false; // Initializes the boolean value of the checker for the loop
        while(!validValueRead) {
            try {
                System.out.print("+------------------------------------------+\n" +
                    "| What do you want to do?                  |\n" +
                    "|                                          |\n" +
                    "| <1>. Add fractions                       |\n" +
                    "| <2>. Subtract fractions                  |\n" +
                    "| <3>. Multiply fractions                  |\n" +
                    "| <4>. Divide fractions                    |\n" +
                    "| <5>. Reduce a fraction                   |\n" +
                    "| <6>. Quit                                |\n" +
                    "+------------------------------------------+\n" +
                    "Enter operation code: "); // Prints the prompt message
                value = Integer.parseInt(scanner.nextLine()); // Takes the user's input
                if (value < 1 || value > 6 ){ // Prompts the user if input is not within the range of choices
                    System.out.println("Input must be ranging from "+ 1 + " to "+ 6 + ".");
                } else
                    validValueRead = true; // Updates the checker variable and ends the loop
            } catch (NumberFormatException x){ // Catches NumberFormatException error and tries again
                validValueRead = false;
                System.out.println("You may have entered an invalid input.");
                System.out.println("Try again. ");
            } // end of catch
        } // end of while
        return value;
    } // end of readInteger method
}
/*
Sample run:

Welcome to the Fraction Calculator!
This program allows you to reduce, and do arithmetic operations with fractions.

+------------------------------------------+
| What do you want to do?                  |
|                                          |
| <1>. Add fractions                       |
| <2>. Subtract fractions                  |
| <3>. Multiply fractions                  |
| <4>. Divide fractions                    |
| <5>. Reduce a fraction                   |
| <6>. Quit                                |
+------------------------------------------+
Enter operation code: 1
Please enter a fraction a/b, where a and b are integers.

Enter fraction number 1: 2/4
Please enter a fraction a/b, where a and b are integers.

Enter fraction number 2: 1/4
Result is equal to 3/4 or 0.75

Your previous calculation is saved, type "ans" on the fraction input to use the previous answer.
Enter the next operation.
+------------------------------------------+
| What do you want to do?                  |
|                                          |
| <1>. Add fractions                       |
| <2>. Subtract fractions                  |
| <3>. Multiply fractions                  |
| <4>. Divide fractions                    |
| <5>. Reduce a fraction                   |
| <6>. Quit                                |
+------------------------------------------+
Enter operation code: 3
Please enter a fraction a/b, where a and b are integers.

Enter fraction number 1: ans
Please enter a fraction a/b, where a and b are integers.

Enter fraction number 2: 24/32
Result is equal to 72/128 or 0.56

Your previous calculation is saved, type "ans" on the fraction input to use the previous answer.
Enter the next operation.
+------------------------------------------+
| What do you want to do?                  |
|                                          |
| <1>. Add fractions                       |
| <2>. Subtract fractions                  |
| <3>. Multiply fractions                  |
| <4>. Divide fractions                    |
| <5>. Reduce a fraction                   |
| <6>. Quit                                |
+------------------------------------------+
Enter operation code: 5
Please enter a fraction a/b, where a and b are integers.

Enter fraction: ans
Result is equal to 9/16 or 0.56

Your previous calculation is saved, type "ans" on the fraction input to use the previous answer.
Enter the next operation.
+------------------------------------------+
| What do you want to do?                  |
|                                          |
| <1>. Add fractions                       |
| <2>. Subtract fractions                  |
| <3>. Multiply fractions                  |
| <4>. Divide fractions                    |
| <5>. Reduce a fraction                   |
| <6>. Quit                                |
+------------------------------------------+
Enter operation code: 6
Thank you for using the Fraction Calculator!

Process finished with exit code 0
 */