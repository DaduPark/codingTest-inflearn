package section1_String;

import java.util.Scanner;

public class Test4 {
	
	//단어 뒤집기 
	public String[] solution(String array[]) {
		
		String result[] = new String[array.length];
		
		for(int i = 0 ; i<array.length ; i++) {
			result[i]= getReverseString(array[i]);
			
		}
		
		
		return result;
	}
	private String getReverseString(String str) {
		char strArray[] = str.toCharArray();
		StringBuffer reverseStr = new StringBuffer();
		
		for(int i = str.length()-1 ; i>=0 ; i--) {
			reverseStr.append(strArray[i]);
		}
		
		return reverseStr.toString();
	}
	
	
	public static void main(String[] args) {
		Test4 main = new Test4();
		
		Scanner in=new Scanner(System.in);
		
		int n = in.nextInt();
		String array[] = new String[n];
		
		for(int i =0 ; i<n ; i++) {
			array[i] = in.next();
		}
		
		
		for(String str : main.solution(array)) {
			System.out.println(str);
		}
	}

}
