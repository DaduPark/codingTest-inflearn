# Array(1,2차원배)
---
## 만든 메소드
- char getGameResult(int A, int B) [Test3](https://github.com/DaduPark/codingTest-inflearn/blob/master/src/section2_Array/Test3.java)
    - 기능 : 가위바위보 결과출
    - 요청 : A, B의 가위바위보 int형(1:가위 , 2:바위, 3:보)
    - 응답 : A가 이겼을경우 'A' B가 이겼을경우 'B', 무승부일경우 'D' 

## 지식
 -
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


