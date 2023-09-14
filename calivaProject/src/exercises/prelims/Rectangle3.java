/*
Name: Caliva, Mark Chester P.
Programming Date: September, 11 2023
Activity Name and Number: Prelim Programming Exercise 4.1

Problem:
Modify the program rectangle so that the values for the length and the width will be read
from the keyboard at run time through the Scanner class

Analysis:
        Input: length of rectangle
               width of rectangle
        Processes:
                Read the length of the rectangle
                Read the width of the rectangle
                Compute the perimeter of the rectangle
                Compute the area of the rectangle
        Output: perimeter, area

Algorithm:
        1. Read/Accept the length and width of the rectangle
        2. Compute the perimeter: perimeter = length^2 + width^2
        3. Compute the area: length * width
        4. Show the length of the rectangle
        5. Show the width of the rectangle
        6. Show the computed area of the rectangle
        7. Show the computed perimeter of the rectangle
 */
package exercises.prelims;
import java.util.Scanner;
public class Rectangle3 {
    public static void main(String[] args){
        // Below ask the user to give the length and width of a rectangle
        Scanner mark = new Scanner(System.in);
        double a;           // variable declaration
        double b;           // variable declaration
        System.out.println(" Enter the length of the rectangle: ");
        a = Double.parseDouble(mark.nextLine());

        System.out.println(" Enter the width of the rectangle: ");
        b = Double.parseDouble(mark.nextLine());

        // Below computes the perimeter of a rectangle and area of the rectangle
        double length;
        double width;
        double perimeter;
        length = a * 2;
        width = b * 2;
        double area = a * b;
        perimeter = length + width;
        System.out.println(" The length of the square is " +a+" ");
        System.out.println(" The width of the square is "+b+" ");
        System.out.println(" The perimeter of the rectangle is " +perimeter+ " ");
        System.out.println(" The area of the rectangle is "+area+" ");
    }
}
