package section1_String;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test10 {

	// 가장 짧은 문자거리
	public int[] solution(String str, char oneStr) {
		List<Integer> oneStrNumList = getOneStrNumList(str, oneStr);

		int[] result = new int[str.length()];

		for (int i = 0; i < result.length; i++) {
			int subValue = 100;// 문자길이가 100을 넘지 않기때문에 차이값의 초기값은 100으로 설정
			for (int oneStrNum : oneStrNumList) {
				if (oneStrNum - i < subValue) {
					subValue = Math.abs(oneStrNum - i);
				} else {
					// 최소값이 구해지면 for 탈출
					break;
				}
			}
			result[i] = subValue;

		}

		return result;
	}

	//문자열에 존재하는 char의 순서 추
	private List<Integer> getOneStrNumList(String str, char oneStr) {
		char[] strArray = str.toCharArray();
		List<Integer> oneStrNumList = new ArrayList<Integer>();

		for (int i = 0; i < strArray.length; i++) {
			if (strArray[i] == oneStr) {
				oneStrNumList.add(i);
			}
		}

		return oneStrNumList;
	}
	
	public static void main(String[] args) {
		Test10 main = new Test10();
		//Main main = new Main();
		
		Scanner in=new Scanner(System.in);
		
		String str = in.next();
		char one = in.next().charAt(0);
		

		int[] result = main.solution(str, one);
		

		for (int i =0 ; i<result.length ; i++) {
			if(result.length-1>i) {
				System.out.print(result[i]+" ");
			}else {
				System.out.print(result[i]);
			}
		}
	}

}
