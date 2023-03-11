package Array;

public class AscendingANdDescending {

	public static void main(String[] args) 
	{
			
		int[] a= {1,2,5,3,6,7,1,8,9,4};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];  //0=2
					a[i]=a[j];     //a[i]=1
					a[j]=temp;     //a[j]=2  
				}
			}
			
			System.out.print(a[i]+" ");
		}
		
		
	
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]<a[j]) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		
		System.out.println(a[i]+" ");
	}
	}
}