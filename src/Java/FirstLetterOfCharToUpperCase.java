package Java;

public class FirstLetterOfCharToUpperCase {
	public static void main(String[] args) {
		String s="Welcome to India";
		String[] str = s.split(" ");
		for(int i=0;i<str.length;i++) {
			
			String s1=""+str[i].charAt(0);
			System.out.print(s1.toUpperCase()+str[i].substring(1)+" ");
//			for(int j=1;j<str[i].length();j++)
//			{
//				System.out.println(str[i].charAt(j));
//				
//			}
//			System.out.print(" ");
		}
	}

}
