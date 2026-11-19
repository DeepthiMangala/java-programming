public class StudentApp{
	public static void main(String[] args){
		ClassRoom c = new ClassRoom();
		
		Student s1 = new Student(101, "Alice Smith", 12);
		Student s2 = new Student(102, "Bob Jones", 15);
		Student s3 = new Student(103, "Carol Lee", 10);
		
		c.addStudent(s1);
		c.addStudent(s2);
		c.addStudent(s3);
		System.out.println();
		
		c.updateAttendance(102, 16);
		System.out.println();
		
		c.updateAttendance(104, 15);
		System.out.println();
		
		c.displaydetails();
		
		
	}
}