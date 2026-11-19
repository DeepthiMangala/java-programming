public class BookApp{
	public static void main(String[] args){
		ISBN isbn1 = new ISBN("0 941831 39 6");
		ISBN isbn2 = new ISBN("0 945865 41 9");
		
		Book book = new Book("Object First With Java", "David J. Barnes and Michael Kolling", "Prentice Hall", "London", 2019, 49.99, isbn1);
		
		book.printDetails();
		book.setBookISBN(isbn2);
		book.printDetails();
		
		System.out.println(book.getBookISBN().getIsbn());
	}
}