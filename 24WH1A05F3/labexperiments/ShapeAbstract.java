package labexperiments;

import java.util.Scanner;

abstract class Shape {
    protected int a, b;
    
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

    @Override
    void printArea() {
        int area = a * b;
        System.out.println("Area of Rectangle (Length=" + a + ", Width=" + b + "): " + area);
    }
}


class Triangle extends Shape {
    public Triangle(int base, int height) {
        super(base, height);
    }

    @Override
    void printArea() {
     
        double area = 0.5 * a * b;
        System.out.println("Area of Triangle (Base=" + a + ", Height=" + b + "): " + area);
    }
}
class Circle extends Shape {
    public Circle(int radius) {
        
        super(radius, 0); 
    }

  
    public Circle(int radius, int ignored) {
        super(radius, 0);
    }

    @Override
    void printArea() {
        
        final double PI = 3.14159;
        double area = PI * a * a;
        System.out.println("Area of Circle (Radius=" + a + "): " + area);
    }
}

public class ShapeAbstract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dim1, dim2;

        System.out.println("--- Calculate Areas ---");
        
      
        System.out.print("\nEnter Rectangle Length: ");
        dim1 = sc.nextInt();
        System.out.print("Enter Rectangle Width: ");
        dim2 = sc.nextInt();
        Shape rectangle = new Rectangle(dim1, dim2);

       
        System.out.print("\nEnter Triangle Base: ");
        dim1 = sc.nextInt();
        System.out.print("Enter Triangle Height: ");
        dim2 = sc.nextInt();
        Shape triangle = new Triangle(dim1, dim2);


        System.out.print("\nEnter Circle Radius: ");
        dim1 = sc.nextInt();
       
        Shape circle = new Circle(dim1, 0); 

        sc.close();

 
        System.out.println();
        rectangle.printArea();
        triangle.printArea();
        circle.printArea();
    }
}