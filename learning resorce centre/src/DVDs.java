
public class DVDs extends item {

	// attributes 
	
	
	private String genre = "";
	private int year = 0;
	
	// methods i will be using 
	
	public DVDs(String name, String genre, int year) {
		super(name);
		this.genre = genre;
		this.year = year;
		
	}
	public String getgenre() {
		return genre;
	}
	public int getyear() {
		return year;
		//asking to return the year
	}
	
	
}
