package section2_Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test1 {

	public List<Integer> solution(int array[]) {
		
		int preValue = 0;
		
		List<Integer> result = new ArrayList<>();
		
		for(int value : array) {
			if(preValue<value) {
				result.add(value);
			}
			
			preValue = value;
		}
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
		
		
		List<Integer> result = main.solution(array);
		
		for(int i=0 ;i <result.size() ; i++) {
			System.out.print(result.get(i));
			
			if(i!=result.size()-1) {
				System.out.print(" ");
			}
		}
	}

}
