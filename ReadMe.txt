코딩테스트 준비를 위한 자료구조 정리                2020.09.17 Update by 이현석

전반적인 알고리즘 종류
1. DFS	-> https://12bme.tistory.com/122?category=736849
2. BFS
3. 에이스타: 길찾기 알고리즘(몬스터가 플레이어까지 가장 빨리 찾아가는 길을 계산)
4. KMP: 문자열 탐색
5. 재귀: 특정함수에서 자기 자신을 다시 호출하여 동일한 루틴으로 반복적인 작업을 수행

리턴값 먼저 생각하고 역으로 풀어도 된다
간단화 시키고 시작한다. 10000문제라면 10문제로, 1000개라면 10개로
제한 조건은 모두 만족하지 않아도 된다.
배열에 값 넣어주기 전에 꼭 크기 지정해줘야함!

1. String 관련 메소드
0) String 선언
String grade=“”;
String[] s=new String[3];
-s.length(): 문자열의 크기(문자열 내에 있는 문자들의 수)를 반환한다.
-s.charAt(인수): - 인수번째의 문자를 읽어 냅니다.
예) "abcde".charAt(2)에는 'c'가 읽어 집니다. 0부터 시작하기 때문에 3번째인 'c'가 읽어 집니다.
1) 문자열 자르기
① substring
//사용법
String.substring(start) //문자열  start위치부터 끝까지 문자열 자르기
String.substring(start,end) //문자열  start위치 부터 end전까지 문자열 발췌
//예제
------String str = "ABCDEFG"; //대상 문자열
/*A=0 B=1 C=2 D=3 E=4 F=5 G=6의 index를 가진다.*/		
------str.substring(3); 
/*substring(시작위치) 결과값 = DEFG*/
------str.substring(3, 6); 
/*substring(시작위치 인덱스,끝위치 전 인덱스) 결과값 = DEF*/


2) str.indexOf(문자)
- 해당 문자가 들어있는 위치를 알려 줍니다.(문자가 없으면 -1 반환)
예) "abcde".indexOf("e")에는 4가 읽어 집니다. 0부터 시작하기 때문입니다.(lastIndexOf는 뒤에서부터 셈)






3) split-> 특정 문자, 공백, 콤마 기준으로 자를 때


4) str.charAt(인수)
- 인수번째의 문자를 읽어 냅니다.
예) "abcde".charAt(2)에는 'c'가 읽어 집니다. 0부터 시작하기 때문에 3번째인 'c'가 읽어 집니다.
문자열에 숫자로 인덱스를 지정하면 문자가 나옵니다.
String a = "abcb";
System.out.println(a.charAt(1));

5) 대소문자 변경
① 문자열 대소문자
1) 대문자로 변경
String target = "abcdefg"; //대상 문자열
target = target.toUpperCase(); //대문자로 치환
System.out.println(target); //출력


② 소문자로 변경
String target = "ABCDEFG"; //대상 문자열
target = target.toLowerCase(); //소문자로 치환
System.out.println(target); //출력

③ 대소문자 구분없이 비교(equalsIgnoreCase()메서드 활용
String target1 = "ABCDEFG"; //대상 문자열1
        String target2 = "abcdefg"; //대상 문자열2	
        if(target1.equalsIgnoreCase(target2)) {
            System.out.println("두 문자열은 서로 같습니다.");
        }else {
            System.out.println("두 문자열은 서로 다릅니다.");
        }
④ 대소문자 확인 방법
??

6) 공백제거 함수, 치환함수
① 문자열 앞 뒤 공백제거 trim
String str = " 문자열에 공백이 있습니다. ";		
System.out.println(str);
str = str.trim();
System.out.println(str);


② 문자열 중 공백 제거와 원하는 문자열로 치환하는 함수 replace(“”,“”), replaceAll(“”,“”)
ㄱ. replace예제
String str1=“aaaa”;
System.out.println(str1.replace(“aa”,“b”));
결과값: bb  -->앞에서부터 순차적으로 “aa”라는 값이 있을 경우 “b”로 치환하기 때문
String str2=“자바 코딩”;
System.out.println(“바 코”,“good”);
결과값: 자good딩

ㄴ. replaceAll예제
위 replace코딩을 replaceAll로 해도 결과는 똑같으나 차이는 한 번에 치환이 가능함.
String str3=“abcdefghijk”;
System.out.println(str3.replaceAll(“[abchij]”,“굿”));
결과값: 굿굿굿defg굿굿굿k

