package Java;

import java.util.LinkedHashSet;

public class OccuranceOfEachUniqueWordInStringArray {
	public static void main(String[] args) {
		String s="Welcome To Tyss Welcome To";
		String [] str = s.split(" ");
		//Step: Create any set collection and add all the charecters of given string into set
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for(int i=0;i<str.length;i++) {                
			set.add(str[i]);                             
		}

		for(String string: set) {                        

			int count=0;                                       
			//Step2:compare each char of set with all the charactor of the given string
			for(int i=0; i<str.length;i++) {      
				if(string.equals(str[i])) {                  
					//step 3: if character matches increase the count

					count++;
				}
			}
			if(count==1) {
				System.out.println(string+"  "+count);
			}
		}
	}
}
