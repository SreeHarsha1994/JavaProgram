package Java;

public class SwapingTwoStringWithoutThirdVariable {
	public static void main(String[] args) {
		String s1="Java";
		String s2="Selenium";
		 s1=s1+s2;     //JavaSelenium
		 
		s2=s1.substring(0,s1.length()-s2.length());//Java     (12-8)     
		
		s1=s1.substring(s2.length());//selenium     (from 4th index)
		
		System.out.println(s1);
		
		System.out.println(s2);
	}

}
