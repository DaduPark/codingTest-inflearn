package section1_String;

import java.util.Scanner;

public class Test9 {

	//숫자만 추출 
	public int solution(String str) {
	  
		str = str.replaceAll("[^0-9]", "");
		
		int result = Integer.parseInt(str);
	  
	  return result;
	}
	
	public static void main(String[] args) {
		Test9 main = new Test9();
		//Main main = new Main();
		
		Scanner in=new Scanner(System.in);
		
		System.out.println(main.solution(in.nextLine()));
	}

}
