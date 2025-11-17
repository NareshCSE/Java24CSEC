package java_25wh5a0520;
abstract class Shape{
	int a,b;
	public Shape(int a,int b) {
		this.a=a;
		this.b=b;
	}
	abstract void printArea();
}
class Rectangle extends Shape{
	public Rectangle(int length,int breadth) {
		super(length,breadth);
	}
	void printArea() {
		int area=a*b;
		System.out.println("area of rectangle :"+area);
	}
}
class Triangle extends Shape{
	public Triangle(int base, int height) {
		super(base,height);
	}
	void printArea() {
		double area=0.5*a*b;
		System.out.println("area of triangle : "+area);	
	}
}
class Circle extends Shape{
	public Circle(int radius) {
		super(radius,0);
	}
	void printArea() {
		double area=Math.PI*a*a;
		System.out.println("area of circle : "+area);
	}
}
public class Abstract_ShapeClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape rectangle=new Rectangle(5,10);
		rectangle.printArea();
		Shape triangle=new Triangle(3,7);
		triangle.printArea();
		Shape circle=new Circle(5);
		circle.printArea();

	}
}
