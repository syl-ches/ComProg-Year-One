package prog2.prelim;

import java.text.DecimalFormat;

public class Fraction {
    private int numerator;
    private int denominator;
    private Fraction resultFrac;

    /**
     * Constructor for the fractions to be used.
     * @param n
     * @param d
     */
    public Fraction(int n, int d) {
        this.numerator = n;
        this.denominator = d;
    }

    /**
     * Constructor for a whole number if the user entered
     * a whole number instead of a fraction.
     *
     * This program can still perform operations on non fraction values.
     * @param wholeNumVal
     */
    public Fraction(int wholeNumVal) {
        numerator = wholeNumVal;
        denominator = 1;
    }

    /**
     * Setter for the numerator
     * @param num
     */
    public void setNumerator(int num) {
        this.numerator = num;
    }

    /**
     * Getter for the numerator
     * @return
     */
    public int getNumerator() {
        return numerator;
    }

    /**
     * Setter for the denominator
     * @param den
     */
    public void setDenominator(int den) {
        this.denominator = den;
    }

    /**
     * Getter for the denominator
     * @return
     */
    public int getDenominator() {
        return denominator;
    }

    /**
     * Method for printing
     * returns the string to be printed
     * @return
     */
    public String toString() {
        DecimalFormat df = new DecimalFormat("####0.00");
        return ("Result is equal to "+ numerator +"/"+denominator + " or "+ df.format((double)numerator/denominator));
    }

    /**
     * Method for computing the GCD of a fraction
     * returns the GCD
     * @param numerator
     * @param denominator
     * @return
     */
    private int computeGCD(int numerator, int denominator) {
        int gcd = 0;
        for (int i = 1; i <= numerator && i <= denominator; i++){
            if (numerator%i == 0 && denominator%i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    /**
     * Method for computing the LCM of two fractions
     * returns the LCM
     * @param d1
     * @param d2
     * @return
     */
    private int computeLCM(int d1, int d2) {
        int lcm = Math.max(d1, d2);
        while (true) {
            if (lcm % d1 == 0 && lcm % d2 == 0) {
                break;
            }
            ++lcm;
        }
        return lcm;
    }

    /**
     * Method for adding the two fractions
     * returns the sum of the fractions
     * @param other
     * @return
     */
    public Fraction add(Fraction other) {
        int lcm = computeLCM(this.denominator, other.denominator);

        int resultNumerator = ((lcm/this.denominator)*this.numerator) + ((lcm/other.denominator)*other.numerator) ;

        return resultFrac = new Fraction(resultNumerator, lcm);
    }

    /**
     * Method for subtracting the two fractions
     * returns the difference of the fraction
     * @param other
     * @return
     */
    public Fraction subtract(Fraction other) {
        int lcm = computeLCM(this.denominator, other.denominator);

        int resultNumerator = ((lcm/this.denominator)*this.numerator) - ((lcm/other.denominator)*other.numerator) ;

        return resultFrac = new Fraction(resultNumerator, lcm);
    }

    /**
     * Method for multiplying the two fractions
     * returns the product of the fractions
     * @param other
     * @return
     */
    public Fraction multiply(Fraction other) {
        int resultNumerator = this.numerator* other.numerator;
        int resultDenominator = this.denominator*other.denominator;

        return resultFrac = new Fraction(resultNumerator, resultDenominator);
    }

    /**
     * Method for dividing the two fractions
     * returns the quotient of the fractions
     * @param other
     * @return
     */
    public Fraction divide(Fraction other) {
        int resultNumerator = this.numerator* other.denominator;
        int resultDenominator = this.denominator*other.numerator;

        return resultFrac = new Fraction(resultNumerator, resultDenominator);
    }

    /**
     * Method for reducing a fraction
     * returns a reduced version of the fraction
     * @return
     */
    public Fraction reduce() {
        int gcd = computeGCD(this.numerator, this.denominator);
        return resultFrac = new Fraction(this.numerator/gcd, this.denominator/gcd);
    }
}
