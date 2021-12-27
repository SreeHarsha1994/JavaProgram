package Java;

public class LowerCaseToUpperCase {
    public static void main(String[] args) {
		String s="batman";
		for(int i=0;i<s.length();i++) {
			if(i==0) {
			//	String s1=""+s.charAt(i);
			//	System.out.print(s1.toUpperCase());
				char ch=(char)(s.charAt(i)-32);
				System.out.print(ch);}		
		    	else {				
					System.out.print(s.charAt(i));
				}
				}
			}
		}
	

