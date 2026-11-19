public class CourseApp{
	public static void main(String[] args){
		RegularCourse rc1 = new RegularCourse();
		RegularCourse rc2 = new RegularCourse("RC205", "Web developing", 5, true);
		PremiumCourse pc = new PremiumCourse("PC202", "Machine Learning", 6, true);
		
		rc1.displayCourseDetails();
		System.out.println();
		rc2.displayCourseDetails();
		System.out.println();
		pc.displayCourseDetails();
	}
}