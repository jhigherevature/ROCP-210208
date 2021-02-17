package bookshelf;

public class TextBook extends Book {	
	private String subject;
	
	public TextBook(String name, String author, String text, String subject) {
		super(name, author, text);
		this.subject = subject;
	}
	
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
}
