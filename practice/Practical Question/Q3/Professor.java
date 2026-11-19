public class Professor{
	String name; 
	String subject;
	
	public Professor(String name, String subject){
		this.name = name;
		this.subject = subject;
		
	}
	public void displayProfessorDetails(){
		System.out.println("Professor Name: "+ name +","+ " Subject: "+subject);
	}
}