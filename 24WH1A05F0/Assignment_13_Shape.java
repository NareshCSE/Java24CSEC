package lab_assignments;

abstract class Shape {
    int x, y;
    Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    abstract void printArea();
}
class Rectangle extends Shape {
    Rectangle(int length, int breadth) {
        super(length, breadth);
    }

    @Override
    void printArea() {
        int area = x * y;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Triangle extends Shape {
    Triangle(int base, int height) {
        super(base, height);
    }

    @Override
    void printArea() {
        double area = 0.5 * x * y;
        System.out.println("Area of Triangle: " + area);
    }
}

class Circle extends Shape {
    Circle(int radius) {
        super(radius, 0);
    }

    @Override
    void printArea() {
        double area = 3.14159 * x * x;
        System.out.println("Area of Circle: " + area);
    }
}
public class Assignment_13_Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle = new Rectangle(5, 10);
	       Triangle triangle = new Triangle(4, 6);
	       Circle circle = new Circle(7);

	       rectangle.printArea();
	       triangle.printArea();
	       circle.printArea();


	}

}

