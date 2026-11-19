public class DeluxeRoom extends Room{
	private  boolean seaView;
	private double suiteArea;
	
	public DeluxeRoom(String roomNumber, String roomType, double pricePerNight, boolean seaView, double suiteArea){
		super(roomNumber, roomType, pricePerNight);
		this.seaView = seaView;
		this.suiteArea = suiteArea;
		
	}
	public void setSeaView(boolean seaView){
		this.seaView = seaView;
		
	}
	public void setSuiteArea(double suiteArea){
		this.suiteArea = suiteArea;
		
	}
	public boolean getSeaView(){
		return seaView;
		
	}
	public double getSuiteArea(){
		return suiteArea;
		
	}
@Override
	public void displayDetaills(){
		super.displayDetaills();
		System.out.println("Sea View: "+ (seaView ? "Yes":"No"));
		System.out.println("Suite Area: "+ suiteArea);
	}
}