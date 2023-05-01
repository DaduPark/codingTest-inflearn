package section3_TwoPointers_SlidingWindow;

import java.util.Scanner;

//최대 매출
//10 3
//12 15 11 20 25 10 20 19 13 15

public class Test3 {
	public int  solution(int k,int array[]) {
		
		int maxResult = 0 ;
		int sum=0;
		for(int i =0 ; i<k ; i++) {
			sum += array[i];
		}
		maxResult = sum;
		
		int preIndex = 0;
		int nextIndex = k;
		for(int i = 1; i<array.length-k+1 ; i++) {
			sum = sum-array[preIndex]+array[nextIndex];
			preIndex += 1;
			nextIndex += 1;
			
			maxResult = Math.max(maxResult, sum);
		}
		 
		return maxResult;
	}
	
	
	public static void main(String[] args) {
		Test3 main = new Test3();
		
		Scanner in=new Scanner(System.in);
		
		int n = in.nextInt();
		int k = in.nextInt();
		int array[] = new int[n];
		
		for(int i=0 ;i <array.length ; i++) {
			array[i]= in.nextInt();
		}
		
		System.out.println(main.solution(k,array));
		
	}

}
