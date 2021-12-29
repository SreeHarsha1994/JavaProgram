package Java;

import java.util.LinkedHashSet;

public class OccuranceOfDulicateCharInString {
	public static void main(String[] args) {
		String s="zoozzkklsr";
		//Step: Create any set collection and add all the charecters of given string into set
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++) {                   //0<4 // 1<4 //2<4 // 3<4
			set.add(s.charAt(i));                             //j       //a // v// duplicate a
		}
		System.out.println(set);                       //    j a v
		for(Character ch: set) {                        // set={jav} inside ch
			// ch=j, //ch=a  
			int count=0;                                       //0->1// 0->1//1->2
			//Step2:compare each char of set with all the charactor of the given string
			for(int i=0; i<s.length();i++) {      //0<4 // 1<4 // 2<4 // 3<4 // 4<4
				if(ch==s.charAt(i)) {                  // j==j    // a==j // a==a// a==v// a==a
					//step 3: if character matches increase the count

					count++;

				}
			}
			if(count>1) {
				System.out.println(ch+"  "+count);
			}
		}
	}
}
