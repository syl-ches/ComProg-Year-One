/*
Name: Caliva Mark Chester P.
Programming Date: September, 13 2023
Activity Name and Number: Prelim Programming Exercise 4.3

Problem:
Modify the program Right Triangle so that the values for the base and the height will be
read from the keyboard at run time through the Scanner class.

Analysis:
        Input: Base of right triangle
               Height of right triangle
        Processes:
                Read the base of right triangle
                Read the height of right triangle
                Compute the area of right triangle
                Compute the perimeter of right triangle
                Display results
        Output: area, perimeter

Algorithm:
        1. Read/Accept the height and base of right triangle
        2. Compute the area: area = 1/2 * height * base
        3. Compute the perimeter: perimeter = height + base + hypotenuse
        4. Show the given base of the right triangle
        5. Show the given height of the right triangle
        6. Show the computed perimeter of right triangle
        7. Show the computed area of right triangle
 */
import java.util.Scanner;
public class RightTriangle3 {
    public static void main(String[] args) {
        // below asks the user to input a given base and height
        Scanner keyboard = new Scanner (System.in);
        System.out.println("Enter the base of the triangle: ");
        double base;
        base = Double.parseDouble(keyboard.nextLine());

        System.out.println("Enter the height of the triangle: ");
        double height;
        height = Double.parseDouble(keyboard.nextLine());



        // Below computes the perimeter and the area of a right triangle



        double c = 10;
        double area;
        double perimeter;
        perimeter = height + base + c;
        area = 0.5 * height * base;
        System.out.println(" The given base is "+base+" ");
        System.out.println(" The given height is "+height+" " );
        System.out.println(" The given hypotenuse is " + c + " ");
        System.out.println(" The computed perimeter of the right triangle " + perimeter + "  ");
        System.out.println(" The computed area of the right triangle is " + area + "  ");

        System.exit(0);
    } // end of main method
} // end of class