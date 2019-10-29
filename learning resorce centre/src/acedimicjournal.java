
public class acedimicjournal extends item {

	// Attributes
	
	
	private String author = "";
	private String publisher = "";
	
	//methods of code  
	
	public acedimicjournal(String name, String author, String publisher) {
		super(name);
		this.author = author;
		this.publisher = publisher;
		
	}
	
	 public String getauthor() {
		 return author;
	 }
	 public String getpublisher() {
		 return publisher;
		 
		 // asking for what to return 
	 }
	
}
