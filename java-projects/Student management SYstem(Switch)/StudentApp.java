import java.util.*;
public class StudentApp{
	public static void main(String[] args){
		Scanner dd = new Scanner(System.in);
		
		ArrayList<Student> students = new ArrayList<>();
			
			boolean running = true;
			
			while(running){
				System.out.println("----Student Management System----");
				System.out.println("1. Add New Student");
				System.out.println("2. Display All Student");
				System.out.println("3. remove Student");
				System.out.println("4. Exit");
				
				int choice = dd.nextInt();
				dd.nextLine();
				
				switch(choice){
					case 1:
						System.out.print("Enter name: ");
						String name = dd.nextLine();
						
						
						System.out.print("Enter Age: ");
						int age = dd.nextInt();
						
						dd.nextLine();
						
						System.out.print("Enter Student Id: ");
						String stuId = dd.nextLine();
						
						
						
						System.out.print("Enter Course: ");
						String course = dd.nextLine();
						
						Student ss = new Student(name, age, stuId, course);
						
						students.add(ss);
						
						System.out.println("Student added successfully");
						System.out.println();
						
						break;
					case 2:
						if(students.isEmpty()){
							System.out.println("No Students Here...");
							break;
						}else{
							for(Student s : students){
								s.displayDetails();
								System.out.println();
							}
						}
						System.out.println();
						break;
						
					case 3:
						System.out.print("Enter Student id to remove: ");
						String id = dd.nextLine();
						
						boolean found = false;
						
						for(int i = 0; i<students.size(); i++){
							if(students.get(i).getStudentId().equals(id)){
								students.remove(i);
								found = true;
								
								System.out.println("removed successfully");
								break;
							}
						}
						if(! found){
							System.out.println("Student not found.....");
							
						}
						break;
						
					case 4:
						System.out.println("Exit......");
						
						return;
						
					default:
						System.out.println("Invalid Typing");
						break;
					
				}
					
			}
		
	}
}