7) 대상 문자열이 특정문자 또는 문자열로 시작하거나 끝나는지 체크함수
String str1=“자바 코딩”;
System.out.println(str1.startsWith(“자바”);
결과값: true

8) 날짜관련 메소드

9) 토큰 구분자 --->문자열 내 토큰으로 나누어진 데이터 분할


10) 문자열 연결하기
(1) String.concat();
System.out.println("안녕".concat("하세요."));
(2) '+' 연산자
System.out.println("만나서" + " 반가워요.");
(3) StringBuilder--->StringBuild의 경우, 계속해서 문자열을 추가해도 주소 값은 바뀌지 않는다.
StringBuilder stringBuilder = new StringBuilder();
stringBuilder.append("제 직업은 ");
stringBuilder.append("웹 개발자 입니다.");
System.out.println(stringBuilder.toString());
(4) StringBuffer-->StringBuffer는 멀티쓰레드 환경에서 StringBuilder 대신 사용한다. StringBuilder의 경우 동기화를 지원하지 않기 때문이다.
StringBuffer stringBuffer = new StringBuffer();
stringBuffer.append("개발");
stringBuffer.append(" 좋아하세요?");
System.out.println(stringBuffer.toString());

2. ArrayList
리스트의 길이를 모르고, 조건이 만족하는 경우 리스트에 추가될 때 어레이 리스트로 변수를 선언한다.
예제: //가장 높은 점수를 받은 학생 list 생성, util.ArrayList,util.List모듈
//1번학생을 기준으로 잡고 차례대로 비교하여 가장 높은 점수 배정해주기
	int winner = cnt [0];
	for (int i=0;i<cnt.length;i++) {
		if(winner<cnt[i]) {
			winner=cnt[i];
		}
	}
    List<Integer> win=new ArrayList<>();
    //cnt배열과 가장 높은 점수를 비교하여 동일한 경우 win List에 추가
        for(int i=0;i<cnt.length;i++) { 
    	if(winner==cnt[i]) {
    	       win.add(i);//util.ArrayList,util.List모듈
    		}
    	}
        int[] answer= {};//츨력값, 리턴 값
    //출력값은 win List에 추가된 학생 수와 동일하도록 길이 조정
        answer=new int [win.size()];
	//출력할 배열 answer에 List에 있는 학생번호 입력
	for(int i=0;i<win.size();i++) {
		answer[i]=win.get(i)+1;
	}
1) 어레이 리스트 선언, 크기 및 값 추가
-List<Integer> win=new ArrayList<>();
List<String> win=new ArrayList<>();
자료형 모르면 <>안에 아무것도 안써도 됨.

2) 원하는 위치에 값 삽입
int index=listA.indexOf("홍길동"); //위치값 찾기
listA.add(index,"홍길동 앞에 값 추가");

3) 값 삭제하는 방법
System.out.println(listA.remove(3)); //인덱스 위치 값 삭제
System.out.println(listA.remove("홍길동"));

3. Array
1) 자바 배열 선언
① int dum1=new int[x] ->x는 크기, 꼭 지정해주어야함.
② int [] array = new int[]{1,2,3,4,5};
③ int [] arr={1,2,3,4,5}
2) 자바 2차원 배열 길이 구하기.
arr [2][3];
배열의 이름이 arr 이라고 하면
arr.length = 2 //행길이
arr[0].length = 3 //열길이

3) 배열복사
Arrays.copyOf(array, int newlength) :
배열을 복사한다. 파라미터로는 복사하고자 하는 배열과 새로운 배열의 크기가 들어간다.
int[] arr2 = Arrays.copyOfRange(arr1, 2, 4);
copyOfRange() 메소드는 전달받은 배열의 특정 범위에 해당하는 요소만을 새로운 배열로 복사하여 반환합니다. 3번째에서 4번째까지 [4]바로 전까지 반환


3.5 Vector
동적인 길이로 여러 데이터형을 저장하는 자료구조
1) 선언
Vector<Integer> v1=new Vector<Integer>(5);//크기가 5인 Integer 타입 Vector v1을 선언
2) 요소추가
v1.addElement(1);
v1.addElement(2);
v1.addElement(3);
3) 크기
v1.size();//벡터의 크기
4) 용량
v1.capacity//v1의 용량
5) 크기 줄이기
v1.setSize(2)//v1의 크기를 5에서 2로 줄인다. 이렇게 하면 0번째 1번째 이렇게 두 개의 인덱스만 남는다.
 ArrayList에는 setSize함수가 없다.

