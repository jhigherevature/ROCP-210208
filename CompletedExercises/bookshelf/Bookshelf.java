package bookshelf;
import java.util.Scanner;
import java.util.Hashtable;

public class Bookshelf{
	private static Scanner sc = new Scanner(System.in); 
		
	public static void main(String args[]) {
		 
		//First create some Books for the Bookshelf	
		Hashtable<String, Book> bookList = new Hashtable <String, Book> ();
		bookList.put("Baby Animals", new BabyBook("Baby Animals","Famous Author1", "Ardvark Bumblebee Cougar...", 2));
		bookList.put("Particle Physics", new TextBook("Particle Physics","Galileo Galili", "The stars are our eye into the future....", "Physics"));
		bookList.put("Grapes of Wrath", new AccessibleBook("Grapes of Wrath","John Steinbeck", "The last rains came gently....", 2));
		bookList.put("The moon is down", new AccessibleBook("The Moon is Down","John Steinbeck", "Little man in a little town....", 2));
		
		String title = "";
		do {		
			System.out.println("Choose a title to read from this list (or Q to quit): \n"+bookList.keySet());
			title = sc.nextLine();
			if (title.compareToIgnoreCase("q") == 0)
				break; //if user typed 'q', end program 
			
			//look up title in Bookshelf
			Book theBook = bookList.get(title); 
				
			if (theBook == null ) //if title not found
				System.out.println("That title does not exist on this Bookshelf");
			else {			 		// if found, read it
				System.out.println("Beginning reading of Book:\n "+theBook.read());			
			}
		} while (title.compareToIgnoreCase("q") != 0);
			
		// close Scanner
		sc.close();
	}
}
