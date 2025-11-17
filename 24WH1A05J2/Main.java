package vaishnavi;
public class Main {
    public static void main(String[] args) {
        try {
            stc semester = new stc();

            Course course1 = new Course(101, "Java Programming", 2000);
            Course course2 = new Course(102, "Data Structures", 1400);

            semester.addCourse(course1);
            semester.addCourse(course2);

            for (Course c : semester.viewCourses()) {
                System.out.println(c.getName() + " - Fee after discount: " + semester.addFee(c.getPrice()));
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