4. Sort
1) 오름차순 정렬
import java.util.Arrays;
public class as {
public static void main(String args[]) {
	String[] s={"맹구","배용준","땡칠이","장동건","강수정","송창식"};
	double[] num= {-1000,0.01,8,634,2349,2.3,0.00004,-2327};
	Arrays.sort(s);
	Arrays.sort(num);
	System.out.println(Arrays.toString(s)); 
	System.out.println(Arrays.toString(num));
//Arrays.toString 안하면 그냥 인덱스 주소찍힘
	}
}

5. HashMap -> 키, 값 쌍형식
0) 예제
import java.util.Map;
import java.util.HashMap;
public class conditionstate {
	public static void main(String[] args) {
		Map<String,Integer> subject = new HashMap<String,Integer>();
		subject.put("Java",100);
		subject.put("C",90);---------------------------------------
		int javaSubject=subject.get("Java");
		int cSubject=subject.get("C");
		System.out.println("자바점수: " + javaSubject);
		System.out.println("C점수: " + cSubject);


6. Stack-> 후입선출 자료구조 이전방문기록, 다음 방문기록 등에 쓰임
import java.util.Stack;
int[] arr={1,2,3,4,5}
1) 객체 생성
Stack<Integer> st=new Stack<>();
2) 요소추가 //배열 arr의 엘리먼트들이 st안에 순서대로 들어감
for(int i=0;i<arr.length;i++){
	st.push(arr[i]);
	}
st.size() //스택 길이
3) pop은 값 반환과 동시에 요소가 제거됨. 그리고 길이 짧아짐
st.pop() //5
st.pop() //4 ...

4) 요소 반환은 peek() 즉, 가장 최근에 넣은 값 cf)pop을 하면 제거될 값임
//그냥 반환만 해줌
st.peek() //3

7. Queue->선입선출 자료구조, 프린터 등에 쓰임.
1) 객체 생성 및 길이
Queue<String> queue = new LinkedList<String>();
길이 : queue.size()
2) 요소추가
queue.add("빨강");
queue.add("파랑");
queue.add("노랑");
3) 요소접근 및 반환 queue.poll-> 엘리먼트 반환하고 그 엘리먼트 나감-> 길이 줄어듦
queue.poll(); //빨강
queue.poll(); //파랑
queue.poll(); //노랑
4) 전체 반환 와일문
while(queue.size()>0) {
	System.out.println(queue.poll());
}
5) 요소 반환하지 않고 확인만
peek()

8. Deck




9. linkedlist

10. LinkedHashMap, TreeMap, HashMap의 차이점




10.5 LinkedList
ArrayList는 탐색에서 빠르고 LinkedList는 삽입과 삭제에서 빠르다.

11. Tree

12. 페이지 교체 알고리즘
1) FIFO

2) OPT(Optimal Page Replacement)

3) LRU(Least Recently Used)

4) LFU(Least Frequently Used)

5) MFU(Most Frequently Used)





13. 형변환
1) 값이 소수,분수 일때, 정수화
int starty= (int) odd/2;

2) 문자열에서 정수로의 형변환
String numbers=“123456”;
int n=Integer.parseInt(numbers);

3) 정수에서 문자열로의 형변한
int i = 1234;
String s = String.valueOf(i);  문자열 "1234"로 변환
String s = Integer.toString(i);  문자열 "1234"로 변환 
String s = ””+i; 문자열 "1234"로 변환 
String s = “”+12.34; 문자열 "12.34"로 변환 
String s = “”+0; 문자열 "0"로 변환


14. 스위치 케이스문->무조건 break있어야지 다음으로 안넘어감
public static void main(String[] args) {
		int elevator=5;
		String place="";
	switch (elevator) {
		case 1 : place="약국";
			break;
		case 2 : place="정형외과";
			break;
		case 3 : place="피부과";
			break;
		case 4 : place="치과";
			break;
		default: place="헬스클럽";
	}
		System.out.println(place);
}

