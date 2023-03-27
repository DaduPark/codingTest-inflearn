# Array(1,2차원배열)
---
## 만든 메소드
- char getGameResult(int A, int B) [Test3](https://github.com/DaduPark/codingTest-inflearn/blob/master/src/section2_Array/Test3.java)
    - 기능 : 가위바위보 결과출
    - 요청 : A, B의 가위바위보 int형(1:가위 , 2:바위, 3:보)
    - 응답 : A가 이겼을경우 'A' B가 이겼을경우 'B', 무승부일경우 'D' 
- public boolean isDecimal(int num) [Test5](https://github.com/DaduPark/codingTest-inflearn/blob/master/src/section2_Array/Test5.java)
	- 기능 : 소수판별 
    - 요청 : 숫자 
    - 응답 : 소수일경우 true 아닌경우 false 


## 지식
 - 배열 역순 정렬(int배열>Integer배열)
 ```java
 int array[] = {값들};
 Integer array2[] = Arrays.stream(array).boxed().toArray(Integer[]::new); //int배열>Integer배열
 Arrays.sort(array2,Collections.reverseOrder()); //배열 역순 정렬
 ```
--- 

## 1. 큰 수 출력하기[Test1](https://github.com/DaduPark/codingTest-inflearn/blob/master/src/section2_Array/Test1.java)
- 첫번째 줄 입력 : 입력되는 정수 개수 
- 두번째 줄 입력 : 비교할 숫자 나열 
- 출력 : 자신의 바로 앞수보다 큰 수 한줄 출력 


- 풀이 
  - 이전 값 변수 생성(초기값:0) 
  - 값을 for로 돌려 이전값과 비교하여 list에 담기(이전값 넣어줌)

> #입력  
> 5
>
> 3 6 1 2 4    
>
> #출력  
> 3 6 4

## 2. 보이는 학생 [Test2](https://github.com/DaduPark/codingTest-inflearn/blob/master/src/section2_Array/Test2.java)
- 첫 번째 줄 입력 : 입력되는 정수 개수 
- 두 번째 줄 입력 : 학생의 키 나열 
- 출력 : 앞에있는 사람들보다 큰 키들 한줄 출력 


- 풀이 
  - 맥스 값 변수 생성(초기값:0) 
  - 값을 for로 돌려 맥스값과 비교하여 앞사람들보다 큰 키들 개수 출력(맥스값이 변할 경우 맥스값 바꿔줌)

> #입력  
> 5
>
> 130 150 120 140 170    
>
> #출력  
> 3 (130 150 170)

## 3. 가위 바위 보 [Test3](https://github.com/DaduPark/codingTest-inflearn/blob/master/src/section2_Array/Test3.java)
- 첫 번째 줄 입력 : 게임 횟수 
- 두 번째 줄 입력 : A값의 가위바위보 값 나열 (1:가위 , 2:바위, 3:보)
- 세 번째 줄 입력 : B값의 가위바위보 값 나열 (1:가위 , 2:바위, 3:보)
- 출력 : 결과 값 나열  (A가 이겼을경우 'A' B가 이겼을경우 'B', 무승부일경우 'D')


- 풀이 
  - 경기 횟수만큼 for을 돌려 
  - A, B의 배열을 동시에 돌려 두 개의 값으로 가위바위보 결과값 출력 

> #입력  
> 3
>
> 1 2 3
> 3 2 1

> #출력  
> A D B

## 4. 피보나치 수열 [Test4](https://github.com/DaduPark/codingTest-inflearn/blob/master/src/section2_Array/Test4.java)
- 첫 번째 줄 입력 : 첫 줄에 총 항수 N(3<=N<=45)이 입력 
- 출력 : 피보나치 수열 출력(7일 경우 1 1 2 3 5 8 13)


- 풀이 
  - 입력이 3번째 부터이므로 첫번째 두번째 값은 1로 셋팅 
  - 이이전값과 이전값의 합을 가지고 list에 담아둠.

> #입력  
> 9

> #출력  
> 1 1 2 3 5 8 13 21 34

## 5. 소수(에라토스테네스 체)  [Test5](https://github.com/DaduPark/codingTest-inflearn/blob/master/src/section2_Array/Test5.java)
- 첫 번째 줄 입력 : 자연수 
- 출력 : 1부터 입력수까지의 소수 개수 출력 


- 풀이 
  - 2부터 입력수까지 돌리되 
  - 한 숫자씩 소수인지 판별하여 개수증가
  - 소수판별은 2부터 제곱근까지 나눠 소수 확인 
  ```
  당 숫자의 √N 까지 확인하는 방법이다. 이 원리는 약수의 중심을 구하는 방법이다. 예를들어 80의 약수는 아래와 같다.  
  1, 2, 4, 5, 8, 10, 16, 20, 40, 80  
  각 숫자들의 곱이 80이되는 쌍을 같은 색으로 표시했다.   
  1:80, 2:40, 4:20, 5:16, 8:10. √80의 값은 대략 8.xxx의 값이 나온다.    
  즉 약수들의 곱으로 봤을때 루트를 씌운 값이 중간값이 된다.  
  이 원리는 이용하여 2에서부터 √N의 값까지 검색을한다며 이후의 값은 확인할 필요가 없게 된고 시간복잡도는 O(√N)이 된다.  
  코드의 가독성을 위해 루트함수는 사용하지 않고 i의 제곱값으로 확인을한다.  
  ```
  [출처:https://myjamong.tistory.com/139](https://myjamong.tistory.com/139)

> #입력  
> 9

> #출력  
> 1 1 2 3 5 8 13 21 34


## 6. 뒤집은 소수  [Test6](https://github.com/DaduPark/codingTest-inflearn/blob/master/src/section2_Array/Test6.java)
- 첫 번째 줄 입력 : 입력되는 정수 개수 
- 두 번째 줄 입력 : 숫자나열
- 출력 : 나열된 숫자 중 뒤집은 값이 소수인 값들 정렬(뒤집은 값으로 표시)


- 풀이 
  - 값을 StringBuffer에 담아 reverse를 통해 뒤집은 후 
  - 소수값일 경우(isDecimal 메소드 사용) 값 저장
> #입력  
> 9
>4 22 42 20 250 370 200 30 100

> #출력  
> 4 2 73 2 3

## 7.  점수계산 [Test7](https://github.com/DaduPark/codingTest-inflearn/blob/master/src/section2_Array/Test7.java)
- 첫 번째 줄 입력 : 문제 개수
- 두 번째 줄 입력 : 0,1로 나와있는 숫자 나열(오답:0, 정답:1)
- 출력 : 점수나열(앞에 문제가 정답일경우 +1하여 채점)


- 풀이 
  - 이전문제가 정답일경우 +1 아닐 경우 0으로 초기화하여
  - 값을 나열  
  
> #입력  
> 10
>1 0 1 1 1 0 0 1 1 0


> #출력  
> 10

## 8. 등수구하기 [Test8](https://github.com/DaduPark/codingTest-inflearn/blob/master/src/section2_Array/Test8.java)
- 첫 번째 줄 입력 : 문제 개수
- 두 번째 줄 입력 : 점수 나열
- 출력 : 등수 나열(동일한 점수일 경우 동일 등수이며 다음 점수에는 순서에 맞게 등수 측정 ex-> 99 99 88 : 1 1 2)


- 풀이 
  - 점수를 정렬 시킨 후 for문을 통해 돌면서
  - 해당 값과 등수를 key value형태로 담기(key:값, value:등수)
  - 이때, 등수 변수를 만들어 0이 아니거나 이전점수와 같을 경우 등수변수는 이전과 동일하게 하고 / 만약 이전점수와 다를경우 for문의 순서값을 등수변수에 넣어준다(정렬된 값들을 순서에 맞게 등수를 매겨주기위해서)
  - 처음에 받아온 점수배열을 반복문으로 돌려  Map에 담은 데이터를 통해 해당 값에 맞는 등수를 저장해준다.
> #입력  
> 10
>1 0 1 1 1 0 0 1 1 0


> #출력  
> 10


## 9. 격자판 최대합 [Test9](https://github.com/DaduPark/codingTest-inflearn/blob/master/src/section2_Array/Test9.java)
- 설명 : 주어진 N*N 정사각형 격자판의 각행의 합, 각 열의 합, 두 대각선의 합 중 가장 큰 값 출력
- 첫 번째 줄 입력 : 자연수 N 
- 두 번째 줄부터 입력 : N줄에 걸쳐 각 줄의 N개의 자연수
- 출력 : 각행의 합, 각 열의 합, 두 대각선의 합 중 가장 큰 값 출력


- 풀이 
  - 대각선 값 : N번 for문을 돌려 array[i][i]를 더한 값과 반대쪽 대각선인 array[n-1-i][n-1-i]로 구한다
  - 행 값 : 이중 for문으로 array[i][j] 값을 더해서 구하고 안에 있는 포문이 끝나면 한 줄의 값을 구한다.
  - 열 값 : 이중 for문으로 array[j][i] 값을 더해서 구하고 안에 있는 포문이 끝나면 한 줄의 값을 구한다.
  - 해당 값들 중 가장 큰 값을 출력
  
> #입력  
> 5
> 10 13 10 12 15
> 12 39 30 23 11
> 11 25 50 53 15
> 19 27 29 37 27
> 19 13 30 13 19

> #출력  
> 155

## 10. 봉우리 [Test10](https://github.com/DaduPark/codingTest-inflearn/blob/master/src/section2_Array/Test10.java)
- 설명 : 주어진 N*N 정사각형 격자판이 주어질때 상하좌우 보다 큰 경우 봉우리로 가정했을때의 봉우리 개수 구하기 (격자의 가장자리는 0으로 둘러쌓여있다고 가정한다.)
- 첫 번째 줄 입력 : 자연수 N 
- 두 번째 줄부터 입력 : N줄에 걸쳐 각 줄의 N개의 자연수
- 출력 : 봉우리의 개수


- 풀이 
  - 이중포문으로 돌려 하나씩의 값들과 그 값 사방의 값과 비교를 하여 봉우리 여부를 판단 (상하좌우_i-1,j-1<0 / i+1,j+1>(size-1) 일때는 0으로 간주)
  ```java
	int up = (i-1)<0 ? 0 : array[i-1][j];
	int down = (i+1)>array.length-1 ? 0 : array[i+1][j];
	int left = (j-1)<0 ? 0 : array[i][j-1];
	int right = (j+1)>array.length-1 ? 0 : array[i][j+1];
  ```

> #입력  
> 5
> 5 3 7 2 3
> 3 7 1 6 1
> 7 2 5 3 4
> 4 3 6 4 1
> 8 7 3 5 2

> #출력  
> 10


## 11. 임시반장 정하기 [Test11](https://github.com/DaduPark/codingTest-inflearn/blob/master/src/section2_Array/Test11.java)
- 설명 : 한 줄에 한 학생이 1학년부터 5학년(한줄당 5개) 중 몇반에 속해있는지를 나타내는 정수들이 주어지는데
        이를 보고 N명의 학생들 중 가장 다른 사람들과 같은 반이 많이된 학생을 찾아 반장을 시키는 문제.
- 첫 번째 줄 입력 : 자연수 N (학생수)
- 두 번째 줄부터 입력 : 5개의 자연수(1학년부터 5학년때까지의 속해있던 반 나열)
- 출력 : 반장에 적합한 학생 출력


- 풀이 
  - 한 학생당 다른 학생과 얼마나 같은 반이 되었는지의 결과값을 저장하는 변수 선언 :resultArray[] => 1번학생은 resultArray[0] / 2번학생은 resultArray[1].. 에 저장
  - 위에서부터 기준으로 아래 행 하나씩 비교하며 값을 저장(1번은 2~5학생과 비교, 2번은 3~5번학생과 비교)
  - 이때, 아래 학생은 위에 학생과 비교를 할 수 없으므로 위에서 비교 시 같은 반으로 값을 추가할때 비교대상의 값도 추가시켜준다.(기준대상 resultArray[i] / 비교대상 resultArray[j])
  - 결과 값이 저장되면 그 학생들중 최대값을 가지고 있는 값을 출력
  
> #입력  
> 5
> 2 3 1 7 3
> 4 1 9 6 8
> 5 5 2 4 4
> 6 5 2 6 7
> 8 4 2 2 2

> #출력  
> 4

## 12. 멘토링 [Test12](https://github.com/DaduPark/codingTest-inflearn/blob/master/src/section2_Array/Test12.java)
- 설명 : 1~N번의 학생이 있을때 각 줄(M개의 줄)에 등수 순으로 학생을 나열한다.(1등인 3번학생- 2등인 1번학생 - 3등인 4번학생 - 4등인 2번학생 일때 : 3 1 4 2)
        이때, 멘토와 멘티를 정하는데 멘토는 멘티보다 모든 M회차의 시험에서 멘티보다 등수가 좋아야한다.
		이때의 멘티, 멘토를 정할 수 있는 경우의수를 출력하라.
- 첫 번째 줄 입력 : 자연수 N (학생수), 자연수  M(시험 회차)
- 두 번째 줄부터 입력 : 학생 번호 나열(등수 순)
- 출력 : 멘티 멘토의 경우의 수 출력


- 풀이 
  - 먼저 등수 순으로 되어있던 배열을 학생 번호 순으로 변경하고 등수를 표현하게 한다.
  ```java
	//이전 : 1등인 3번학생- 2등인 1번학생 - 3등인 4번학생 - 4등인 2번학생(등수 순)
	// 변환 : 2등인 1번학생 -  4등인 2번학생 - 1등인 3번학생 - 3등인 4번학생  (번호 순) ==> 배열에 쉽게 표현하기 위해 -1을 해줌 (1번학생을 0으로, 2번학생을 1로 표현) 
	
	for(int i=0 ;i <m ; i++) {
			for(int j=0 ;j <n; j++) {
				rankSortArry[i][array[i][j]-1]= j;
			}
		}
	//     변형 되기전
	//		3 4 1 2
	//		4 3 2 1
	//		3 1 4 2 
	
	//		변형 후 		
	//		2 3 0 1
	//		3 2 1 0
	//		1 3 0 2

  ```
  - 그 후 n번 학생의 m회 수학문제와 비교대상의 m회 수학 점수를 비교하여 처리한다 (앞의 세로줄이 뒤에 세로전체 한줄보다 등수가 낮으면 멘토가능한것으로 판단)
  - 왼쪽부터 오른쪽으로 비교를 하므로 

