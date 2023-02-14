package section1_String;

import java.util.Scanner;

public class Test3 {

	public String solution(String str) {
		
		String strArray[] = str.split(" ");
		
		int count = 0;
		String result = "";
		
		for(String strOne : strArray) {
			if(count < strOne.length()) {
				count = strOne.length();
				result = strOne;
			}
		}
		
		return result;
	}
	
	
	public static void main(String[] args) {
		Test3 main = new Test3();
		
		Scanner in=new Scanner(System.in);
		String str = in.nextLine();
		
		System.out.println(main.solution(str));
	}

}
