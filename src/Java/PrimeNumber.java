package Java;

public class PrimeNumber {
	public static void main(String[] args) {
		int no=6;
		boolean flag=true;
		for(int i=2;i<no;i++) {
			if(no%i==0) {

				flag=false;
			}
			if(flag==true) {
				System.out.println("it is prime no");
			}
			else
			{
				System.out.println("not prime");
				break;
			}

		}
	}

}
