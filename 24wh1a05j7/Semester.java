import java.util.ArrayList;
import java.util.List;

public class Semester implements StudentCourse {
private List<Course> courseList;
    
	public Semester() {
		courseList = new ArrayList<>();
	}
	
	@Override
	public void addCourse(Course course) throws Exception {
		// TODO Auto-generated method stub
		if (course == null)
			throw new Exception("Course cannot be null.");
		courseList.add(course);
	}

	@Override
	public Course[] viewCourses() throws Exception {
		// TODO Auto-generated method stub
		if( courseList.isEmpty())
			throw new Exception("No course available");
		return courseList.toArray(new Course[0]);
	}

	@Override
	public double addFee(double fee) throws Exception {
		// TODO Auto-generated method stub
		
		return 0;
	}
	
}
