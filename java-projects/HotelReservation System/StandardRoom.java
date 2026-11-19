public class StandardRoom extends Room{
	private boolean freeBreakfast;
	private int floorNumber;
	
	public StandardRoom(String roomNumber, String roomType, double pricePerNight, boolean freeBreakfast, int floorNumber){
		super(roomNumber, roomType, pricePerNight);
		this.freeBreakfast = freeBreakfast;
		this.floorNumber = floorNumber;
		
	}
	public void setFreeBreakfast(boolean freeBreakfast){
		this.freeBreakfast = freeBreakfast;
		
	} 
	public void setFloorNumber(int floorNumber){
		this.floorNumber = floorNumber;
		
	}
	public boolean getFreeBreakfast(){
		return freeBreakfast;
		
	}
	public int getFloorNumber(){
		return floorNumber;
		
	}
	@Override
	public void displayDetaills(){
		super.displayDetaills();
		System.out.println("Free Breakfast: "+ (freeBreakfast? "Yes":"No"));
		System.out.println("Floor Number: "+ floorNumber);
	}
}