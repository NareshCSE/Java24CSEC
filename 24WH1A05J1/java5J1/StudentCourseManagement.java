package java5J1;
public class StudentCourseManagement {

    static class Course {
        int id;
        String name;
        double price;

        Course(int id, String name, double price) {
            this.id = id;
            this.name = name;
            this.price = price;
        }
    }

    interface StudentCourse {
        void addCourse(Course course) throws Exception;
        Course[] viewCourses() throws Exception;
        double addFee(Course course) throws Exception;
    }

    static class Semester implements StudentCourse {
        Course[] courses = new Course[10]; 
        int count = 0;

        public void addCourse(Course course) throws Exception {
            if (course == null) {
                throw new Exception("Course cannot be null");
            }
            if (count >= courses.length) {
                throw new Exception("Course limit reached");
            }
            courses[count] = course;
            count++;
        }

        public Course[] viewCourses() throws Exception {
            if (count == 0) {
                throw new Exception("No courses added yet");
            }
            Course[] result = new Course[count];
            for (int i = 0; i < count; i++) {
                result[i] = courses[i];
            }
            return result;
        }

        public double addFee(Course course) throws Exception {
            if (course == null) {
                throw new Exception("Course is null");
            }
            if (course.price < 1000 || course.price > 3000) {
                throw new Exception("Fee must be between 1000 and 3000");
            }
            if (course.price > 1500) {
                return course.price * 0.9; 
            } else {
                return course.price;
            }
        }
    }

    public static void main(String[] args) {
        try {
            Semester semester = new Semester();

            Course c1 = new Course(1, "Java", 2000);
            Course c2 = new Course(2, "Python", 1200);
            Course c3 = new Course(3, "C", 1500);

            semester.addCourse(c1);
            semester.addCourse(c2);
            semester.addCourse(c3);

            Course[] allCourses = semester.viewCourses();
            for (Course c : allCourses) {
                double finalFee = semester.addFee(c);
                System.out.println("Course: " + c.name + ", Final Fee: " + finalFee);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
