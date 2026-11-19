public class TransportApp{
	public static void main(String[] args){
		
		Driver d1 = new Driver("Mr.Senarath", "SWP123556");
		Driver d2 = new Driver("Mr.Kamal", "AWP956");
		
		Bus b = new Bus("rffaer", 35.4, "srfea",d1);
		Truck t = new Truck("jyyuj", 65.3, "mjkjl",d2);
		
		b.start();
		b.displayDetails();
		
		t.start();
		t.displayDetails();
		
		
	}
}