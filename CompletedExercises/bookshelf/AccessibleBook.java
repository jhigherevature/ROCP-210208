package bookshelf;

public class AccessibleBook extends Book {
	private int accessType; // visual or audio special accessibility books; 1 - braille 2 - audio

	public AccessibleBook(String name, String author, String text, int accessType) {
		super(name, author, text);
		this.accessType = accessType;
	}
	
	public int getAccessType() {
		return accessType;
	}

	public void setAccessType(int accessType) {
		this.accessType = accessType;
	}
	
}
