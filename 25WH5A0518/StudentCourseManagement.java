package sathvika_25wh5a0518;
import java.util.ArrayList;
class Course {
private int id;
private String name;
private double price;
public Course(int id, String name, double price) {
this.id = id;
this.name = name;
this.price = price;
}
public int getId() { return id; }
public String getName() { return name; }
public double getPrice() { return price; }
public void setId(int id) { this.id = id; }
public void setName(String name) { this.name = name; }
public void setPrice(double price) { this.price = price; }
} 
interface StudentCourse {
void addCourse(Course c) throws Exception;
Course[] viewCourses() throws Exception;
double addFee(double fee) throws Exception;
}
abstract class AbstractStudentCourse implements StudentCourse {
protected ArrayList<Course> courseList = new ArrayList<>();
@Override
public void addCourse(Course c) throws Exception {
	 if (c == null) {
	 throw new Exception("Course cannot be null! ");
	 }
	 courseList.add(c);
	 System.out.println("Course added successfully: " + c.getName());
	 }
	 @Override
	 public Course[] viewCourses() throws Exception {
	 if (courseList.isEmpty()) {
	 throw new Exception("No courses available to view!");
	 }
	 return courseList.toArray(new Course[0]);
	 }
	 @Override
	 public abstract double addFee(double fee) throws Exception;
	 }
	 class Semester extends AbstractStudentCourse {
	 @Override       
	 public double addFee(double fee) throws Exception {
	 if (fee < 1000 || fee > 3000) {
	 throw new Exception("Fee must be between 1000 and 3000!");
	 }
	 double finalFee;
	 if (fee > 1500) {
	 finalFee = fee - (fee * 0.10); // 10% discount
	 System.out.println("Discount applied! Final Fee: " + finalFee);
	 } else {
	 finalFee = fee;
	 System.out.println("No discount applied. Final Fee: " + finalFee);
	 }
	 return finalFee;
	 }
	 }
	 public class StudentCourseManagement {
	 public static void main(String[] args) {
	 try {
	 Semester sem = new Semester();

	 // Adding courses
	 sem.addCourse(new Course(101, "Java Programming", 2500));
	 sem.addCourse(new Course(102, "Python Basics", 1200));
	 // Viewing courses
	 Course[] courses = sem.viewCourses();
	 System.out.println("\n--- Course List ---");
	 for (Course c : courses) {
	 System.out.println("ID:" + c.getId() + ", Name: " + c.getName() + " , Price: " + c.getPrice());
	 }
	 // Adding fee and checking discount
	 System.out.println("--- Fee Details ---");
	 sem.addFee(2500);
	 sem.addFee(1200);
	 } catch (Exception e) {
	 System.out.println("Error: " + e.getMessage());
	 }
	 }
	 }