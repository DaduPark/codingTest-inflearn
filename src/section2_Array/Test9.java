package section2_Array;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Test9 {

	public int solution(int n, int array[][]) {
		
		int diagonal1 = 0;
		int diagonal2 = 0;
		
		int verticalMax = 0; //세로
		int horizontalMax =0;
		for(int i=0 ;i <n ; i++) {
			diagonal1 = array[i][i]+diagonal1;
			diagonal2 = array[n-1-i][n-1-i]+diagonal2;
			int vertical = 0;
			int horizontal = 0;
			for(int j=0 ;j <n; j++) {
				vertical = array[i][j]+vertical;
				horizontal = array[j][i]+horizontal;
			}
			if(vertical>verticalMax) {
				verticalMax = vertical;
			}
			
			if(horizontal>horizontalMax) {
				horizontalMax = horizontal;
			}
			
		}
		
		LinkedList<Integer> result = new LinkedList<Integer>();
		result.add(diagonal1);
		result.add(diagonal2);
		result.add(verticalMax);
		result.add(horizontalMax);
		
		
		return Collections.max(result);
	}
	
	
	public static void main(String[] args) {
		Test9 main = new Test9();
		
		Scanner in=new Scanner(System.in);
		
		int n = in.nextInt();
		int array[][] = new int[n][n];
		
		for(int i=0 ;i <n ; i++) {
			for(int j=0 ;j <n; j++) {
				array[i][j]= in.nextInt();
			}
		}
		
		
		int result = main.solution(n,array);
		
		System.out.println(result);
	}

}
