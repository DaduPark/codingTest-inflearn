package section1_String;

import java.util.Scanner;

public class Test2 {

	public String solution(String str) {
		
		StringBuffer result = new StringBuffer();
		for(char strOne : str.toCharArray()) {
			if(isLowerCase(strOne)) {
				strOne = Character.toUpperCase(strOne);
			}else {
				strOne = Character.toLowerCase(strOne);
			}
			result.append(strOne);
		}
		
		
		return result.toString();
	}
	
	public boolean isLowerCase(char c) {
		if(c > 90) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Test2 main = new Test2();
		
		Scanner in=new Scanner(System.in);
		String str = in.nextLine();
		
		System.out.println(main.solution(str));
	}

}
