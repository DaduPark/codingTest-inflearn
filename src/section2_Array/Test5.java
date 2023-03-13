package section2_Array;

import java.util.Scanner;

public class Test5 {
//12
	public int solution(int n) {
		
		int result = 0;
		
		for(int i = 2 ; i<=n ; i++) {
			if(isDecimal(i)) {
				result++;
			}
		}
		
		return result;
	}
	
	public boolean isDecimal(int num) {
		//1과 자기자신을 제외하고 나눠봄 
		for(int i = 2 ; i <= Math.sqrt(num) ; i++) {
			if(num%i==0) {
				return false;
			}
		}
		
		return true;
	}
	
	
	public static void main(String[] args) {
		Test5 main = new Test5();
		
		Scanner in=new Scanner(System.in);
		
		int n = in.nextInt();
		
		
		int result = main.solution(n);
		
		System.out.print(result);
	}

}
