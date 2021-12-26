package Java;

public class FibNumber {
	public static void main(String[] args) {
		int fib1=0;
		int fib2=1;
		int fib3;
		System.out.println(fib1+"   "+fib2);

		for(int i=0;i<3;i++)
		{
			fib3=fib1+fib2;
			System.out.println(fib3);
			fib1=fib2;
			fib2=fib3;
		}

	}



}
