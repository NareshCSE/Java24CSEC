package vaishnavi;
import java.util.ArrayList;
import java.util.List;

public class stc implements Studentcourse2 {
    private List<Course> courseList = new ArrayList<>();

    @Override
    public void addCourse(Course course) throws Exception {
        if (course == null) {
            throw new Exception("Course cannot be null");
        }
        courseList.add(course);
    }

    @Override
    public Course[] viewCourses() throws Exception {
        if (courseList.isEmpty()) {
            throw new Exception("No courses available");
        }
        return courseList.toArray(new Course[0]);
    }

    @Override
    public double addFee(double fee) throws Exception {
        if (fee < 1000 || fee > 3000) {
            throw new Exception("Fee must be between 1000 and 3000");
        }
        if (fee > 1500) {
            return fee - (fee * 0.10); 
        }
        return fee; 
    }
}
