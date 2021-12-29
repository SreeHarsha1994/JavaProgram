package Array;

public class PrintTheStringWithMinLengthInArray {
	public static void main(String[] args) {
		String[] str= {"abc","hi","mango","j","tyyss"};
		                        //3
		String min=str[0];
		for(int i=0;i<str.length;i++) {
			        //3<2  //3<5
			if(min.length()>str[i].length()) {
				min=str[i];
			}
		}
		for(int j=0;j<str.length;j++) {
			if(min.length()==str[j].length())
			{
				System.out.println(str[j]+ " ");
			}
		}
	}
}
