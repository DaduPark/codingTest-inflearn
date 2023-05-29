package section4_HashMapTreeSet;

import java.util.Scanner;
import java.util.TreeSet;

//K번째 큰 수

public class Test5 {
public int  solution(int m,int array[]) {
		
		int result = 0 ;
		TreeSet<Integer> sum = new TreeSet<>();
		 for(int i =0 ; i<array.length ; i++) {
			 for(int j =i+1 ; j<array.length ; j++) {
				 for(int k =j+1 ; k<array.length ; k++) {
					 sum.add(array[i]+array[j]+array[k]);
				 }
			 } 
		 }
		
		 int max = sum.last();
		 if(m>sum.size()) {
			 return -1;
		 }
		for(int i = 0 ; i<m-1 ; i++) {
			result = sum.lower(max);
			max = result;
		}
		return result;
	}

	
	
	public static void main(String[] args) {
		Test5 main = new Test5();
		
		Scanner in=new Scanner(System.in);
		
		int n = in.nextInt();
		int k = in.nextInt();
		int array[] = new int[n];
		
		for(int i=0 ;i <array.length ; i++) {
			array[i]= in.nextInt();
		}
		
		System.out.println(main.solution(k,array));
		
		
	}

}
