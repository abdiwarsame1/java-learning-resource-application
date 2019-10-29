import java.util.Scanner;

public class Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		catalogue cat = new catalogue();
//
		for(int x = 0; x < 1; x++) {
			books a = new books("book", "author", 2004);
			DVDs b = new DVDs("dvd", "action", 0);
			acedimicjournal c = new acedimicjournal("name", "author", "publisher");
			loanablelaptops d = new loanablelaptops("name", "model");

			cat.add(a);
			cat.add(b);
			cat.add(c);
			cat.add(d);
		// these are the list options the user can choose from to do what they intend to do.	
		}
		System.out.println("option 1 add items");
		System.out.println("option 2 edit items");
		System.out.println("option 3 list items");
		System.out.println("option 4 search items");
		System.out.println("option 5 delete items");
		System.out.println("Press Anything else to exit");

		
		Scanner scanner = new Scanner(System.in);
		String option = scanner.nextLine();

		int value = Integer.parseInt(option);
		
		while(value >0 && value < 6) {
			
// this is the function for option 1 which is to add things using the scanner.
		
		if(value == 1) {
			System.out.println("what item would you like to add");
			System.out.println("option 1 book");
			System.out.println("option 2 academic journal");
			System.out.println("option 3 DVDs");
			System.out.println("option 4 loanable laptops");

			Scanner addingItemsOption = new Scanner(System.in);
			String addingOption = scanner.nextLine();

			int valueOption = Integer.parseInt(addingOption);
			// to add things to the book class
	
			if(valueOption == 1) {
				System.out.println("enter name");
				
				Scanner nameScanner = new Scanner(System.in);
				String name = scanner.nextLine();

				System.out.println("enter author");
				
				Scanner authorScanner = new Scanner(System.in);
				String author = scanner.nextLine();
				
				System.out.println("enter date published");

				Scanner pubScanner = new Scanner(System.in);
				String pub = scanner.nextLine();

				int datePub = Integer.parseInt(option);
				
				books newBook = new books(name,author,datePub);
				
				cat.add(newBook);
				System.out.println("Book added");
			}
			else if(valueOption ==  2) {
				System.out.println("enter name");
				// add things to the acedemic journal class
				Scanner nameScanner = new Scanner(System.in);
				String name = scanner.nextLine();
				
                System.out.println("enter author");
				
				Scanner authorScanner = new Scanner(System.in);
				String author = scanner.nextLine();
				
                System.out.println("enter publisher");
				
				Scanner publisherScanner = new Scanner(System.in);
				String publisher = scanner.nextLine();
				
				acedimicjournal journal = new acedimicjournal(name,author,publisher);
				
				cat.add(journal);
				System.out.println("acedimic journal added");				
			}
			else if(valueOption ==  3) {
				System.out.println("enter name");
				//add things to DVD class
				
				Scanner nameScanner = new Scanner(System.in);
				String name = scanner.nextLine();
				
				System.out.println("enter genre");
				
				Scanner geneScanner = new Scanner(System.in);
				String genre = scanner.nextLine();
				
				System.out.println("enter year");

				Scanner yearScanner = new Scanner(System.in);
				String year = scanner.nextLine();

				int yearpub = Integer.parseInt(year);
				
				DVDs dvd = new DVDs(name,genre,yearpub);
				
				cat.add(dvd);
				System.out.println("DVDs added added");				

				
			}
			else if(valueOption ==  4) {
				System.out.println("enter name");
				//add things to loanable laptop class 
				
				Scanner nameScanner = new Scanner(System.in);
				String name = scanner.nextLine();
				
				System.out.println("enter model");
				
				Scanner modelScanner = new Scanner(System.in);
				String model = scanner.nextLine();
				
				loanablelaptops laptop = new loanablelaptops(name,model);
				cat.add(laptop);
				System.out.println("loabale laptops added added");				

				
			}
			
		}
		else if(value == 2) {
			System.out.println("what item would you like to edit");
			// this is for option 2 where you want edit things in your catalogue
			
			Scanner idScanner = new Scanner(System.in);
			String  itemId = idScanner.nextLine().toString();
			int userValue = Integer.parseInt(itemId);

			item find = cat.search(userValue);
			
			if(find != null) {
			
			System.out.println("Item Found what would you like to change the name to?");
			
			Scanner nameScanner = new Scanner(System.in);
			String  newName = idScanner.nextLine().toString();
			
			find.setname(newName);
						
			System.out.println("Item has been edited");
			
			}
			else {
				System.out.println("Item was not found and could not be edited");
			}
			
	
		}
		else if(value == 3) {
			// in can you can simply list things in your catalogue
			cat.list();
		}
		else if(value == 4) {
			System.out.println("what item would you like search");
			// this is where you can search for things in your catalogue
			
			Scanner idScanner = new Scanner(System.in);
			String  itemId = idScanner.nextLine().toString();
			int userValue = Integer.parseInt(itemId);
			
			item find = cat.search(userValue);

			if(find != null) {
				System.out.println("item was found");

			}
			else {
				System.out.println("item not found");
			}

		}
		else if(value == 5) {
			System.out.println("what item would you like to delete? Enter the id to delet item");
			// in here you can delete things from your catalogue.
			
			Scanner idScanner = new Scanner(System.in);
			String  itemId = idScanner.nextLine().toString();
			int userValue = Integer.parseInt(itemId);
			
			item find = cat.search(userValue);

			if(find != null) {
				cat.delete(find);
				System.out.println("item deleted");

			}
			else	 {
				System.out.println("item not found");
				}
			}
		
			System.out.println("\n\nwhat other options would you like to select?");
			// this is list of all the options available to the user. 
			System.out.println("option 1 add items");
			System.out.println("option 2 edit items");
			System.out.println("option 3 list items");
			System.out.println("option 4 search items");
			System.out.println("option 5 delete items");
			System.out.println("Press Anything else to exit");

			scanner = new Scanner(System.in);
			option = scanner.nextLine();

			value = Integer.parseInt(option);
		
		}
		System.out.println("Thanks for using the program");
// this is where the program ends.
		
	}
}
	
