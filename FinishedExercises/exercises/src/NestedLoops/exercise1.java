package NestedLoops;

public class exercise1 {

	public static void main(String[] args) {
		
		String [] fname = {"Adam", "Alexis", "Dennis", "Jose", "Jessica", "Meghan", "Memphis",
				"Nicky", "Sarah", "William"};
		
		String [] lname = {"Adamson", "Bond", "Brown", "Johnson", "Gallagher", "Smith", "Thompson",
				"Perez", "Snow", "Tran"};
		
		for(int i=0; i<fname.length;i++)
			for(int j=0; j<lname.length;j++)
			{
				System.out.println(fname[i]+ " " + lname[j]);
			}
		

	}

}
