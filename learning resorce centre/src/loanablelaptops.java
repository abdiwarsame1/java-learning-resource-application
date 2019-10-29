
public class loanablelaptops extends item {

	// attributes
	
	public String model = "";
	
	
	//method for this class
	
	public loanablelaptops(String name, String model) {
		super(name);
		this.model = model;
		
		
	}
	public String getmodel() {
		return model;
	}
}
