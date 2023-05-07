package section3_TwoPointers_SlidingWindow;

import java.util.Scanner;

//연속 부분 수열 
//8 6
//1 2 1 3 1 1 1 2


public class Test4 {
	public int  solution(int m,int array[]) {
		
		int result = 0 ;
		int sum=0;
		int nextIndex=0;
		while(sum<m) {
			sum += array[nextIndex];
			nextIndex++;
		}
		
		if(sum==m) {
			result++;
		}
		
		int preIndex = 0;
		
		for(int i = nextIndex; i<array.length ; i++) {
			sum = sum-array[preIndex];
			preIndex++;
			if(sum==m) {
				result++;
			}
			if(sum>=m) {
				continue;
			}
			
			
			while(sum<m ) {
				sum += array[nextIndex];
				nextIndex++;
			}
			if(sum==m) {
				result++;
			}
			
			if(nextIndex>=array.length) {
				break;
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
