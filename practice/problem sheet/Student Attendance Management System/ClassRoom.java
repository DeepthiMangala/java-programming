public class ClassRoom{
	private Student[] students;
	private int noOfStudents;
	
	public ClassRoom(){
		students = new Student[10];
		noOfStudents = 0;
		
	}
	public void addStudent(Student student){
		if(noOfStudents < students.length){
			students[noOfStudents] = student;
			noOfStudents++;
			System.out.println("Student added successfully");
			
		}else{
			System.out.println("ClassRoom is full");
		}
		
	}
	public void updateAttendance(int id, int newDays){
		for(int i = 0; i<noOfStudents; i++){
			if(students[i].getStudentId() == id){
				students[i].setDaysAttended(newDays);
				System.out.println("Updated attendance successfully for: "+ students[i].getName());
				return;
			}
		}
		System.out.println("Student Id: "+ id+ " not found.");
	}
	public void displaydetails(){
		/*for(int i = 0; i<noOfStudents; i++){
			System.out.println("Student Id: "+ students[i].getStudentId());
			System.out.println("Student Name: "+ students[i].getName());
			System.out.println("Days Attended: "+ students[i].getDaysAttended());
			System.out.println("----------------------");
			
		}*/
		for(Student ss : students){
			if(ss != null){
				System.out.println("Student Id: "+ ss.getStudentId());
				System.out.println("Student Name: "+ ss.getName());
				System.out.println("Days Attended: "+ ss.getDaysAttended());
				System.out.println("----------------------");
			}
		}
	}
	
	
}