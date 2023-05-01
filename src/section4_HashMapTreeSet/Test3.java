package section4_HashMapTreeSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

//매출액의 종류 
//7 4
//20 12 20 10 23 17 10

public class Test3 {
	public List<Integer>  solution(int k,int array[]) {
		
		
		HashMap<Integer, Integer> hash = new HashMap<>();
		
		ArrayList<Integer> resultList = new ArrayList<>();

		for(int i =0 ; i<k ; i++) {
			hash.put(array[i], hash.getOrDefault(array[i], 0)+1);
		}
		resultList.add(hash.size());
		
		int preIndex = 0;
		int nextIndex = k;
		for(int i = 1; i<array.length-k+1 ; i++) {
			//이전 값 처리
			hash.put(array[preIndex], hash.get(array[preIndex])-1);
			if(hash.get(array[preIndex])==0) {
				hash.remove(array[preIndex]);
			}
			//다음 값 처리
			hash.put(array[nextIndex], hash.getOrDefault(array[nextIndex], 0)+1);
			
			preIndex += 1;
			nextIndex += 1;
			
			resultList.add(hash.size());
		}
		 
		return resultList;
	}
	
	
	public static void main(String[] args) {
		Test3 main = new Test3();
		
		Scanner in=new Scanner(System.in);
		
		int n = in.nextInt();
		int k = in.nextInt();
		int array[] = new int[n];
		
		for(int i=0 ;i <array.length ; i++) {
			array[i]= in.nextInt();
		}
		
		List result = main.solution(k, array);
		
		for(int i=0 ;i <result.size() ; i++) {
			System.out.print(result.get(i));
			
			if(i!=result.size()-1) {
				System.out.print(" ");
			}
		}
		
	}

}
