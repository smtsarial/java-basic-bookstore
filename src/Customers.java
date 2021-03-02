import net.datastructures.LinkedQueue;

/** Generates Customers class */
public class Customers {
	
	private static class Customer_info {

	    /** The element stored at this node */
	    private String  name;               
	    private String  book ;
	    
	    public Customer_info(String name, String book) {
	      this.name = name;
	      this.book = book;
	    }

	    // public accessor methods
	    public String getName() { return name; }
	    public String getBook() { return book; }

	} //----------- end of nested Customer_info class -----------

  // instance variable
  protected String store_name;
  protected LinkedQueue<Customer_info> customer_queue ;
  
  /** Constructs Customers with given fields */
  public Customers(String store_name) { 
	  this.store_name = store_name; 
	  customer_queue = new LinkedQueue<>() ;
  }
  
  /** Accessor methods */
  public String getStoreName() { return store_name ;}
  public String getName() { return store_name ;}
  public boolean isEmpty() { return customer_queue.isEmpty(); }
  public int size() { return customer_queue.size(); } 
  
  /** Update methods */
  public void add_customer(String name, String book) { 
	  Customer_info new_customer = new Customer_info(name, book) ;
	  customer_queue.enqueue(new_customer);
  }
  
  public String serve_next_customer() { 
	  if (isEmpty())
		  return null ;
	  else {
		  Customer_info cur_customer = customer_queue.dequeue() ;
		  System.out.println("Serving customer "+cur_customer.getName()) ;
		  return cur_customer.getBook();
	  }
  }
    
}	


