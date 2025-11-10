package javaExp;

import javaExp.Course;
import javaExp.Semester;
import javaExp.StudentCourse;

class Course {
	 private int id;
	 private String name;
	 private double price;

	 public Course(int id, String name, double price) {
	     this.id = id;
	     this.name = name;
	     this.price = price;
	 }
	 public int getId() {
	     return id;
	 }
	 public String getName() {
	     return name;
	 }
	 public double getPrice() {
	     return price;
	 }

	public void setId(int id) {
	     this.id = id;
	 }
	 public void setName(String name) {
	     this.name = name;
	 }
	 public void setPrice(double price) {
	     this.price = price;
	 }
	}
	interface StudentCourse {
	 void addCourse(Course course) throws Exception;
	 Course[] viewCourses() throws Exception;
	 double addFee(Course course) throws Exception;
	}
	class Semester implements StudentCourse {
	 private Course[] courses;
	 private int count;

	 public Semester(int size) {
	     courses = new Course[size];
	     count = 0;
	 }

	 public void addCourse(Course course) throws Exception {
	     if (count >= courses.length) {
	         throw new Exception("Course limit reached!");
	     }
	     courses[count++] = course;
	     System.out.println("Course added successfully: " + course.getName());
	 }

	 public Course[] viewCourses() throws Exception {
	     if (count == 0) {
	         throw new Exception("No courses available!");
	     }
	     return courses;
	 }

	 public double addFee(Course course) throws Exception {
	     double fee = course.getPrice();
	     if (fee < 1000 || fee > 3000) {
	         throw new Exception("Fee must be between 1000 and 3000!");
	     }

	     if (fee > 1500) {
	         fee = fee - (fee * 0.10); // 10% discount
	     }
	     return fee;
	 }
	}

	public class Q13StudentCourse {
	 public static void main(String[] args) {
	     try {
	         Semester sem = new Semester(3);

	         Course c1 = new Course(101, "Java Basics", 1200);
	         Course c2 = new Course(102, "Advanced Java", 2000);
	         sem.addCourse(c1);
	         sem.addCourse(c2);
	          System.out.println("\n--- Course List ---");
	         for (Course c : sem.viewCourses()) {
	             if (c != null) {
	                 System.out.println("ID: " + c.getId() +", Name: " + c.getName() +", Fee after Discount: " + sem.addFee(c));
	             }
	         }

	     } catch (Exception e) {
	         System.out.println("Error: " + e.getMessage());
	     }
	 }
	}
