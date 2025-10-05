package srivaishnavi;
//Abstract class Shape
abstract class Shape {
 protected int dimension1;
 protected int dimension2;
 
 // Constructor
 public Shape(int dimension1, int dimension2) {
     this.dimension1 = dimension1;
     this.dimension2 = dimension2;
 }
 
 // Empty method to be implemented by subclasses
 public abstract void printArea();
}

//Rectangle class extending Shape
class Rectangle extends Shape {
 public Rectangle(int length, int width) {
     super(length, width);
 }
 
 @Override
 public void printArea() {
     double area = dimension1 * dimension2;
     System.out.println("Area of Rectangle with length " + dimension1 + 
                       " and width " + dimension2 + " is: " + area);
 }
}

//Triangle class extending Shape
class Triangle extends Shape {
 public Triangle(int base, int height) {
     super(base, height);
 }
 
 @Override
 public void printArea() {
     double area = 0.5 * dimension1 * dimension2;
     System.out.println("Area of Triangle with base " + dimension1 + 
                       " and height " + dimension2 + " is: " + area);
 }
}

//Circle class extending Shape
class Circle extends Shape {
 public Circle(int radius) {
     super(radius, 0); // Only one dimension needed for circle
 }
 
 @Override
 public void printArea() {
     double area = Math.PI * dimension1 * dimension1;
     System.out.println("Area of Circle with radius " + dimension1 + " is: " + area);
 }
}

//Main class to test the implementation
public class Abstractclassshape {
 public static void main(String[] args) {
     // Create different shapes
     Shape rectangle = new Rectangle(5, 3);
     Shape triangle = new Triangle(4, 6);
     Shape circle = new Circle(7);
     
     // Print areas
     rectangle.printArea();
     triangle.printArea();
     circle.printArea();
 }
}