**기타**
1) 메소드의 앞에 있는 자료형은 리턴값의 자료형과 같아야한다.
2) 수학적 표현 방법
int maxScore = Math.max(score[0], Math.max(score[1], score[2]));
c = Math.sqrt(a * a + b * b);
int xs=Math.abs(row-x);
Math메소드 안에 절댓값, 루트, 등등 다양
3) 함수 출력 방법: 클래스.메소드(파라미터)
4) 배열 주소값 안나오게 하려면
System.out.println(Arrays.toString(supo1));
5) 메소드 내 파라미터 사용법
this는 인스턴스의 자기 자신을 의미한다. this.은 주로 필드(전역변수)와 메소드 또는 생성자의 매개변수가 동일할 때 인스턴스 필드임을 명확히 하기 위해 사용한다.
---이 tray는 지금 메소드(Hanoi)의 파라미터인 tray값이 아니라 클래스의 필드인 tray다--
public class Hanoi {
	private int tray=3;
	private int bar=3;
	int[][] rings;
//접시 수를 변경하고 접시의 크기를 표현하기 위해 2차원 배열에 1,3,5를 대입하는 생성자
	public Hanoi(int tray) {//파라미터 넘겨받기
		//this.tray=tray;
		rings=new int[tray][bar];

6) 프린트 메소드 저장(배열 출력 메소드)
	public static void print(int[] n) {
	      for(int i=0;i<n.length;i++) {
	         System.out.print(n[i]+" ");
	      }
	      System.out.println();
	   }
7) 삼항 연산자
“n은 10보다 크다”라는 표현식은 n>10이라고 표현하는데 >연산자에서 왼쪽 오른쪽 두 개 항이 있기 때문에 보통 2항 연산자라고 부른다.
“n이 10보다 크면 11이고 아니면 9이다”라는 표현식은 n>10?11:9 과 같이 3개의 항으로 연산.
8) boolean 메소드는 반환값을 return false가 편할지 return true가 편할지 생각하고 코딩.
9) Array와 ArrayList의 차이
1)Array
-사이즈: 초기화 시 고정
int[] myArray = new int[6];
-속도: 초기화시 메모리에 할당되어 속도가 빠름.
-사이즈변경 불가
-다차원 가능
int[][][] muttiArray = new int [3][3][3];
2) ArrayList
-초기화시 사이즈를 표시하지 않음. 유동적
List<Integer> myArrayList = new ArrayList<>();
-추가 삭제 가능
add(), remove() 로 가능
-다차원 불가능.

DB
select [DISTINCT] 컬럼명 [ALIAS명]
from 테이블명
where 조건식
group by 컬렴이나 표현식
having 그룹조건식
order by

Group by
용도 : 일반적으로 특정 그룹(포지션별, 팀별)별 데이터를 필요로 할 경우에 GROUP BY절을  그룹함수와 함께 이용한다.
Having
그룹함수를 사용해 GROUP BY절을 사용할 때 그룹들에 대한 제한 조건이 필요하여 사용하는, 그룹에 대한 조건절

상위 n개 레코드
MySQL의 경우 : NAME 값을 조회하는데 가장 맨 위 행 1개만을 조회하기 위해 LIMIT 구문을 사용해야 합니다.
LIMIT 1 : 맨 위에서부터 1개까지의 정보 조회
LIMIT 3 : 맨 위에서부터 3개까지의 정보 조회
LIMIT 2, 6 : 위에서 2번째부터 6번째까지의 정보 조회
SELECT NAME
FROM ANIMAL_INS
ORDER BY DATETIME//datetime을 기준으로 오름차순으로 정렬한 것 중에
LIMIT 1//제일 위에 있는 것을 조회해야 제일 오래된 동물 골라짐ㅇㅇ

ORACLE DB의 경우 : rownum 을 활용하면 가장 첫 번째 행의 데이터를 가져올 수 있습니다.
SELECT NAME
FROM (SELECT * FROM ANIMAL_INS ORDER BY DATETIME)
WHERE rownum = 1;

1. sql null값 처리


2. Join 정리
두 개 이상의 테이블을 하나 이상의 조건을 걸어서 해당된 조건을 가진 값들을 하나의 ROW로 가져오는 것
1)RIGHT OUTER JOIN
오른쪽 테이블은 무조건 조회되며 왼쪽 테이블에 조건이 맞는 것이 있다면 같이 보여줌
2)LEFT OUTER JOIN
왼쪽 테이블은 무조건 조회되며 오른쪽 테이블에 조건이 맞는 것이 있다면 같이 보여줌
SELECT b.ANIMAL_ID, b.name
from ANIMAL_INS a right outer join ANIMAL_OUTS b//alias
on a.ANIMAL_ID=b.ANIMAL_ID// 무엇을 기준으로 조인할지 on뒤에 적는다.
where a.ANIMAL_ID is null
order by b.ANIMAL_ID;
