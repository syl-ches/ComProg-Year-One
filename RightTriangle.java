/*
Name: Caliva, Mark Chester P.
Programming Date: September 7 2023
Activity Name and Number: Prelim Exercise 2.3

Problem: 
Create a program that computes and shows the perimeter and the area of a Right Triangle with a given base,
height and hypotenuse.
Analysis:
    Input:  base, height, and hypotenuse of right triangle
    Processes: Compute the perimeter and area of the right triangle
               Show results
    Output: perimeter, area
Algorithm:
    1. Assign the given base, height, and hypotenuse
    2. Compute the perimeter = base + height + hypotenuse
    3. Compute the area = (1/2) * base * height
    4. Show the given base, height, and hypotenuse
    5. Show the perimeter of the right triangle
    6. Show the area of the right triangle
*/

package exercises.prelims;

public class RightTriangle {
    public static void main(String[] args) {
        // Below computes the perimeter and the area of a right triangle
        // a is the  height, b is the base, and c is the hypotenuse
        double a = 6;
        double b = 8;
        double c = 10;
        double area;
        double perimeter;
        perimeter = a + b + c;
        area = 0.5 * a * b;
        System.out.println(" The given base is "+b+" \n The given height is "+6+" \n The given hypotenuse is "+c+" ");
        System.out.println(" The computed perimeter of the right triangle "+perimeter+"  ");
        System.out.println(" The computed area of the right triangle is "+area+"  ");
    } //end of main method
} //end of class
