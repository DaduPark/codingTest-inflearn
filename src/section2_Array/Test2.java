package section2_Array;

import java.util.Scanner;

public class Test2 {

	public int solution(int array[]) {
		
		int result = 0;
		
		int maxValue = 0;
		
		for(int value : array) {
			if(maxValue<value) {
				result++;
				maxValue = value;
			}
			
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		Test2 main = new Test2();
		
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
