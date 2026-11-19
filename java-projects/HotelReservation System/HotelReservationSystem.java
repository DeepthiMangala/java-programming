public class HotelReservationSystem{
	public static void main (String[] args){
		StandardRoom sr1 = new StandardRoom("S101", "Standard", 12000.00, true,1);
		StandardRoom sr2 = new StandardRoom("S102", "Standard", 15000.00, false,2);
		StandardRoom sr3 = new StandardRoom("S103", "Standard", 18000.00, true,3);
		
		DeluxeRoom dr1 = new DeluxeRoom("D201", "Deluxe", 25000.00, true, 45.5);
		DeluxeRoom dr2 = new DeluxeRoom("D202", "Deluxe", 22000.00, true, 40.5);
		DeluxeRoom dr3 = new DeluxeRoom("D203", "Deluxe", 30000.00, true, 55.5);
		
		Room[] rooms = {sr1, sr2, sr3, dr1, dr2, dr3};
		dr2.setPricePerNight(24000.00);
		
		System.out.println("---Rooms with a price per night greater than Rs.20000---");
		for(Room room : rooms){
			if(room.getPricePerNight() > 20000.00){
				room.displayDetaills();
				System.out.println();
			}
		}
		
		System.out.println("---StandarddRooms that provide free breakfast---");
		for(Room room : rooms){
			if(room instanceof StandardRoom){
				StandardRoom sr = (StandardRoom) room;
				
				if(sr.getFreeBreakfast()){
					sr.displayDetaills();
					System.out.println();
				}
			}
		}
		
		System.out.println("---DeluxeRooms that have a sea view---");
		for(Room room : rooms){
			if(room instanceof DeluxeRoom){
				DeluxeRoom dr = (DeluxeRoom) room;
				
				if(dr.getSeaView()){
					dr.displayDetaills();
					System.out.println();
				}
			}
		}
		System.out.println("---Room with highest price---");
		Room highest = rooms[0];
		
		for(Room room : rooms){
			if(room.getPricePerNight() > highest.getPricePerNight()){
				highest = room;
			}
		}
		System.out.println("Room with highest price");
		highest.displayDetaills();
		
	}
}