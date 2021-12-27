package Java;

public class ReverseString {
	public static void main(String[] args) {
		String s="Welcome to Tyss Company";
		String [] str=s.split("");
		String rev="";
		for(int i=str.length-1;i>=0;i--) {
			rev=rev+str[i]+ " ";
		}
		System.out.println(rev);
	}
// w Swap the first and last words of given string statement
}
