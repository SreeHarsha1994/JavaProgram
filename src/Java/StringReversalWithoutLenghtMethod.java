package Java;

public class StringReversalWithoutLenghtMethod {
	public static void main(String[] args) {
		String s="Java";
		String rev="";
		char[] ch = s.toCharArray();
		System.out.println(ch);
		int count=0;
		for(char c: ch) {
			System.out.println(c);
			count++;//number of char
		}
		for(int i=count-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}
}
