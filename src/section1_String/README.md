# String(문자열)
---
## 만든 메소드
- boolean isLowerCase(char c) [Test2](https://github.com/DaduPark/codingTest-inflearn/blob/master/src/section1_String/Test2.java)
    - 기능 : 소문자 확인
    - 요청 : char
    - 응답 : boolean
 
- String getReverseString(String str) [Test4](https://github.com/DaduPark/codingTest-inflearn/blob/master/src/section1_String/Test4.java)
    - 기능 : 단어 뒤집어줌
    - 요청 : String
    - 응답 : String
    
- boolean isAlphabet(char c) [Test5]https://github.com/DaduPark/codingTest-inflearn/blob/master/src/section1_String/Test5.java
    - 기능 : 알파벳여부 확인 
    - 요청 : char
    - 응답 : boolean

- String getAlphabetStr(String str) [Test8]https://github.com/DaduPark/codingTest-inflearn/blob/master/src/section1_String/Test8.java
    - 기능 : 문자열을 알파벳만 포함된 문자열로 반환 (내부에서 isAlphabet호출)
    - 요청 : 문자열 String
    - 응답 : 알파벳문자열 STringß


## 지식
 - contains 함수 사용 시 
   - ArrayLis보다 HashSet를 통해 사용해야 성능이 더 좋다.
--- 

## 1.문자 찾기
- 첫번째 줄 입력 : 검색할 문자열
- 두번째 줄 입력 : 찾고자 하는 문자
- 출력 : 찾고자 하는 문자의 갯수


- 풀이 
  - 검색할 문자열을 대문자로 변경  char 배열로 변환 후 
  - 배열을 for문을 사용하여 돌려 찾고자하는 문자의 대문자형과 비교

> #입력  
> Tomato  
> t    
>
> #출력  
> 2

## 2.대소문자 변환
- 첫번째 줄 입력 : 대소문자가 같이 존재하는 문자열
- 출력 : 대문자는 소문자로, 소문자는 대문자로 변환된 문자열 출력


- 풀이
  - 문자열을 char배열로 변환 후 for문으로 돌려
  - char이 소문자->대문자, 대문자->소문자 변환 (isLowerCase 활용) 
    
> #입력  
> AlgoRithM  
>
> #출력
> aLGOrITHm

## 3.가장 긴 문자 추출 
- 첫번째 줄 입력 : 공백이 존재하는 대소문자 문자열 
- 출력 : 가장 긴 문자열

- 풀이
  - 공백으로 split한 배열을 for문으로 돌려
  - 한단어의 길이를 비교하여 최댓값(count)변수에 넣고
  - 최댓값일때만 변수에 값을 넣어줌
  
> #입력  
> This is a banana
>
> #출력
> banana

## 4. 단어 뒤집기 
- 첫번째 줄 입력 : 입력될 단어의 개수(자연수 N) 3<=N<=20
- 두번 줄 부터 입력 : 알파벳 단어 
- 출력 : 입력된 단어 순서대로 뒤집은 단어

- 풀이
  - 단어 배열을 차례로 for로 돌리고
  - 뒤집어서 차례로 배열에 담아
  
> #입력  
> This is a banana
>
> #출력
> banana

## 5. 특정문자만 단어뒤집기(알파벳만 순서 뒤집기)
- 첫번째 줄 입력 : 특수문자와 알파벳이 섞인 문자열 
- 출력 : 알파벳만 뒤집힌 문자열 

- 풀이
  - 단어를 char배열로 만들어 for문을 돌려
  - 알파벳들만 List에 담아준다(isAlphabet)
  - 처음에 만든 char배열을 다시 for문으로 돌리고
  - 알파벳일 경우 List의 값을 거꾸로 담아 값을 변경해준다.
  
> #입력  
> AEW#%fe%*
>
> #출력
> efW#%EA%*

## 6.중복된 문자 제거 
- 첫번째 줄 입력 : 문자열 
- 출력 : 중복이 제거된 문자열 

- 풀이
  - 문자열을 char배열로 만들어 for문을 돌려
  - StringBuffer로 담되 char하나씩 Set에 넣어
  - contains함수에 false가 나올때만 담아
  
> #입력  
> DDOOOOggg
>
> #출력
> DOg

## 7.회문 문자열(앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열) 확인
- 첫번째 줄 입력 : 문자열 
- 출력 : 회문 문자열일때 YES , 아닐때 NO
- 조건 : 대소문자 구분 없음

- 풀이
  - 문자열을 먼저 대문자로 바꿔주고 길이를 담음 변수 생성
  - char배열로 변환하여 for문을 돌려
  - for를 통해 도는 값과 
  - 처음에 길이를 담은 변수를 활용하여 거꾸로 char값을 뽑아내는 값과 비교해준다.
  

> #입력  
> dppD
>
> #출력
> YES

## 8. 팰린드롬(앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열) 
- 첫번째 줄 입력 : 문자열 
- 출력 : 팰린드롬 문자열일때 YES , 아닐때 NO
- 조건 : 대소문자 구분 없으며 알파벳 이외의 문자 무시.

- 풀이
  - 문자열 먼저 알파벳만 있는 문자열을 생성해준다
  - 생성된 문자열을 대문자로 바꿔주고 길이를 담음 변수 생성
  - char배열로 변환하여 for문을 돌려
  - for를 통해 도는 값과 
  - 처음에 길이를 담은 변수를 활용하여 거꾸로 char값을 뽑아내는 값과 비교해준다.
  

> #입력  
> dog1, seo: stue; EuTs ,oes 1God
>
> #출력
> YES

