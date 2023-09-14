/*
* Name: Caliva Mark Chester P.
* Programming Date: August, 23 2023
* Activity Name and Number: Prelim Exercise Number 2
*   -----------------------------------------------------------------
    Input: Radius of a circle (radius)
    Processes: Compute the circumference of the circle
    Compute the area of the circle
    Display results
    Output: circumference, area
    ------------------------------------------------------------------
    Algorithm:
            1. Assign the radius of the circle
            2. Compute the circumference : circumference = 2*(3.1416)*radius
            3. Compute the area: area = PI*radius*radius
            4. Show the radius of the circle
            5. Show the circumference of the circle
            6. Show the area of the circle
    -------------------------------------------------------------------
*/

package exercises.prelims;
import java.lang.*;
public class Circle {

    public static void main(String [] args) {
    /* Every variable must be declared with a data type with reference to the kind of
       value that is to be assigned to it. If the value for a radius is constrained to a
       whole number and circumference and area may be floating point numbers (A floating
       point number is a number with the decimal point), the variables' radius,
       circumference and areaOfCircle must be respectively declared with the int, double
       and double data types as shown in the following lines

     */
     int radius;
     double circumference;
     double areaOfCircle;

     // Assignment statement that stores a value to a variable.
     radius = 10;    //Assigns the integer value 10 to radius.
      // A mathematical expression represents a value that may be assigned to a variable
     circumference = 2 * 3.1416 * radius;
     // Instead of typing 3.1.416, you may type Math.PI

     areaOfCircle = 3.1416 * radius * radius;

     // Show some outputs on the screen
     System.out.println();
     System.out.println();
     System.out.println(" **********************************************************");
     System.out.println(" *                                                        *");
     System.out.println(" *                                                        *");
     System.out.println(" *       Radius of circle is   " + radius +"              *");
     System.out.println(" *       Circumference of circle is " + circumference + " *");
     System.out.println(" *       Area of circle is " + areaOfCircle +"            *");
     System.out.println(" *                                                        *");
     System.out.println(" *                                                        *");
     System.out.println(" **********************************************************");






    }  // end of main method
}      // end of class


