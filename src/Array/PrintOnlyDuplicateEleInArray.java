package Array;

import java.util.LinkedHashSet;

public class PrintOnlyDuplicateEleInArray {
	public static void main(String[] args) {
		int[] a= {1,2,3,1,9,4,5,7,9};

		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		for(int i=0;i<a.length;i++) {                  
			set.add(a[i]);                            
		}
		for(Integer n: set) {
			int count=0;
			for(int i=0;i<a.length;i++) {
				if(n==a[i]) {
					count++;

			}
		}
		if(count>1) {
			System.out.println(n + "="+count);
		}
		}
	}
}
	

