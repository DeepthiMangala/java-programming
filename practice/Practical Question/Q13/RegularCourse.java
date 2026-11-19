public class RegularCourse extends Course{
	boolean hasLiveSession;
	
	public RegularCourse(){
		
	}
	public RegularCourse(String courseId, String courseName, int durationWeek, boolean hasLiveSession){
		super(courseId, courseName, durationWeek);
		this.hasLiveSession = hasLiveSession;
		
	}
	@Override
	public double calculateTotalFee(){
		return 100 * durationWeek;
		
	}
	@Override
	public double calculateTotalFee(double discoiuntPercentage){
		return calculateTotalFee() - (calculateTotalFee() * discoiuntPercentage);
		
	}
	@Override
	public void displayCourseDetails(){
		super.displayCourseDetails();
		System.out.println("Total Fee: $"+ calculateTotalFee());
		System.out.println("Basic Fee: $"+ calculateTotalFee());
		System.out.println("Live Session included: "+(hasLiveSession ? "Yes" : "NO"));
		System.out.println("Discounted Fee (20%): $"+ calculateTotalFee(0.20));
	}
	
}