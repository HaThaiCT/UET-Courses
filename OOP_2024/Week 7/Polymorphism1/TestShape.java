import Polymorphism1.Circle;
import Polymorphism1.Shape;

public class TestShape {
    
    public static void main(String[] args) {
		Shape s4 = new Square(6.6);
//		System.out.println(s4);
//		System.out.println(s4.getArea());
//		System.out.println(s4.getColor());
		//System.out.println(s4.getSide());

		Rectangle r2 = (Rectangle)s4;
		//System.out.println(r2);
		System.out.println(r2.getArea());
		System.out.println(r2.getColor());
		//System.out.println(r2.getSide());
		System.out.println(r2.getLength());

//		Square sq1 = (Square)r2;
//		System.out.println(sq1);
//		System.out.println(sq1.getArea());
//		System.out.println(sq1.getColor());
//		System.out.println(sq1.getSide());
//		System.out.println(sq1.getLength());
    }
}
