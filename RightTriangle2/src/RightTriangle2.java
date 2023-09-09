/*
Name: Mark Chester P. Caliva
Programming Date: September 4 2023
Activity Name and Number: Prelim Exercise Number 3.1

Problem:
Create a program for determining the hypotenuse of a Right Triangle with a given base and height.
Analysis:
    Input: base and height of right triangle
    Process: Computes the hypotenuse of the right triangle
             Display the data associated with the right triangle
    Output: Hypotenuse of the right triangle
Algorithm:
    1. Assign the base and height of the right triangle
    2. Compute the hypotenuse = base^2 + height^2
    3. Show the given base and height of the right triangle
    4. Show the computed hypotenuse with a given base and height
*/

import java.lang.*;
public class RightTriangle2 {
    public static void main(String[] args) {
        //below computes the hypotenuse with a given base and height
        //the given base is b, and the given height is a
        double b = 8;
        double a = 6;
        double height;
        double base;
        base = Math.pow(b, 2);
        height = Math.pow(a, 2);
        double hypotenuse;
        hypotenuse = Math.sqrt(base + height);
        System,out.println(" Given base is "+b+" \n Given height is "+a+"  ");
        System.out.println(" Computed hypotenuse is "+ hypotenuse +"  ");
    }//end of main method
}//end of class
