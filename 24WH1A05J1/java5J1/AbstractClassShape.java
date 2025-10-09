import java.util.Scanner;

abstract class Shape {
    int dim1, dim2;

    abstract void printArea();
}


class Rectangle extends Shape {
    Rectangle(int length, int breadth) {
        dim1 = length;
        dim2 = breadth;
    }

    void printArea() {
        int area = dim1 * dim2;
        System.out.println("Rectangle Area: " + area);
    }
}


class Triangle extends Shape {
    Triangle(int base, int height) {
        dim1 = base;
        dim2 = height;
    }

    void printArea() {
        double area = 0.5 * dim1 * dim2;
        System.out.println("Triangle Area: " + area);
    }
}


class Circle extends Shape {
    Circle(int radius) {
        dim1 = radius;
        dim2 = 0; // Not used, but kept because Shape has 2 integers
    }

    void printArea() {
        double area = 3.14159 * dim1 * dim1;
        System.out.println("Circle Area: " + area);
    }
}


public class ShapeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter length and breadth of rectangle: ");
        int l = sc.nextInt();
        int b = sc.nextInt();
        Shape rect = new Rectangle(l, b);
        rect.printArea();

        
        System.out.print("Enter base and height of triangle: ");
        int base = sc.nextInt();
        int h = sc.nextInt();
        Shape tri = new Triangle(base, h);
        tri.printArea();

        
        System.out.print("Enter radius of circle: ");
        int r = sc.nextInt();
        Shape cir = new Circle(r);
        cir.printArea();

        sc.close();
    }
}
