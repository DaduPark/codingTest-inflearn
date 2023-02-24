package section1_String;

import java.util.Scanner;

public class Test8 {
	
	//팰린드롬(앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열) 
	public String solution(String str) {
	   
	  String alphabetStr = getAlphabetStr(str);
	  int arrayLastNum = alphabetStr.length()-1;
	  
	  char[] strArray = alphabetStr.toCharArray();
	  
	  for(char strOne : strArray) {
	   if(Character.toUpperCase(strOne) != Character.toUpperCase(strArray[arrayLastNum--])) {
	    return "NO";
	   }
	  }
	  
	  return "YES";
	}
	
	//스트링->알파벳만포함되는 스트
	public String getAlphabetStr(String str) {
		StringBuffer alphabetStr = new StringBuffer();
		
		char[] strArray = str.toCharArray();
		for(char strOne : strArray) {
			if(isAlphabet(strOne)) {
				alphabetStr.append(strOne);
			}
		}
		
		return alphabetStr.toString();
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
		Test8 main = new Test8();
		
		Scanner in=new Scanner(System.in);
		
		System.out.println(main.solution(in.nextLine()));
	}

}
