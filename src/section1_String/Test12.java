package section1_String;

import java.util.Scanner;

public class Test12 {

	// 암호 
	public String solution(int num, String str) {

		StringBuffer result = new StringBuffer();

		for(int i=0; i<num ; i++) {
			result.append(getDecoding(str.substring(i*7, (i+1)*7)));
		} 
		
		return result.toString();
	}
	
	//암호된 문자열->문자 
	private char getDecoding(String encodingStr) {
		encodingStr = encodingStr.replaceAll("#", "1").replaceAll("\\*", "0");
		 int binaryToDecimal = Integer.parseInt(encodingStr, 2);
		 char decoding = (char)binaryToDecimal;
		
		return decoding;
	}

	public static void main(String[] args) {
		Test12 main = new Test12();
		// Main main = new Main();

		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		String str = in.next();

		System.out.println(main.solution(num,str));
	}

}
