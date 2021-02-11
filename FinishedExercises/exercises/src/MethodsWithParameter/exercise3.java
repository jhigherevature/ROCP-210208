package MethodsWithParameter;

public class exercise3 {
	
	public void displayArrayStatistics(int [] a,int [] b) {
		
		//even numbers
		int temp1,temp2;
		int countA=0,countB=0;
		for(int x=0; x<a.length;x++){
			temp1=a[x];
			if(temp1%2==0) {
				countA++;
			}
		}
		for(int y=0; y<b.length;y++){
			temp2=b[y];
			if(temp2%2==0){
				countB++;
			}				
		}
		if(countA>countB)
			System.out.println("A contains more even numbers");
		else if(countA<countB)
			System.out.println("B contains more even numbers");
		else
			System.out.println("A & B contains the same amount of even numbers");
		
		//contains more data
		if(a.length >b.length)
			System.out.println("A contains more data");
		else if(a.length <b.length) 
			System.out.println("B contains more data");
		else
			System.out.println("A & B contains the same number of elements stored");
		
		//contains multiples of 3
		int tempo1,tempo2;
		int cnt1=0,cnt2=0;
		for(int i=0; i<a.length;i++){
			tempo1=a[i];
			if(tempo1%3==0)
				cnt1++;
		}
		for(int j=0; j<b.length;j++){
			tempo2=b[j];
			if(tempo2%3==0)
				cnt2++;
		}

		if(cnt1>cnt2)
			System.out.println("A contains more values that are multiple of 3");
		else if(cnt1<cnt2)
			System.out.println("B contains more values that are multiple of 3");
		else
			System.out.println("A & B contains the same number of multiples of 3");
	}

	public static void main(String[] args) {
		
		//sample input
		int []arr1= {2,3,4,5,6,7,8,9};
		int []arr2= {2,4,6,8,10,12,14,16,};
		exercise3 ex3 = new exercise3();
		ex3.displayArrayStatistics(arr1, arr2);
		
	}

}
