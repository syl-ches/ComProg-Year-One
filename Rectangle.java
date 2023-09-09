/*
Name: Caliva, Mark Chester P.
Programming Date: September 7 2023
Activity Name and Number: Prelim Exercise Number 2.1
Problem:
Create a program that computes and shows the perimeter and the area of a rectangle with a given length and
width.
Analysis:
    Input: lenght and witdth
    Processes: Computes the perimeter and the area of the rectangle with the given length and width
               Display results
    Output: perimeter, area
Algorithm:
    1. Assign the length and width of the rectangle
    2. Compute the perimeter = 2*length + 2*width
    3. Compute the area = length*width
    4. Show the perimeter of the rectangle
    5. Show the area of the rectangle
    6. Show the given length and width of the rectangle
*/

package exercises.prelims;
public class Rectangle {
    public static void main(String[] args) {
        // Below computes the perimeter of a rectangle and area of the rectangle
        // a is thhe width of the rectangle, and b is the length of the rectangle
        double a = 5;
        double b = 7;
        double length;
        double width;
        double perimeter;
        length = a * 2;
        width = b * 2;
        double area = a * b;
        perimeter = length + width;
        System.out.println(" The length of the rectangle is "+b+" \n The width of the rectangle is "+a+"    ");
        System.out.println(" The perimeter of the rectangle is " +perimeter+ " ");
        System.out.println(" The area of the rectangle is "+area+" ");
    }
}
