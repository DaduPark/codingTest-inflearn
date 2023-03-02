package section1_String;

import java.util.Scanner;

public class Test11 {

	// 문자열 압축
	public String solution(String str) {

		int num = 1;
		StringBuffer result = new StringBuffer();
		char strArray[] = str.toCharArray();
		char preOneStr = 'a';

		for (int i = 0; i < strArray.length; i++) {
			if (strArray[i] != preOneStr) {
				if (num != 1) {
					result.append(num);
				}
				num = 1;
				result.append(strArray[i]);
				preOneStr = strArray[i];
			} else {
				num++;
			}
			
			if(strArray.length-1 == i && num != 1) {
				result.append(num);
			}
		}

		return result.toString();
	}

	public static void main(String[] args) {
		Test11 main = new Test11();
		// Main main = new Main();

		Scanner in = new Scanner(System.in);

		System.out.println(main.solution(in.nextLine()));
	}

}
