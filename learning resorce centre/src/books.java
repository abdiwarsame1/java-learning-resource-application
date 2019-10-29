import java.util.Date;

public class books extends item {

	// attributes 
		
	private String author ="";
	private int Datepublished;
	
	// methods
	public  books(String name, String author, int Datepublished){
		super(name);
		this.Datepublished = Datepublished;
		this.author = author; 
		
	}
	
	public String getauthor(){
		return author;
			
	}
	
	public int getDatepublished(){
		return Datepublished;
		// getting the date published 
	}
	
}
