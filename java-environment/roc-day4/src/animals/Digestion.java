package animals;

/*
 * FunctionalInterfaces only declare a single method
 */
@FunctionalInterface
public interface Digestion {
	@Deprecated
	public void digest();
//	public void somethingElse();
}
