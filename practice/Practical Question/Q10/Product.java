public class Product{
	private int productId;
	private String productName;
	private double price;
	private int quantity;
	
	public Product(){
		
	}
	
	public Product(int productId, String productName, double price, int quantity){
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
		
	}
	public void setProductId(int productId){
		this.productId = productId;
		
	}
	public void setProductName(String productName){
		this.productName = productName;
		
	}
	public void setPrice(double price){
		if(price > 0){
			this.price = price;
		}else{
			System.out.println("Invalid price");
		}	
	}
	public void setQuantity(int quantity){
		if(quantity > 0){
			this.quantity = quantity;
		}else{
			System.out.println("Invalid amount");
		}
	}
	public int getProductId(){
		return productId;
		
	}
	public String getProductName(){
		return productName;
		
	}
	public double getPrice(){
		return price;
		
	}
	public int getQuantity(){
		return quantity;
		
	}
	public void displayDetails(){
		System.out.println("---Product Details---");
		System.out.println("Product ID: "+ productId);
		System.out.println("Product Name: "+ productName);
		System.out.println("Price: "+ price);
		System.out.println("Quantity: "+quantity);
		
	}
	public double calculateTotalValue(){
		return  price * quantity;
		
	}
	
	
}