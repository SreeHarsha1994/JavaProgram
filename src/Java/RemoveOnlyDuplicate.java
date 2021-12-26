package Java;

import java.util.LinkedHashSet;

public class RemoveOnlyDuplicate {

	public static void main(String[] args) {

		String s="india";
		//Step: Create any set collection and add all the charecters of given string into set
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++) {                   //0<4 // 1<4 //2<4 // 3<4
			set.add(s.charAt(i));                             //j       //a // v// duplicate a
		}
		//	System.out.println(set);
		for(Character ch: set) {
			System.out.println(ch);
		}
	}
}
