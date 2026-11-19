public class Student{
	private String name;
	private int age;
	private String studentId;
	private String course;
	
	public Student(String name, int age, String studentId, String course){
		this.name = name;
		this.age = age;
		this.studentId = studentId;
		this.course = course;
		
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public String getStudentId(){
		return studentId;
	}
	public String getCourse(){
		return course;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public void setStudentId(String studentId){
		this.studentId = studentId;
	}
	public void setCourse(String course){
		this.course = course;
	}
	public void displayDetails(){
		System.out.println("Student Name: "+ name);
		System.out.println("Student Age: "+ age);
		System.out.println("Student Id: "+ studentId);
		System.out.println("Student course: "+ course);
		
	}
}