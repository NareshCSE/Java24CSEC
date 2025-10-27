import java.util.Scanner;

public class StudentCourseManagementApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Semester sem = new Semester();
		
		try {
			 System.out.println("Enter number of courses: ");
             int n = sc.nextInt();
             sc.nextLine();
			 
             for(int i = 0;i<n;i++) {
            	 System.out.println("Enter deatils for Courses" + (i+1) + ":");
            	 System.out.println("Enter Course ID: ");
            	 int id = sc.nextInt();
            	 sc.nextLine();
            	 
            	 System.out.println("Enter course name: ");
            	 String name = sc.nextLine();
            	 
            	 System.out.println("Enter course price: ");
            	 double price = sc.nextDouble();
            	 sc.nextLine();
            	 
            	 Course c = new Course(id,name,price);
            	 sem.addCourse(c);
             }

            // to view Courses
            System.out.println("Available Courses:");
            for (Course c : sem.viewCourses()) {
                System.out.println(c);
            }

            // Fee Calculation function
            System.out.println("Enter course fee to calculate discount: ");
            double fee = sc.nextDouble();
            System.out.println("\nFee after discount : " + fee);

            double finalfee = sem.addFee(fee);
            System.out.println("Fee after discount if applicable: " + finalfee);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
		finally {
			sc.close();
		}
	}

}
