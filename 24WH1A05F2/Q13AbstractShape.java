package java_lab_exp;
abstract class Shape {
    int a, b;
    abstract void printArea();
}
class Rectangle extends Shape {
    Rectangle(int l, int w) { a = l; b = w; }
    void printArea() {
        System.out.println("Rectangle area = " + (a * b));
    }
}
class Triangle extends Shape {
    Triangle(int base, int height) { a = base; b = height; }
    void printArea() {
        System.out.println("Triangle area = " + (0.5 * a * b));
    }
}
class Circle extends Shape {
    int r;
    Circle(int radius) { r = radius; }
    void printArea() {
        System.out.println("Circle area = " + (3.14 * r * r));
    }
}
public class Q13AbstractShape {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 10);
        Triangle tri = new Triangle(4, 6);
        Circle cir = new Circle(7);

        rect.printArea();
        tri.printArea();
        cir.printArea();
    }
}
