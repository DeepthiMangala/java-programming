public class PremiumCourse extends Course{
	boolean includeCertification;

	public PremiumCourse(){
		
	}
	public PremiumCourse(String courseId, String courseName, int durationWeek, boolean includeCertification){
		super(courseId, courseName, durationWeek);
		this.includeCertification = includeCertification;
		
	}
	@Override
	public double calculateTotalFee(){
	
		if(includeCertification){
			return 150 * durationWeek + 50; 
		}else{
			return 150 * durationWeek;
		}
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
		System.out.println("Certificarion included: "+(includeCertification ? "Yes" : "NO"));
		System.out.println("Discounted Fee (20%): $"+ calculateTotalFee(0.20));
	}
}