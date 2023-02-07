package section1_String;

import java.util.Scanner;

public class Test1 {

	public int solution(String str, char c) {
		
		str = str.toUpperCase();
		c = Character.toUpperCase(c);
		
		int n = 0;
		
		for(char strOne : str.toCharArray()) {
			if(c == strOne) {
				n++;
			}
		}
		
		
		return n;
	}
	public static void main(String[] args) {
		Test1 main = new Test1();
		
		Scanner in=new Scanner(System.in);
		String str = in.nextLine();
		char c = in.next().charAt(0);
		
		System.out.println(main.solution(str, c));
	}

}
