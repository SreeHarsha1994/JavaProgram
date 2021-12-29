package Array;

public class FirstThreeMinElement {
	public static void main(String[] args) {
		
	
	int[] a= {20,10,30,50,40};
	int sum=0;
	for(int i=0;i<a.length;i++) {
		for(int j=i+1; j<a.length;j++)
		{if(a[i]>a[j]) {
			int temp=a[i];
			a[i]=a[j];
			a[i]=temp;
			
		}
	}		
}
	for(int i=0;i<=a.length;i++)
	{
		 sum=sum+a[1];
	}
	System.out.println(sum);
   
	}
}
