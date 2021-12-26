package Java;

public class PallindromOfNum {
	public static void main(String[] args) {

		int no=141;
		int copy=no;
		int sum=0;
		while(no>0) {
			int digit=no%10;
			sum=sum*10+digit;
			no=no/10;
		}
		if(copy==sum) {
			System.out.println("is palindrom");
		}
		else {
			System.out.println("not palindrom");
		}
	}

}
