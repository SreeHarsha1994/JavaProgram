package Java;

public class FactorialNum {
	public static void main(String[] args) {
		int k=6;
		int fact=1;
		for(int i=k;i>=1;i--) {
			fact=fact*i;
		}
		System.out.println(fact);
	}
}
