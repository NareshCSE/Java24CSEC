package labexperiments;
import java.util.*;

class Course {
    private int id;
    private String name;
    private double price;

    public Course(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return id + ". " + name + " (₹" + price + ")";
    }
}


interface StudentCourse {
    void addCourse(Course course) throws Exception;
    Course[] viewCourses() throws Exception;
    double addFee() throws Exception;
}


class Semester implements StudentCourse {
    private List<Course> enrolledCourses = new ArrayList<>();
    
    @Override
    public void addCourse(Course course) throws Exception {
        if (course == null) {
            throw new Exception("Course cannot be null.");
        }
        enrolledCourses.add(course);
        System.out.println("Course added: " + course.toString());
    }

    @Override
    public Course[] viewCourses() throws Exception {
        if (enrolledCourses.isEmpty()) {
            throw new Exception("No courses currently enrolled.");
        }
        return enrolledCourses.toArray(new Course[0]);
    }

    @Override
    public double addFee() throws Exception {
        if (enrolledCourses.isEmpty()) {
            throw new Exception("Cannot calculate fee. No courses enrolled.");
        }

        double totalFee = 0;
        for (Course course : enrolledCourses) {
            totalFee += course.getPrice();
        }

        if (totalFee < 1000 || totalFee > 3000) {
            throw new Exception("Total fee (₹" + totalFee + ") is outside the acceptable range (₹1000 - ₹3000).");
        }
        
        double discount = 0;
        if (totalFee > 1500) {
            discount = totalFee * 0.10;
            System.out.println("Discount Applied: 10%");
        } else {
            System.out.println("No Discount Applied.");
        }
        
        return totalFee - discount;
    }
}



public class StudentCourseManagement {
    public static void main(String[] args) {
        StudentCourse semester = new Semester(); 

        try {
            Course dp = new Course(1, "Dynamic Programming", 1000);
            Course android = new Course(2, "Android Development", 2500);
            
            semester.addCourse(dp);
            semester.addCourse(android);

            System.out.println("\nEnrolled Courses");
            for (Course c : semester.viewCourses()) {
                System.out.println(c.toString());
            }

            double finalFee = semester.addFee();
            System.out.println("\nTotal Fee Before Discount: ₹" + (dp.getPrice() + android.getPrice()));
            System.out.println("Final Fee Payable: ₹" + finalFee);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}