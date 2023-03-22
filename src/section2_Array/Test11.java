package section2_Array;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test11 {

	public int solution(int n, int array[][]) {
		
		int result= 0 ;
		
		Map<Integer, Integer> resultMap = getResultMapInit(n);
		
		
		for(int i=0 ; i<n ; i++) {
			for(int j=0 ; j<n ; j++) {
				for(int k=i+1 ; k<n ; k++) {
					if(array[i][j]==array[k][j]) {
						resultMap.put(i, resultMap.get(i)+1);
						resultMap.put(k, resultMap.get(k)+1);
						break;
					}
				}
			}
		}
		
		int maxValue= 0;
		int minKey = 0;
		for ( Integer key : resultMap.keySet() ) {
		    if(resultMap.get(key)>maxValue) {
		    	maxValue = resultMap.get(key);
		    	result = key;
		    	
		    }else if(resultMap.get(key)==maxValue) {
		    	if(result>key) {
		    		result = key;
		    	}
		    }
		}
		
		return result+1;//순번이 1부터 시작하므로 +1
	}
	
	private Map<Integer, Integer> getResultMapInit(int n){
		Map<Integer, Integer> resultMap = new HashMap<Integer, Integer>();
		
		for(int i=0 ; i<n ; i++) {
			resultMap.put(i, 0);
		}
				
		return resultMap;
	}
	
	public static void main(String[] args) {
		Test11 main = new Test11();
		
		Scanner in=new Scanner(System.in);
		
		int n = in.nextInt();
		int array[][] = new int[n][5];
		
		for(int i=0 ;i <n ; i++) {
			for(int j=0 ;j <5; j++) {
				array[i][j]= in.nextInt();
			}
		}
		
		
		int result = main.solution(n,array);
		
		System.out.println(result);
	}

}
