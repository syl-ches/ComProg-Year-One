/*
Name: Caliva Mark Chester P.
Programming Date: September, 21 2023
Activity Name and Number: Prelim Programming Exercise Number 8

Problem:
Write a program for determining the roots of a quadratic equation. A quadratic equation
has the form ax2 + bx + c = 0. The numerical coefficients a, b and c should be entered at
run time. The literal coefficient is assumed to be x (i.e. There is no need to read the
literal coefficient).

Notes:
Quadratic Formula
first root = (-b + Math.sqrt(b*b-4*a*c))/(2*a)
second root = (-b - Math.sqrt(b*b - 4*a*c))/(2*a)

Sample run:
------------------------------------------------------------
Enter the coefficient of x squared (a): 1
Enter the coefficient of x (b): -4
Enter the constant (c): 4
The roots of (1)x^2 + (-4)x + (4) = 0 are 2.00 and 2.00.
------------------------------------------------------------

Analysis
Inputs: Coefficients a, b and c
Processes:
        Read the coefficients
        Compute the roots
        Show the roots
Outputs: First root and second root

Algorithm
1. Let a represent the coefficient of x squared
2. Let b represent the coefficient of x
3. Let c represent in constant
4. Let root1 represent the first root
5. Let root2 represent the second root
6. Show an introduction of the application/program
7. Read the value of a
8. Read the value of b
9. Read the value of c
10. Compute root1: root1 = (-b + Math.sqrt(b*b - 4*a*c))/(2*a)
11. Compute root2: root2 = (-b - Math.sqrt(b*b - 4*a*c))/(2*a)
12. Display the roots.
*/


package exercises.prelim;
import java.util.Scanner;
import java.lang.*;

public class QuadraticSolver {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        double a = 0, b = 0, c = 0;
        double root1 = 0, root2 = 0;
        System.out.println("This program determines the roots of a quadratic equation" +
                            "\nof the form ax^2 +bx +c = 0.");
        System.out.print("Enter the coefficient of x^2 (a): ");
        a = Double.parseDouble(keyboard.nextLine());

        System.out.print("Enter the coefficient of x (b): ");
        b = Double.parseDouble(keyboard.nextLine());

        System.out.print("Enter the constant (c): ");
        c = Double.parseDouble(keyboard.nextLine());

        root1= (-b + Math.sqrt(b*b-4*a*c))/(2*a);

        root2= (-b - Math.sqrt(b*b-4*a*c))/(2*a);

        System.out.printf("The roots of "+a+"x^2 + "+b+"x + "+c+" ; \n %c%.2f%s%.2f%s%.2f%s%.2f%s%.2f%c%n", '(', a,  ")x^2 +" +
                        "(",b, ")x + (", c, ") = 0 are ", root1, " and ", root2, '.');

        System.exit(0);
    }       // end of main method
}           //end of class
