package section3_TwoPointers_SlidingWindow;

import java.util.Scanner;

//연속 부분 수열 
//8 6
//1 2 1 3 1 1 1 2


public class Test4 {
	public int  solution(int m,int array[]) {
		
		int result = 0 ;
		int sum=0;
		int left=0;
		
		for(int right = 0; right<array.length ; right++) {
			sum = sum+array[right];
			if(sum==m) {
				result++;
			}
			
			while(sum>=m) {
				sum=sum-array[left++];
				if(sum==m) result++;
			}
			
		}
		 
		return result;
	}
	
	
	public static void main(String[] args) {
		Test4 main = new Test4();
		
		Scanner in=new Scanner(System.in);
		
		int n = in.nextInt();
		int m = in.nextInt();
		int array[] = new int[n];
		
		for(int i=0 ;i <array.length ; i++) {
			array[i]= in.nextInt();
		}
		
		System.out.println(main.solution(m,array));
		
	}

}
