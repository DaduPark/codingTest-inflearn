# String(문자열)
---
## 만든 메소드
- boolean isLowerCase(char c) [Test2](https://github.com/DaduPark/codingTest-inflearn/blob/master/src/section1_String/Test2.java)
    - 기능 : 소문자 확인
    - 요청 : char
    - 응답 : boolean
    - 대체 : Character.isLowerCase() 함수 사용
 
- String getReverseString(String str) [Test4](https://github.com/DaduPark/codingTest-inflearn/blob/master/src/section1_String/Test4.java)
    - 기능 : 단어 뒤집어줌
    - 요청 : String
    - 응답 : String
    - 대체 : 
    ```
    StringBuffer sb = new StringBuffer(str);
    String reversedStr = sb.reverse().toString();
    ```
    
    ```
     char[] c = word.toCharArray();
            int frontN  = 0;
            int backN   = word.length() -1;

            while ( frontN < backN ){
                char temp = c[frontN];
                c[frontN] = c[backN];
                c[backN] = temp;
                frontN++;
                backN--;
            }
      ```
- boolean isAlphabet(char c) [Test5](https://github.com/DaduPark/codingTest-inflearn/blob/master/src/section1_String/Test5.java)
    - 기능 : 알파벳여부 확인 
    - 요청 : char
    - 응답 : boolean
    - 대체 : Character.isAlphabetic();

- String getAlphabetStr(String str) [Test8](https://github.com/DaduPark/codingTest-inflearn/blob/master/src/section1_String/Test8.java)
    - 기능 : 문자열을 알파벳만 포함된 문자열로 반환 (내부에서 isAlphabet호출)
    - 요청 : 문자열 String
    - 응답 : 알파벳문자열 STringß
    - 대체 : str.replaceAll("[^a-zA-Z]", "");


## 지식
 - contains 함수 사용 시 
   - ArrayLis보다 HashSet를 통해 사용해야 성능이 더 좋다.
 - str.indexOf(char) : 가장먼저 char값이 나오는 순서 return
 - for문 반만 돌아도 되는 경우 조건에 i<str.length 로 
--- 

## 1.문자 찾기[Test1](https://github.com/DaduPark/codingTest-inflearn/blob/master/src/section1_String/Test1.java)
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

## 2.대소문자 변환[Test2](https://github.com/DaduPark/codingTest-inflearn/blob/master/src/section1_String/Test2.java)
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

## 3.가장 긴 문자 추출 [Test3](https://github.com/DaduPark/codingTest-inflearn/blob/master/src/section1_String/Test3.java)
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

## 4. 단어 뒤집기 [Test4](https://github.com/DaduPark/codingTest-inflearn/blob/master/src/section1_String/Test4.java)
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

## 5. 특정문자만 단어뒤집기(알파벳만 순서 뒤집기) [Test5](https://github.com/DaduPark/codingTest-inflearn/blob/master/src/section1_String/Test5.java)
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

## 6.중복된 문자 제거 [Test6](https://github.com/DaduPark/codingTest-inflearn/blob/master/src/section1_String/Test6.java)
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

## 7.회문 문자열(앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열) 확인 [Test7](https://github.com/DaduPark/codingTest-inflearn/blob/master/src/section1_String/Test7.java)
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

## 8. 팰린드롬(앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열) [Test8](https://github.com/DaduPark/codingTest-inflearn/blob/master/src/section1_String/Test8.java)
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


## 9. 숫자만 추출 [Test9](https://github.com/DaduPark/codingTest-inflearn/blob/master/src/section1_String/Test9.java)
- 첫번째 줄 입력 : 문자열 
- 출력 : 자연수 

- 풀이
  - 정규식을 사용하여 숫자만 추출 
  - Strin을 int로 변환 
  

> #입력  
> asdf012asdf3
>
> #출력
> 123

## 10. 가장 짧은 문자거리 [Test10](https://github.com/DaduPark/codingTest-inflearn/blob/master/src/section1_String/Test10.java)
- 첫번째 줄 입력 : 문자열과 문자 
- 출력 : 문자열의 각 문자가 문자와 떨어진 거리를 순서대로 출력
- 조건 : 입력의 문자열은 소문자로만 이루어져있으며 100자를 넘기지 않는다.

- 풀이
  - 문자열의 문자들을 위치한 순서로 위치시켜 주어진 문자의 순서들과의 차이가 적은 값을 나열해준다.
  - ex) 
  
  ```
  teachermode에서 e는 1,5,10번째에 존재
  t=>0번째이므로 1,5,10중 1과 1차이로 가장 적게 차이남=> 1
  e=>1번째이므로 1,5,10중 1과 0차이로 가장 적게 차이남=> 0
  a=>2번째이므로 1,5,10중 1과 1차이로 가장 적게 차이남=> 1
  c=>3번째이므로 1,5,10중 1,5와 2차이로 가장 적게 차이남=> 2
  h=>4번째이므로 1,5,10중 5와 1차이로 가장 적게 차이남=> 1 
  ...
  ```
  
  - 문자열에서 주어진 문자와 같은 문자가 있는 순서를 추출(t**e**ach**e**rmod**e**에서는 1,5,10)하여 List에 담아준다.
  - 문자열을 for문을 돌려 한 문자당 리스트에 담겨져있는 주어진 문자와의 차이중 제일 작은 값들을 추출해준다.(최소값의 초기값은 조건이였던 100자리를 기준으로 잡아준다.)
  - 차이값이 커지면 그 이상 비교를 안해도 되므로 break.
  

> #입력  
> teachermode e
>
> #출력
> 1 0 1 2 1 0 1 2 2 1 0


## 11. 문자열 압축 [Test11](https://github.com/DaduPark/codingTest-inflearn/blob/master/src/section1_String/Test11.java)
- 설명 : 대문자로 이루어진 문자열에서 반복적으로 나타나는 문자의 바로 오른쪽에 숫자로 표시. 단, 1개는 생략 
- 첫번째 줄 입력 : 대문자로 이루어진 문자열 
- 출력 : 문자의 반복개수가 적혀있는 문자열 

- 풀이
  - 이전문자열을 저장해줄 변수(초기값은 입력에 제외된 소문자로 셋팅)와 반복적인 문자의 개수를 담아줄 int변수를 생성
  - 문자열을 for문을 돌리되 이전문자와 같으면 반복문자의 개수를 증가시켜주고
  -  다를 경우 문자열의 반복개수를 표시(1보다 클때), 문자의 개수를 담는 변수는 1로 초기화해주고 문자를 표시해준다.
  

> #입력  
> AATESSSE
>
> #출력
> A2TES3E

> #입력2
> AATESSSEE
>
> #출력2
> A2TES3E2

## 12. 암호  [Test12](https://github.com/DaduPark/codingTest-inflearn/blob/master/src/section1_String/Test12.java)
- 설명 : 문자열을 7개씩 끊어 문자열을 #->1, *->0로 변환하여 2진수를 10진수로 변환하여 문자로 치환하여 암호된 문자열을 복호화해준다.
- 첫번째 줄 입력 :문자열의 개수와 #*으로 이루어진 문자열 
- 출력 : 복호화된 문자열 

- 풀이
  - 문자열을 7개씩 끊어서 (substring으로 끊어줌)
  - #->1, *->0로 치환하고 치환된 2진수를 10진수로 변환하여 char값으로 변
  

> #입력  
> 4
> #****###**#####**#####**##** 

> #출력
> COOL

