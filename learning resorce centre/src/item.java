import java.util.Random;

public class item {
// Attributes

	private String name;
	private int id;
// this is creates a random ID between 1-1000000000
	public item(String name) {
		this.name = name;
		this.id = new Random().nextInt(1000000000) + 1;
	}

	public String getname() {
		return name;
	}
	public int getId() {
		return id;
	}
	public void setname(String name) {
		this.name = name;
	}
	
}
