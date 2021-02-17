package bookshelf;

public class BabyBook extends Book {
	private int age;
	
	public BabyBook(String name, String author, String text, int age) {
		super(name, author, text);
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
