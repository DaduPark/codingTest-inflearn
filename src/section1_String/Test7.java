package section1_String;

import java.util.Scanner;

public class Test7 {
	
	//회문 문자열(앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열)
	public String solution(String str) {
	   
	  int arrayLastNum = str.length()-1;
	  
	  char[] strArray = str.toCharArray();
	  
	  for(char strOne : strArray) {
	   if(Character.toUpperCase(strOne) != Character.toUpperCase(strArray[arrayLastNum--])) {
	    return "NO";
	   }
	  }
	  
	  return "YES";
	 }

	
	
	
	public static void main(String[] args) {
		Test7 main = new Test7();
		
		Scanner in=new Scanner(System.in);
		
		System.out.println(main.solution(in.next()));
	}

}
