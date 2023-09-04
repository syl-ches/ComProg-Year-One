import java.lang.*;
public class RightTriangle2 {
    public static void main(String[] args) {

        double b = 8;
        double a = 6;
        double height;
        double base;
        base = Math.pow(b, 2);
        height = Math.pow(a, 2);
        double hypotenuse;
        hypotenuse = Math.sqrt(base + height);
        System.out.println(" Computed hypotenuse is "+ hypotenuse +"  ");
    }
}
