package section3_TwoPointers_SlidingWindow;

import java.util.Scanner;

//연속된 자연수의 합
//15


public class Test5 {
	public int  solution(int n) {
		
		int result = 0 ;
		int sum=0;
		int reftNum=1;
		for(int rightNum = 1; rightNum<n ; rightNum++) {
			sum = sum+rightNum;
			if(sum==n) {
				result++;
			}
			
			while(sum>=n) {
				sum=sum-(reftNum++);
				if(sum==n) result++;
			}
			
		}
		 
		return result;
	}
	
	
	public static void main(String[] args) {
		Test5 main = new Test5();
		
		Scanner in=new Scanner(System.in);
		
		int n = in.nextInt();
		
		
		System.out.println(main.solution(n));
		
	}

}
