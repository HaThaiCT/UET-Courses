// Import your library
// Do not change the name of the Solution class

public class Solution {
    // Type your main code here
    private int numerator;
    private int denominator;

    /** getter numerator */
    public int getNumerator() {
        return numerator;
    }

    /** getter denominator */
    public int getDenominator() {
        return denominator;
    } 

    /** setter numerator */
    public void setNumerator(int n) {
        numerator = n;
    }

    /** setter denominator */
    public void setDenominator(int d) {
        denominator = d;
    }

    /** Contructor */
    public Solution(int numerator , int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    /** Rut gon phan so */
    public Solution reduce() {
        int gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
        return this;
    } 

    /** add */
    public Solution add(Solution other) {
        this.numerator = this.numerator * other.denominator + this.denominator * other.numerator;
        this.denominator = this.denominator * other.denominator;
        return this.reduce();
    }

    /** subtract */
    public Solution subtract(Solution other) {
        this.numerator = this.numerator * other.denominator - this.denominator * other.numerator;
        this.denominator = this.denominator * other.denominator;
        return this.reduce();         
    }

    /** multipy */
    public Solution multiply(Solution other) {
        this.numerator = this.numerator * other.numerator;
        this.denominator = this.denominator * other.denominator;
        return this.reduce();
    }

    /** divide */
    public Solution divide(Solution other) {
        this.numerator = this.numerator * other.denominator;
        this.denominator = this.denominator * other.numerator;
        return this.reduce();   
    }

    /** equal */
    public boolean equal 

}