import net.datastructures.Entry;
import net.datastructures.LinkedPositionalList;
import net.datastructures.Position;

/** Generates BookStore class */
public class BookStore {
	
  // instance variable
  protected String store_name;
  protected LinkedPositionalList<Book_info> book_list ;
  
  /** Constructs BookStore with given fields */
  public BookStore(String store_name) { 
	  this.store_name = store_name; 
	  book_list = new LinkedPositionalList<>() ;
  }
  
  /** Accessor methods */
  public String getStoreName() { return store_name ;}
  public boolean isEmpty() { return book_list.isEmpty(); }
  public int size() { return book_list.size(); } 
  
  /** Update methods */
  public void add_book(String name, Integer price, Integer num_copies) { 
	  Book_info new_book = new Book_info(name, price, num_copies) ;
	  book_list.addFirst(new_book) ;
  }
  
  public boolean update_copy(String name, Integer num_copies) { 
	  int no_copy  ;
	  for (Position<Book_info> walk : book_list.positions())
	      if (walk.getElement().getName() == name) {
	    	  no_copy = walk.getElement().getNumCopies() ;
	    	  if (no_copy + num_copies == 0) 
	    		  book_list.remove(walk) ;    	  	
	    	  else
	    		  walk.getElement().setNumCopies(no_copy + num_copies);
	    	  return true;
	      }
	  
	  return false ;
  }
  
  public String toString() { 
	    StringBuilder sb = new StringBuilder("(");
	    for (Position<Book_info> walk : book_list.positions()) {
	    	sb.append("( ");
	        sb.append(walk.getElement().getName()) ; sb.append(", ");
	        sb.append(walk.getElement().getPrice()) ; sb.append(" TL, ");
	        sb.append(walk.getElement().getNumCopies()) ; sb.append(") ");
	    }
	    sb.append(")");
	    return sb.toString();
  }
    
}	


