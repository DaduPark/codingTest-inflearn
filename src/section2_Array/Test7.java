package section2_Array;

import java.util.Scanner;

public class Test7 {
	public int  solution(int array[] ) {
		
		int result=0;
		int preScore = 0 ;
		
		for(int score : array) {
			if(score == 1) {
				preScore++;
			}else {
				preScore = 0 ;
			}
			
			result+=preScore;
			
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		Test7 main = new Test7();
		
		Scanner in=new Scanner(System.in);
		
		int n = in.nextInt();
		int array[] = new int[n];
		
		for(int i=0 ;i <array.length ; i++) {
			array[i]= in.nextInt();
		}
		
		
		int result = main.solution(array);
		
		System.out.println(result);
		
	}

}
