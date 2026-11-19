public class Student{
	private int studentId;
	private String name;
	private double gpa;
	
	public Student(){
		
	}
	
	public Student(int studentId, String name, double gpa){
		this.studentId = studentId;
		this.name = name;
		this.gpa = gpa;
		
	}
	public void setStudentId(int studentId){
		this.studentId = studentId;
		
	}
	public void setName(String name){
		this.name = name;
		
	}
	public void setGpa(double gpa){
		if(gpa > 0.0 && gpa < 4.0){
			this.gpa = gpa;
		}else{
			System.out.println("Inavalid GPA");
		}
		
		
		
	}
	public int getStudentId(){
		return studentId;
		
	}
	public String getName(){
		return name;
		
	}
	public double getGpa(){
		
		return gpa;
		
	}
	public void displayStudentDetails(){
		System.out.println("Student ID: "+ studentId);
		System.out.println("Student Name: "+ name);
		System.out.println("GPA: "+gpa);
	}
	
	
	
}