package section3_TwoPointers_SlidingWindow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

//공통원소 구하기
public class Test2 {
	public List<Integer>  solution(int array1[],int array2[] ) {
		
		Set<Integer> array1List = new HashSet<Integer>();
		List<Integer> resultLIst = new ArrayList<Integer>();
		 for (int i : array1) {
			 array1List.add(i);
	     }
		 
		 
		 for (int i : array2) {
			 if(array1List.contains(i)) {
				 resultLIst.add(i);
			 }
	     }
		
		 Collections.sort(resultLIst);
		 
		return resultLIst;
	}
	
	
	public static void main(String[] args) {
		Test2 main = new Test2();
		
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
		
		
		List<Integer> result = main.solution(array,array2);
		
		for(int i=0 ;i <result.size() ; i++) {
			System.out.print(result.get(i));
			
			if(i!=result.size()-1) {
				System.out.print(" ");
			}
		}
		
	}

}
