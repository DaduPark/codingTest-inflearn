package section3_TwoPointers_SlidingWindow;

import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
	public int[]  solution(int array[],int array2[] ) {
		
		int[] result=  new int[array.length+array2.length];
		int n = 0;
		for(int i : array) {
			result[n++]=i;
		}
		for(int i : array2) {
			result[n++]=i;
		}
		
		Arrays.sort(result);
		return result;
	}
	
	
	public static void main(String[] args) {
		Test1 main = new Test1();
		
		Scanner in=new Scanner(System.in);
		
		int n = in.nextInt();
		int array[] = new int[n];
		
		for(int i=0 ;i <array.length ; i++) {
			array[i]= in.nextInt();
		}
		
		int n2 = in.nextInt();
		int array2[] = new int[n2];
		
		for(int i=0 ;i <array2.length ; i++) {
			array2[i]= in.nextInt();
		}
		
		
		int[] result = main.solution(array,array2);
		
		for(int i=0 ;i <result.length ; i++) {
			System.out.print(result[i]);
			
			if(i!=result.length-1) {
				System.out.print(" ");
			}
		}
		
	}

}
