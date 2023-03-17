package section2_Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test6 {
	//숫자뒤집고 소수찾기 
	public List<Integer>  solution(int array[] ) {
		List<Integer> result = new ArrayList<Integer>();
		
		for(int num : array) {
			StringBuffer numStr = new StringBuffer(String.valueOf(num));
			Integer reversedStr = Integer.parseInt(numStr.reverse().toString());
			
			if(isDecimal(reversedStr)) {
				result.add(reversedStr);
			}
		}
		return result;
	}
	
	public boolean isDecimal(int num) {
		if(num==1) {
			return false;
		}
		//약수들의 곱으로 봤을때 루트를 씌운 값이 중간까지만 구하면됨.
		for(int i = 2 ; i <= Math.sqrt(num) ; i++) {
			if(num%i==0) {
				return false;
			}
		}
		
		return true;
	}
	
	
	public static void main(String[] args) {
		Test6 main = new Test6();
		
		Scanner in=new Scanner(System.in);
		
		int n = in.nextInt();
		int array[] = new int[n];
		
		for(int i=0 ;i <array.length ; i++) {
			array[i]= in.nextInt();
		}
		
		
		List<Integer> result = main.solution(array);
		
		for(int i=0 ;i <result.size() ; i++) {
			System.out.print(result.get(i));
			
			if(i!=result.size()-1) {
				System.out.print(" ");
			}
		}
	}

}
