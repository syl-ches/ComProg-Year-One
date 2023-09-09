/*
Name: Caliva, Mark Chester P.
Programming Date: September 7 2023
Activity Name and Number: Prelim Exercise Number 2.2

Problem:
Create a program that computes and shows the perimeter and the area of a square with a given side.
Analysis:
    Input: Side of the square
    Processes: Computes the perimeter and area of the square
               Display results
    Output: perimeter, area
Algorithm:
    1. Assign the side of the square
    2. Compute the perimeter of the square = 4*side
    3. Compute the area of the square = side*side
    4. Show the given side
    5. Show the computed perimeter of the square
    6. Show the computed area of the square
*/
package exercises.prelims;

public class Square {
    //Below computes the area and the perimeter of the square with a given side
    //the given side of the square is x
    public static void main(String [] args) {
    double x;
    double perimeter;
    double area;
    x = 5;
    area = Math.pow(x, 2);
    perimeter = 4 * x;
    System.out.println(" The given side of the square is "+x+" ");
    System.out.println(" The computed perimeter of the square is "+perimeter+"   ");
    System.out.println(" The computed area of the square is  "+area+"  ");
    } //end of main method
} //end of class
