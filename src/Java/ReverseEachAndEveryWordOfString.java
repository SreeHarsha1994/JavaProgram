package Java;

public class ReverseEachAndEveryWordOfString {
public static void main(String[] args) {
	String s1="Welcome To Tyss";
	String[] str=s1.split(" ");

	for(int i=0;i<str.length;i++) {
		String s11=str[i];
		String rev="";
		for(int j=s11.length()-1;j>=0;j--) {
			rev=rev+s11.charAt(j);
		}
		System.out.print(rev + " ");
		
	}
}
}
