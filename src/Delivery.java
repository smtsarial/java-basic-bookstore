//import net.datastructures.LinkedStack;

/** Generates Delivery class */
public class Delivery {
	
  // instance variable
  protected String store_name;
  protected LinkedStack<Book_info> delivery_stack ;
  
  /** Constructs Delivery with given fields */
  public Delivery(String store_name) { 
	  this.store_name = store_name; 
	  delivery_stack = new LinkedStack<>() ;
  }
  
  /** Accessor methods */
  public String getStoreName() { return store_name ;}
  public boolean isEmpty() { return delivery_stack.isEmpty(); }
  public int size() { return delivery_stack.size(); } 
  
  /** Update methods */
  public void add_delivery(String name, Integer price, Integer num_copies) { 
	  Book_info new_delivery= new Book_info(name, price, num_copies) ;
	  delivery_stack.push(new_delivery);
  }
  
  public Book_info deliver_next_book() { 
	  if (isEmpty())
		  return null ;
	  else {
		  return delivery_stack.pop() ;
	  }
  }
    
}	


