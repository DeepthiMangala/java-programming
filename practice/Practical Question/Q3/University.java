import java.util.*;
public class University{
	String uniName;
	List<Professor> professor;
	
	public University(String uniName, List<Professor> professor){
		this.uniName = uniName;
		this.professor = professor;
		
	}
	public void displayUniversityDetails(){
		System.out.println("University: "+ uniName);
		System.out.println("Professors: ");
		
		for(Professor prof : professor){
			prof.displayProfessorDetails();
			
		}
	}
	
	
}