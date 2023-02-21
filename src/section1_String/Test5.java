package section1_String;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test5 {
	
	//특정문자뒤집기 
	public String solution(String str) {
		
		char strArray[] = str.toCharArray();
		
		List<Character> alphabetList  = new ArrayList<Character>();
		
		for(char oneStr : strArray) {
			if(isAlphabet(oneStr)) {
				alphabetList.add(oneStr);
			}
		}
		
		int num = alphabetList.size()-1;
		
		for(int i = 0 ; i<strArray.length ; i++) {
			
			if(isAlphabet(strArray[i])) {
				strArray[i] =alphabetList.get(num--);
			}
		}
		
		return new String(strArray);
	}
	
	private boolean isAlphabet(char oneStr) {
		
		if(oneStr >= 65 && oneStr <= 90) {
			return true;
		}
		
		if(oneStr >= 97 && oneStr <= 122) {
			return true;
		}
		
		return false;
	}
	
	
	public static void main(String[] args) {
		Test5 main = new Test5();
		
		Scanner in=new Scanner(System.in);
		
		System.out.println(main.solution(in.next()));
	}

}
