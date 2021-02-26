package com.examples.reflectexample;

public class Frankenstein {
	private int id;
	private String word;
	public double pubNum;
	public static boolean isHungry;
	public Frankenstein() {
		super();
	}
	public Frankenstein(int id, String word, double pubNum) {
		super();
		this.id = id;
		this.word = word;
		this.pubNum = pubNum;
	}
	public int getId() {
		return id;
	}
	private void setId(int id) {
		this.id = id;
	}
	public String getWord() {
		return word;
	}
	private void setWord(String word) {
		this.word = word;
	}
	public double getPubNum() {
		return pubNum;
	}
	public void setPubNum(double pubNum) {
		this.pubNum = pubNum;
	}
	public static boolean isHungry() {
		return isHungry;
	}
	public static void setHungry(boolean isHungry) {
		Frankenstein.isHungry = isHungry;
	}
	
	public void method(String a, int b, float c) {
		System.out.println("We will use this method to look at multiple parameters in the reflections API");
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((word == null) ? 0 : word.hashCode());
		long temp;
		temp = Double.doubleToLongBits(pubNum);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Frankenstein other = (Frankenstein) obj;
		if (id != other.id)
			return false;
		if (word == null) {
			if (other.word != null)
				return false;
		} else if (!word.equals(other.word))
			return false;
		if (Double.doubleToLongBits(pubNum) != Double.doubleToLongBits(other.pubNum))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Frankenstein [id=" + id + ", word=" + word + ", pubNum=" + pubNum + "]";
	}
	
	
}
