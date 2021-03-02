
public class Book_info {

    /** The element stored at this node */
    private String  name;               
    private Integer price ;
    private Integer num_copies ;
    
    public Book_info(String name, Integer price, Integer num_copies) {
      this.name = name;
      this.price = price;
      this.num_copies = num_copies;
    }

    // public accessor methods
    public String getName() { return name; }
    public Integer getPrice() { return price; }
    public Integer getNumCopies() { return num_copies; }
    // public update methods
    public void setPrice(Integer price) { this.price = price; }
    public void setNumCopies(Integer num_copies) { this.num_copies = num_copies; }

} //----------- end of  Book_info class -----------

