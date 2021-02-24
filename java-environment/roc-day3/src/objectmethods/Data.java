package objectmethods;

public class Data {
	int value;
	public Data(int value) {
		this.value = value;
	}
	
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + value;
//		return result;
//	}
	
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Data other = (Data) obj;
//		if (value != other.value)
//			return false;
//		return true;
//	}

	@Override
	public String toString() {
		return "Data [value=" + value + "]";
	}	
	
//	public String toString() {
//		return "Data Object: [Value is: " + this.value + "]";
//	}
	
	// our own custom implementation of the equals method
	public boolean equals(Object obj) {
		if (this.value == ((Data)obj).value) {
			return true;
		}
		return false;
	}
}
