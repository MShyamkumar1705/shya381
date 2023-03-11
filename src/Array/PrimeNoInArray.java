package Array;

public class PrimeNoInArray {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8,9};
		for(int i=0;i<a.length;i++) {
			int temp=a[i];
			if(temp%1==0 || temp%i==0) {
				System.out.println(temp);
				i++;
			}
			
		}
	}

}
