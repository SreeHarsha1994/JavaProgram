package Array;

public class FirrsT3Max {
	public static void main(String[] args) {
		int[] arr= {20,10,30,60,50,40};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<3;i++) {
			System.out.println(arr[i]);
		}
	}
}
