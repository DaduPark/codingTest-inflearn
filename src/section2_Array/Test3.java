package section2_Array;

import java.util.Scanner;

public class Test3 {

	public char[] solution(int n ,int array1[], int array2[]) {
		char result[] = new char[n];
		
		for(int i=0; i<n ; i++) {
			result[i] = getGameResult(array1[i], array2[i]);
		}
		
		return result;
	}
	
	private char getGameResult(int A, int B) {
		char result = 'D';
		
		if(A == 1) {
			if(B == 2) {
				result = 'B';
			}else if(B == 3) {
				result = 'A';
			}
		}else if(A == 2) {
			if(B == 1) {
				result = 'A';
			}else if(B == 3) {
				result = 'B';
			}
		}else if(A == 3) {
			if(B == 1) {
				result = 'B';
			}else if(B == 2) {
				result = 'A';
			}
		}
		
		return result;
	}
 	
	public static void main(String[] args) {
		Test3 main = new Test3();
		
		Scanner in=new Scanner(System.in);
		
		int n = in.nextInt();
		int array1[] = new int[n];
		
		for(int i=0 ;i <array1.length ; i++) {
			array1[i]= in.nextInt();
		}
		
		int array2[] = new int[n];
		
		for(int i=0 ;i <array2.length ; i++) {
			array2[i]= in.nextInt();
		}
		
		
		char result[] = main.solution(n ,array1, array2);
		
		for(int i=0 ;i <result.length ; i++) {
			System.out.println(result[i]);
		}
	}

}
