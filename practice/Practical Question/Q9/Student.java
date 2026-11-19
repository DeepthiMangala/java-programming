public class Student{
	private String regNumber;
	private String name;
	private char sex;
	private int yearOfStudy;
	private int age;
	
	public Student(String regNumber, String name, char sex, int yearOfStudy, int age){
		this.regNumber = regNumber;
		this.name = name;
		this.sex = sex;
		this.yearOfStudy = yearOfStudy;
		this.age = age;
		
	}
	public void setYearOfStudy(int yearOfStudy){
		this.yearOfStudy = yearOfStudy;
		
	}
	public void setAge(int age){
		this.age = age;
		
	}
	public String getRegNumber(){
		return regNumber;
		
	}
	public String getName(){
		return name;
		
	}
	public char getSex(){
		return sex;
		
	}
	public int getYearOfStudy(){
		return yearOfStudy;
		
	}
	public int getAge(){
		return age;
		
	}
	public void displayDetails(){
		System.out.println("Registration Number: "+ regNumber);
		System.out.println("Nmae: "+ name);
		System.out.println("Sex: "+sex);
		System.out.println("Year of Study: "+ yearOfStudy);
		System.out.println("Age: "+age);
		System.out.println("----------------------");
		
	}
}