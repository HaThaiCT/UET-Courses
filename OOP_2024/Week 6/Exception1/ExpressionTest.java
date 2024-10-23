

public class ExpressionTest {

    /**
     * main.
     * @param args 1
     */
    public static void main(String[] args) {
        Expression num10 = new Numeral(10);
        Expression num2 = new Numeral(2);
        Expression num3 = new Numeral(3);
        Expression num4 = new Numeral(4);
        Expression num0 = new Numeral(0);
        // Biểu thức 10^2
        Expression power = new Square(num10);
        // Biểu thức 4*3
        Expression multiplication = new Multiplication(num4, num3);
        // Biểu thức 10^2 - 3
        Expression subtraction = new Subtraction(power, num3);
        // Biểu thức (10^2 - 3 + 4*3)
        Expression addition = new Addition(subtraction, multiplication);
        // Biểu thức ((10^2 - 3 + 4*3)^2)
        Expression square = new Square(addition);

        Expression ans = new Division(square, num0);
        // In kết quả
        System.out.println(ans.toString() + " = " + ans.evaluate());
    }
}
