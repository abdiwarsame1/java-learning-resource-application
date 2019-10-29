import java.util.ArrayList;

public class catalogue {
	// using this function to add products  
	private ArrayList<item> products = new ArrayList<item>();

	public void add( item product) {
		products.add(product);	
	}
	
	public void list() {
// this function prints out all items in a array 
	for(item product : products)	 {
		System.out.println(product.getname() + ": id =  " + product.getId());
		}
	// this function search for all items in a array
	}
	public item search(int find) {
		for(item product : products) {
			if(product.getId() == find) {
				return product;
			}
		}
		return null;
		//this function deletes items
	}
	public Boolean delete(item find) {
		for(item product : products) {
			if(product == find) {
				return products.remove(product);
			}
		}
		return false;
		// this function edits items
	}
	public void edit(item find,String newName) {
		int itemLocation = products.indexOf(find);
		products.get(itemLocation).setname(newName);
	}
}
