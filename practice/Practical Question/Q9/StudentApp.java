import java.util.Scanner;
public class StudentApp{
	public static void main(String[] args){
		
		Student[] students = {
				new Student("2012/ICT/78", "T.Tharma", 'M', 2, 22),
				new Student("2013/ASP/90", "N.Nimesha", 'F', 2, 24),
				new Student("2011/ICT/54", "J.Karthi", 'M', 3, 23),
				new Student("2013/ICT/32", "B.K.Silva", 'M', 2, 20),
				new Student("2016/ASP/22", "H.Nimalka", 'F', 3, 24),
				new Student("2012/ICT/66", "T.Raja", 'M', 3, 21),
				new Student("2013/ASP/38", "R.N.Vinotha", 'F', 3, 22),
				new Student("2011?ICT/45", "M.J.Rifthy", 'M', 2, 23),
				new Student("2013/ICT/23", "K.M.Anwar", 'M', 2, 22),
				new Student("2016/ASP/88", "N.K.Nilani", 'F', 3, 20)
		};
		System.out.println("===Display All Students===");
		System.out.println();
		for(Student s : students ){
			s.displayDetails();
		}
		System.out.println();
		
		System.out.println("===Male Students in third Year===");
		System.out.println();
		
		for(Student s : students){
			if(s.getYearOfStudy()== 3 && s.getSex() == 'M'){
				s.displayDetails();
			}
		}
		System.out.println();
		
		System.out.println("===Youngest Female Student===");
		Student youngestFemale = null;
		for(Student s : students){
			if(s.getSex()=='F'){
				if(youngestFemale == null || youngestFemale.getAge() > s.getAge()){
					youngestFemale = s;
				}
			}
		}
		if(youngestFemale != null){
			youngestFemale.displayDetails();
			System.out.println();
		}
		
		System.out.println("===Youngest Male Student===");
		System.out.println();
		
		Student youngestMale = null;
		
		for(Student s : students){
			if(s.getSex() == 'M'){
				if(youngestMale == null || s.getAge() < youngestMale.getAge()){
					youngestMale = s;
					
				}
			}
		}
		if(youngestMale != null){
			youngestMale.displayDetails();
			System.out.println();
		}
	}
}