package navya_25wh5a0517;


abstract class Shape2 {
protected int dim1;
protected int dim2;
public Shape2(int dim1, int dim2) {
this.dim1 = dim1;
this.dim2 = dim2;
}
abstract void printArea();
}
class Rectangle extends Shape2 {
public Rectangle(int length, int breadth) {
super(length, breadth);
}
@Override
public void printArea() {
int area = dim1 * dim2;
System.out.println("Rectangle Area: " + area);
}
}
class Triangle extends Shape2 {
public Triangle(int base, int height) {
super(base, height);}


@Override
public void printArea() {
double area = 0.5 * dim1 * dim2;
System.out.printf("Triangle Area: %.2f%n", area);}}
class Circle extends Shape2 {
public Circle(int radius) {
super(radius, 0);}
public void printArea (){
Double area = Math.PI * dim1 * dim1;
System.out.printf("Triangle Area: %.2f%n",area);
}}
public class Shape{
public static void main(String[] args){
Shape2 rect = new Rectangle(9, 4);
Shape2 tri = new Triangle(10,7);
Shape2 cir = new Circle(5);
rect.printArea();
tri.printArea();
cir.printArea();
}} 
