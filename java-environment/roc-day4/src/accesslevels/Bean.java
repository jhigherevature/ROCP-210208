package accesslevels;

public class Bean {
	private String word = "Hello";
	private int id = 1234;
	
	public Bean() {
		System.out.println("This is so we follow the Convention!");
	}
	
	public String getWord() {
		return word;
	}
	
	protected void setWord(String word) {
		this.word = word;
	}
	
	public int getId() {
		return id;
	}
	
	private void setId() {
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((word == null) ? 0 : word.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bean other = (Bean) obj;
		if (id != other.id)
			return false;
		if (word == null) {
			if (other.word != null)
				return false;
		} else if (!word.equals(other.word))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Bean [word=" + word + ", id=" + id + "]";
	}
	
}
