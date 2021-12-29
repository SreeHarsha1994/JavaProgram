package Java;

import java.util.LinkedHashSet;

public class FindPositionOfEachChar {
public static void main(String[] args) {
	String str="Tester";
	String s1=str.toLowerCase();
	System.out.println(s1);
	LinkedHashSet<Character> set= new LinkedHashSet<Character>();
	for(int i=0;i<=str.length();i++) {
		set.add(str.charAt(i));
	}
	for(Character ch:set) {
		for(int i=0;i<str.length();i++)
		{
			if(ch==str.charAt(i)) {
				System.out.println(ch+"  "+(i+1));
				break;
			}
		}
	}
}
}
