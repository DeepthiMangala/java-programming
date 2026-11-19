public class Student{
	private int studentId;
	private String studentName;
	private Course[] courses;
	private int courseCount;
	
	public Student(int studentId, String studentName){
		this.studentId = studentId;
		this.studentName = studentName;
		courses = new Course[2];
		courseCount = 0;
		
	}
	public int getStudentId(){
		return studentId;
		
	}
	public String getStudentName(){
		return studentName;
		
	}
	public void addCourse(Course course){
		if(course == null){
			System.out.println("can't addd a null course");
			return;
		}
		for(int i = 0; i< courseCount; i++){
			if(courses[i].getCourseCode().equals(course.getCourseCode())){
				System.out.println("Course already assigned to "+ studentName);
				return;
				
			}
		}
		if(courseCount >= courses.length){
			System.out.println(studentName+ "Can't enroll in more than two course");
			return;
			
		}
		courses[courseCount] = course;
		courseCount++;
		System.out.println(course.getCourseName() + " assigned to "+ studentName);
		return;
		
	}
	public void displayStudentDetails(){
		System.out.println("Student ID: "+ studentId);
		System.out.println("Student Name: "+ studentName);
		System.out.println("Enrolled Courses: ");
		
		if(courseCount == 0){
			System.out.println("No Courses assigned");
			
		}
		for(int i = 0; i < courseCount; i++){
			courses[i].displayDetails();
			
		}
	}
	
	
}