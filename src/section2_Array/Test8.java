package section2_Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test8 {
	//순서구하기
	public int[]  solution(int array[] ) {
		
		int result[] = new int[array.length];
		
		Integer array2[] = Arrays.stream(array).boxed().toArray(Integer[]::new);
		Arrays.sort(array2,Collections.reverseOrder());
		
		Map<Integer, Integer> arrayOrderMap = new HashMap<Integer, Integer>();
		
		int orederNum = 1;
		for(int i = 0 ;i<array2.length ; i++) {
			if(i==0 || array2[i-1]!=array2[i]) {
				orederNum=i+1;
			}
			arrayOrderMap.put(array2[i], orederNum);
		}
		
		for(int i = 0 ;i<array.length ; i++) {
			result[i] = arrayOrderMap.get(array[i]);
		}
		
		
		
		return result;
	}
	
	public static void main(String[] args) {
		Test8 main = new Test8();
		
		Scanner in=new Scanner(System.in);
		
		int n = in.nextInt();
		int array[] = new int[n];
		
		for(int i=0 ;i <array.length ; i++) {
			array[i]= in.nextInt();
		}
		
		
		int result[] = main.solution(array);
		
		for(int i=0 ;i <result.length ; i++) {
			System.out.print(result[i]);
			
			if(i!=result.length-1) {
				System.out.print(" ");
			}
		}
	}

}
