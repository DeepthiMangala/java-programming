public class Student{
	private int studentId;
	private String name;
	private int daysAttended;
	
	public Student(int studentId, String name, int daysAttended){
		this.studentId = studentId;
		this.name = name;
		this.daysAttended = daysAttended;
		
	}
	public void setStudentId(int StudentId){
		this.studentId = studentId;
		
	}
	public void setName(String name){
		this.name = name;
		
	}
	public void setDaysAttended(int daysAttended){
		this.daysAttended = daysAttended;
		
	}
	public int getStudentId(){
		return studentId;
		
	}
	public String getName(){
		return name;
		
	}
	public int getDaysAttended(){
		return daysAttended;
		
	}
	
}