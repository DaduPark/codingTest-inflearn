package section2_Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test4 {

	public List<Integer> solution(int n) {
		
		List<Integer> result = new ArrayList<>();
		result.add(1);
		result.add(1);
		
		for(int i=2 ; i<n ; i++) {
			result.add(result.get(i-2)+result.get(i-1));
		}
		
		return result;
	}
	
	
	public static void main(String[] args) {
		Test4 main = new Test4();
		
		Scanner in=new Scanner(System.in);
		
		int n = in.nextInt();
		
		
		List<Integer> result = main.solution(n);
		
		for(int i=0 ;i <result.size() ; i++) {
			System.out.print(result.get(i));
			
			if(i!=result.size()-1) {
				System.out.print(" ");
			}
		}
	}

}
