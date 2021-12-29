package Array;

public class PrintTheStringWIthMaxLenghtInArray {
public static void main(String[] args) {
	String[] str= {"abc","hi","mango","j","tyyss"};
	                        //3
	String max=str[0];
	for(int i=0;i<str.length;i++) {
		        //3<2  //3<5
		if(max.length()<str[i].length()) {
			max=str[i];
		}
	}
	for(int j=0;j<str.length;j++) {
		if(max.length()==str[j].length())
		{
			System.out.println(str[j]+ " ");
		}
	}
}
}
