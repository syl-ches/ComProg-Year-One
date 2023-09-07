package exercises.prelims;


public class Rectangle {
    public static void main(String[] args) {
        // Below computes the perimeter of a rectangle and area of the rectangle
        double a = 5;
        double b = 7;
        double length;
        double width;
        double perimeter;
        length = a * 2;
        width = b * 2;
        double area = a * b;
        perimeter = length + width;
        System.out.println(" The perimeter of the rectangle is " +perimeter+ " ");
        System.out.println(" The area of the rectangle is "+area+" ");
    }
}
