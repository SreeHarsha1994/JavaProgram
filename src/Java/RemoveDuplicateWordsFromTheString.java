package Java;

import java.util.LinkedHashSet;

public class RemoveDuplicateWordsFromTheString {
	public static void main(String[] args) {
		String s="Welcome To Tyss To Tyss";
		String [] str = s.split(" ");
		//Step: Create any set collection and add all the charecters of given string into set
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for(int i=0;i<str.length;i++) {                
			set.add(str[i]);                             
		}
		for(String word : set) {
			System.out.println(word+"  ");
		}
	}
}
