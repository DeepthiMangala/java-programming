import java.util.*;
public class StudentApp{
	public static void main(String[] args){
		Scanner dd = new Scanner(System.in);
		
		Student s = new Student();
		
		System.out.print("Enter Student ID: ");
		s.setStudentId(dd.nextInt());
		
		
		dd.nextLine();
		
		System.out.print("Enter Student Name: ");
		s.setName(dd.nextLine());
		
		
		System.out.print("Enter GPA: ");
		s.setGpa(dd.nextDouble());
		
		
		s.displayStudentDetails();
		
		
	}
}