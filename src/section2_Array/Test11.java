package section2_Array;

import java.util.Scanner;

public class Test11 {

	public int solution(int n, int array[][]) {
		
		int result= 0 ;
		
		int resultArray[] = new int[n];
		
		
		for(int i=0 ; i<n ; i++) {
			for(int j=i+1 ; j<n ; j++) {
				for(int k=0 ; k<5 ; k++) {
					if(array[i][k]==array[j][k]) {
						resultArray[i]=resultArray[i]+1; 
						resultArray[j]=resultArray[j]+1; 
						break;
					}
				}
			}
		}
		
		int maxValue= 0;
		
		for(int i=0 ; i<n ; i++) {
			if(maxValue<resultArray[i]) {
				result=i;
				maxValue = resultArray[i];
			}
		}
		
		return result+1;//순번이 1부터 시작하므로 +1
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
