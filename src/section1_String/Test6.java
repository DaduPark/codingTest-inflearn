package section1_String;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test6 {
	
	//중복문자제
	public String solution(String str) {
		
		char strArray[] = str.toCharArray();
		
		Set<Character> charCheckSet = new HashSet<>();
		
		StringBuffer result = new StringBuffer();
		
		for(char oneStr : strArray) {
			if(!charCheckSet.contains(oneStr)) {
				result.append(oneStr);
				charCheckSet.add(oneStr);
			}
		}
		
		return result.toString();
	}
	
	
	
	
	public static void main(String[] args) {
		Test6 main = new Test6();
		
		Scanner in=new Scanner(System.in);
		
		System.out.println(main.solution(in.next()));
	}

}
