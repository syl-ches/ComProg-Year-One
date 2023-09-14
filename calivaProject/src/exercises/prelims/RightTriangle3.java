package exercises.prelims;
import java.util.Scanner;
public class RightTriangle3 {
    public static void main(String[] args) {
    Scanner jinx = new Scanner(System.in);
    System.out.println("Enter the base of the triangle:");
        double a;
        double b;

        a = Double.parseDouble(jinx.nextLine());
        System.out.println("Enter the height of the triangle:");
        b = Double.parseDouble(jinx.nextLine());
        // Below computes the perimeter and the area of a right triangle

        double c = 10;
        double area;
        double perimeter;
        perimeter = a + b + c;
        area = 0.5 * a * b;
        System.out.println(" The computed perimeter of the right triangle "+perimeter+"  ");
        System.out.println(" The computed area of the right triangle is "+area+"  ");
    }
}
