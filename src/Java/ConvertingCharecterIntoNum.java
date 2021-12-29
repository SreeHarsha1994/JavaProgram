package Java;

public class ConvertingCharecterIntoNum {
public static void main(String[] args) {
	
	String s="a1$b23";
	int Sum=0;
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)>=48 && s.charAt(i)<=57) {
			int n=s.charAt(i)-48; //48=0  
			Sum=Sum+n;	 
		}
		System.out.println(Sum);
	}
}
}
