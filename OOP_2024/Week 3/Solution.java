// Import your library
// Do not change the name of the Solution class

public class Solution {
    // Type your main code here
    private int numerator;
    private int denominator;

    /** getter numerator. */
    public int getNumerator() {
        return this.numerator;
    }

    /** getter denominator. */
    public int getDenominator() {
        return this.denominator;
    } 

    /** setter numerator. */
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    /** setter denominator. */
    public void setDenominator(int denominator) {
        if (denominator == 0) {
            denominator = 1;
        }
        this.denominator = denominator;
    }

    /** Contructor. */
    public Solution(int numerator, int denominator) {
        if (denominator == 0) {
            denominator = 1;
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    /**
     * Contructor.
     */
    public Solution() {
        this.denominator = 1;
    }

    /** gcd. */
    public int gcd(int a, int b) {
        if (b != 0) {
            return gcd(b, a % b);
        } 
        return a;
    }

    /** Rut gon phan so. */
    public Solution reduce() {
        int gcd = gcd(this.numerator, this.denominator);
        this.numerator /= gcd;
        this.denominator /= gcd;
        return this;
    } 

    /** add. */
    public Solution add(Solution other) {
        this.numerator = this.numerator * other.denominator + this.denominator * other.numerator;
        this.denominator = this.denominator * other.denominator;
        return this.reduce();
    }

    /** subtract. */
    public Solution subtract(Solution other) {
        this.numerator = this.numerator * other.denominator - this.denominator * other.numerator;
        this.denominator = this.denominator * other.denominator;
        return this.reduce();         
    }

    /** multipy. */
    public Solution multiply(Solution other) {
        this.numerator = this.numerator * other.numerator;
        this.denominator = this.denominator * other.denominator;
        return this.reduce();
    }

    /** divide. */
    public Solution divide(Solution other) {
        this.numerator = this.numerator * other.denominator;
        this.denominator = this.denominator * other.numerator;
        return this.reduce();   
    }

    /** equal. */
    public boolean equals(Object obj) {
        if (obj instanceof Solution) {
            Solution other = (Solution) obj;
            Solution a = this.reduce();
            Solution b = other.reduce();
            if (a.numerator == b.numerator && a.denominator == b.denominator) {
                return true;
            }
        }
        return false; 
    }

    /**
     * main.
     */
    public static void main(String[] args) {}

}