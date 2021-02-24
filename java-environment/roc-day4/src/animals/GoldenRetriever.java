package animals;

public class GoldenRetriever extends Dog {
	public void wagTail() {
		System.out.println("My tail is long enough to wag!");
	}

	public GoldenRetriever() {
		super("Golden Retriever", 4);
		System.out.println("GoldenRetriever Constructor");
	}
}
