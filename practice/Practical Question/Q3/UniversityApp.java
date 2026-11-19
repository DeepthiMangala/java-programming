import java.util.*;
public class UniversityApp{
	public static void main(String[] args){
		ArrayList<Professor> professor = new ArrayList<>();
		
		Professor p1 = new Professor("Dr.Smith", "Computer Science");
		Professor p2 = new Professor("Dr.Johnson", "Mathematics");
		Professor p3 = new Professor("Dr.James", "Science");
		
		professor.add(p1);
		professor.add(p2);
		professor.add(p3);
		
		University uni = new University("Tech University", professor);
		
		
		
		uni.displayUniversityDetails();

	}
}