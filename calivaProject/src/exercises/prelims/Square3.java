/*
Name: Caliva, Mark Chester P.
Programming Date: September, 11 2023
Activity Name and Number: Prelim Programming Exercise 4.2

Problem:
Modify the program Square so that the measurement of the side of the square will be read from the keyboard
at run time through the Scanner class.

Analysis:
        Input: Side of square
        Processes: Read the side of the square
                   Compute the perimeter of the square
                   Compute the area of the square
                   Display results
Algorithm:
        1. Read/Accept the side of the square
        2. Compute the perimeter: perimeter = 4 * side
        3. Compute the area: area = side^2
        4. Show the side of the square
        5. Show computed perimeter of the square
        6. Show the computed area of the square

 */

package exercises.prelims;
import java.util.Scanner;
public class Square3 {
    public static void main(String[] args) {
        Scanner side = new Scanner(System.in);
        double x;
        System.out.println("Please enter the measure of the side of the square: ");
         x = Double.parseDouble(side.nextLine());

        double perimeter;
        double area;

        area = Math.pow(x, 2);
        perimeter = 4 * x;
        System.out.println(" The side of the square is "+x+" ");
        System.out.println(" The computed perimeter of the square is "+perimeter+"   ");
        System.out.println(" The computed area of the square is  "+area+"  ");
    }
}
