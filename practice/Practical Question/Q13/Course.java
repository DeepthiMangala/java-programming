public class Course{
	String courseId;
	String courseName;
	int durationWeek;
	
	public Course(){
		
	}
	public Course(String courseId, String courseName, int durationWeek){
		this.courseId= courseId;
		this.courseName = courseName;
		this.durationWeek = durationWeek;
		
	}
	public void displayCourseDetails(){
		System.out.println("Course ID: "+courseId);
		System.out.println("Course Name: "+ courseName);
		System.out.println("Duration : "+ durationWeek+ " weeks");
		
	}
	public double calculateTotalFee(){
		return 10000.00;
		
	}
	public double calculateTotalFee(double discoiuntPercentage){
		return calculateTotalFee() - (calculateTotalFee() * discoiuntPercentage);
		
	}
}