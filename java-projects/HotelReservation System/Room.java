public class Room{
	private String roomNumber;
	private String roomType;
	private double pricePerNight;
	
	public Room(String roomNumber, String roomType, double pricePerNight){
		this.roomNumber = roomNumber;
		this.roomType = roomType;
		this.pricePerNight = pricePerNight;
		
	}
	public void setRoomNumber(String roomNumber){
		this.roomNumber = roomNumber;
		
	}
	public void setRoomType(String roomType){
		this.roomType = roomType;
		
	}
	public void setPricePerNight(double pricePerNight){
		this.pricePerNight = pricePerNight;
		
	}
	public String getRoomNumber(){
		return roomNumber;
		
	}
	public String getRoomType(){
		return roomType;
		
	}
	public double getPricePerNight(){
		return pricePerNight;
		
	}
	public void displayDetaills(){
		System.out.println("Room Number: "+ roomNumber);
		System.out.println("Room Type: "+ roomType);
		System.out.println("Price Per Night: "+ pricePerNight);
	}
}