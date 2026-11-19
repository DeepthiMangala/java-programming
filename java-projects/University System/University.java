import java.util.ArrayList;
public class University{
	private String universityName;
	private ArrayList<Student> students;
	
	public University(String universityName){
		this.universityName = universityName;
		students = new ArrayList<>();
		
	}
	public void addStudent(Student student){
		students.add(student);
		System.out.println(student.getStudentName() + "Added Successfully");
		
	}
	public void findStudent(int studentId){
		boolean found = false;
		
		for(Student s : students){
			if(s.getStudentId() == studentId){
				found = true;
				System.out.println("Student found");
			}
		}
		if(!found){
			System.out.println("STudnet not found");
		}
	}
	public void displayAllStudents() {
        System.out.println();
        System.out.println("University: " + universityName);
        System.out.println("Total Students: " + students.size());
        System.out.println();

        for (Student student : students) {
            student.displayStudentDetails();
			System.out.println("------------------");
        }
    }
}