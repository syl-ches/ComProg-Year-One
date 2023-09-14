package exercises.prelims;

public class RightTriangle {
    public static void main(String[] args) {
        // Below computes the perimeter and the area of a right triangle
        double a = 6;
        double b = 8;
        double c = 10;
        double area;
        double perimeter;
        perimeter = a + b + c;
        area = 0.5 * a * b;
        System.out.println(" The computed perimeter of the right triangle "+perimeter+"  ");
        System.out.println(" The computed area of the right triangle is "+area+"  ");



    }
}
