package section6_SortingSearching;

import java.util.Scanner;
import java.util.Stack;

public class Test1 {
	//선택정렬을 이용한 배열 오름차순정렬
	public int[]  solution(int array[] ) {
		
		for(int i=0; i<array.length ;i++) {
			
			int minVal=array[i];
			int minValIndex=i;
			
			for(int j=i+1; j<array.length ;j++) {
				if(j==i+1 || array[j]<minVal) {
					minVal=array[j];
					minValIndex=j;
				}
			}
		
			if(array[i]>minVal) {
				int temp = array[i];
				array[i]=array[minValIndex];
				array[minValIndex]= temp;
			}
		}
		
		return array;
	}
	
	

	
	
	
	public static void main(String[] args) {
		Test1 main = new Test1();
		

		Scanner in=new Scanner(System.in);
		
		int n = in.nextInt();
		int array[] = new int[n];
		
		for(int i=0 ;i <array.length ; i++) {
			array[i]= in.nextInt();
		}
	
		
		
		int result[] = main.solution(array);
		
		for(int i=0 ;i <result.length ; i++) {
			if(result.length-1>i) {
				System.out.print(result[i]+" ");
			}else {
				System.out.print(result[i]);
			}
		}
	}

}
