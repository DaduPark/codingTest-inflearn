package section2_Array;

import java.util.Scanner;

public class Test10 {

	public int solution(int n, int array[][]) {
		
		int result =0;
		
		for(int i=0 ;i <n ; i++) {
			for(int j=0 ;j <n; j++) {
				if(isPeak(i,j,array)) {
					result++;
				}
			}
		}
		
		return result;
	}
	
	private boolean isPeak(int i, int j, int array[][]) {
		// i,j와 i-1,j/ i+1,j/ i,j-1/ i,j+1 (상하좌우_i-1,j-1>0 / i+1,j+1<size-1 일때만 비교)
		
		int up = (i-1)<0 ? 0 : array[i-1][j];
		int down = (i+1)>array.length-1 ? 0 : array[i+1][j];
		int left = (j-1)<0 ? 0 : array[i][j-1];
		int right = (j+1)>array.length-1 ? 0 : array[i][j+1];
		
		if(!(array[i][j]>up && array[i][j]>down && array[i][j]>left && array[i][j]>right)) {
			return false;
		}
		
		return true;
	}
	
	
	public static void main(String[] args) {
		Test10 main = new Test10();
		
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
