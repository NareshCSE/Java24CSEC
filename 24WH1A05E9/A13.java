package practicefiles;

abstract class Shape {
    int a, b;
    public Shape(int a, int b) {
        this.a = a;
        this.b = b;
    }
    abstract void printArea();
}

class Rectangle extends Shape {
    public Rectangle(int length, int width) {
        super(length, width);
    }

    void printArea() {
        int area = a * b;
        System.out.println("Rectangle area: " + area);
    }
}

class Triangle extends Shape {
    public Triangle(int base, int height) {
        super(base, height);
    }

    void printArea() {
        double area = 0.5 * a * b;
        System.out.println("Triangle area: " + area);
    }
}

class Circle extends Shape {
    public Circle(int radius) {
        super(radius, 0);
    }
    void printArea() {
        double area = Math.PI * a * a;
        System.out.println("Circle area: " + area);
    }
}

public class A13 {
    public static void main(String[] args) {
        Shape rect = new Rectangle(5, 10);
        rect.printArea();

        Shape tri = new Triangle(4, 7);
        tri.printArea();

        Shape circle = new Circle(3);
        circle.printArea();
    }
}