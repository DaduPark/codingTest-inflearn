package section2_Array;

import java.util.Scanner;

public class Test12 {

	public int solution(int m, int n, int array[][]) {
		
		int result = 0 ;
		int resultArr[] = new int[n];
//     변형 되기전
//		3 4 1 2
//		4 3 2 1
//		3 1 4 2 

		int rankSortArry[][] = getRankSortArry(m,n,array);
		
//		변형 후 		
//		2 3 0 1
//		3 2 1 0
//		1 3 0 2
		
		// n번 학생의 m회 수학문제와 비교대상의 m회 수학 점수를 비교하여 처리
		for(int i=0 ;i <n ; i++) {
			for(int j=i+1 ;j <n; j++) {
				
				boolean iFlag = true;
				boolean jFlag = true;
				
				for(int k=0 ; k <m; k++) {
					if(rankSortArry[k][i]>rankSortArry[k][j]) {
						iFlag = false;
					}
					if(rankSortArry[k][i]<rankSortArry[k][j]) {
						jFlag = false;
					}
				}
				
				if(iFlag) {
					resultArr[i] = resultArr[i]+1; 
				}
				if(jFlag) {
					resultArr[j] = resultArr[j]+1;
				}
				
			}
		}
		
		
		for(int i : resultArr) {
			result += i;
		}
				
		return result;
	}
	
	
	//등수순으로 나열되어있던 번호를 번호순서대로 등수로 표현
	//ex) 이전 : 1등인 3번학생- 2등인 1번학생 - 3등인 4번학생 - 4등인 2번학생(등수 순)
	// 변환 : 2등인 1번학생 -  4등인 2번학생 - 1등인 3번학생 - 3등인 4번학생  (번호 순) ==> 배열에 쉽게 표현하기 위해 -1을 해줌 (1번학생을 0으로, 2번학생을 1로 표현) 
	private int[][] getRankSortArry(int m, int n, int array[][]){
		int rankSortArry[][] = new int[m][n];
		
		for(int i=0 ;i <m ; i++) {
			for(int j=0 ;j <n; j++) {
				rankSortArry[i][array[i][j]-1]= j;
			}
		}
		
		return rankSortArry;
		
	}
	
	
	public static void main(String[] args) {
		Test12 main = new Test12();
		
		Scanner in=new Scanner(System.in);
		
		int n = in.nextInt();
		int m = in.nextInt();
		int array[][] = new int[m][n];
		
		for(int i=0 ;i <m ; i++) {
			for(int j=0 ;j <n; j++) {
				array[i][j]= in.nextInt();
			}
		}
		
		
		int result = main.solution(m, n, array);
		
		System.out.println(result);
	}

}
