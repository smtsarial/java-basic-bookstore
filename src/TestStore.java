import java.util.Random ;

public class TestStore {

  public static void main(String[] args) {

	  String[]  book_names    = {"Moby Dick", "Les Miserables", "Kaþaðý", "Utopia", "Hababam Sýnýfý"} ;
	  Integer[] book_prices   = {25, 30, 20, 15, 50} ;
	  Integer[] book_copies   = {2, 3, 1, 3, 5} ;

	  String[]  customer_names    = {"hasan", "ali", "veli", "murat", "ayþe", "naz", "cenk", "hülya", "barýþ", "akýn"} ;
	  String[]  book_purchased    = {"Moby Dick", "Kaþaðý", "Nutuk", "Utopia", "Hababam Sýnýfý", "Moby Dick", "Nutuk", "Hababam Sýnýfý", "Kaþaðý", "Utopia"} ;
	  
	  String[]  delivery_books    = {"Utopia", "Les Miserables", "Nutuk", "Moby Dick", "Utopia", "Simyacý"} ;
	  Integer[] delivery_prices   = {15,30,60,25,15,10} ;
	  Integer[] delivery_copies   = {1, 1, 2, 2, 2, 3} ;

	  String current_bookname ;
	  Book_info current_book ;
	  Integer current_no_copy ;
	  int i ,int_score, day_no, slot_no, round_no, player_count  ;

	  specialCustomers update = new specialCustomers();
	  BookStore book_store     = new BookStore("D&R") ;
	  Customers customer_queue = new Customers("D&R") ;
	  Delivery  delivery_stack = new Delivery("D&R") ;
	  
	  for (i=0 ; i<5 ; i++)
		  book_store.add_book(book_names[i], book_prices[i], book_copies[i]);
	  for (i=0 ; i<10 ; i++)
		  customer_queue.add_customer(customer_names[i], book_purchased[i]);
	  for (i=5 ; i>=0 ; i--)
	      delivery_stack.add_delivery(delivery_books[i], delivery_prices[i], delivery_copies[i]);
	  
	  System.out.println(book_store) ;
	  
	  System.out.println("Morning") ;	  
	  System.out.println("Serving Customers") ;
	  for (i=0 ; i<5 ; i++) {
		  current_bookname = customer_queue.serve_next_customer() ;
		  if (book_store.update_copy(current_bookname, -1))
			  System.out.println("Book purchased: " + current_bookname) ;
		  else 
			  System.out.println("Sorry, we don't have: "+current_bookname) ;
	  }
	  
	  System.out.println("\nHandling Delivery") ;
	  for (i=0 ; i<3 ; i++) {
		  current_book = delivery_stack.deliver_next_book() ;
		  if (book_store.update_copy(current_book.getName(), current_book.getNumCopies()))
			  System.out.println("Inventory Updated for: "+current_book.getName()) ;  
		  else {
			  book_store.add_book(current_book.getName(), current_book.getPrice(), current_book.getNumCopies());
			  System.out.println("New Arrival: "+current_book.getName()) ; 
		  }
	  }
	  
	  System.out.println("\nAfternoon") ;	  
	  System.out.println("Serving Customers") ;
	  for (i=0 ; i<5 ; i++) {
		  current_bookname = customer_queue.serve_next_customer() ;
		  if (book_store.update_copy(current_bookname, -1)) {
			  System.out.println("Book purchased: " + current_bookname) ;
			  //String names= customer_queue.customer_queue.first();
			  System.out.println(customer_queue.getName()+"asfasf") ;
		  	 update.update_Status(customer_queue.getName());
		  }else{
			  System.out.println("Sorry, we don't have: "+current_bookname) ;
	  }
	  
	  System.out.println("\nHandling Delivery") ;
	  for (i=0 ; i<3 ; i++) {
		  current_book = delivery_stack.deliver_next_book() ;
		  if (book_store.update_copy(current_book.getName(), current_book.getNumCopies()))
			  System.out.println("Inventory Updated for: "+current_book.getName()) ;  
		  else {
			  book_store.add_book(current_book.getName(), current_book.getPrice(), current_book.getNumCopies());
			  System.out.println("New Arrival: "+current_book.getName()) ; 
		  }
	  }
	  
	  System.out.println(book_store) ;
  }
}
} 
	  
