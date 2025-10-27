// Design an Application called Student Course Management
//create an interface called StudentCourse. add an abstract method called addCourse which takes Course (Have a bean called Course class with id, name, price as properties with either setter method injection or constructor injection) as an input parameter. 
//add an abstract method called viewCourses which returns Course array
//add an abstract method called addFee() (Fee Range is 1000 to 3000)
//If the course fee is more than 1500 then students will get 10 percent Disc. otherwise no Disc.
//Note: Make sure that all methods of the interface should throws exception.
//And this interface must be implemented in Semester class..

public interface StudentCourse {
   void addCourse(Course course) throws Exception;
   public Course[] viewCourses() throws Exception;
   public double addFee(double fee) throws Exception;
}
