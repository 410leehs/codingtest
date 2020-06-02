package 모의고사_완전탐색;


//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;

import JavaEx.OddMagicSquare;

import java.util.*;
class solution{
	public int[] test(int[] answers) {
		//수포자들의 찍기
		int[] st1= {1,2,3,4,5};
		int[] st2= {2,1,2,3,2,4,2,5};
		int[] st3= {3,3,1,1,2,2,4,4,5,5};
		
		int[] cnt=new int[3];// 3명의 학생이므로 정답을 체크하기 위해 크기가 3인 배열 생성
		
		//정답과 찍은 답을 비교하여 동인한 경우 cnt++
		for(int i=0;i<answers.length;i++) {
			if(answers[i]==st1[i%5]) {
				cnt[0]++;
			}
			if(answers[i]==st2[i%8]) {
				cnt[1]++;
			}
			if(answers[i]==st3[i%10]) {
				cnt[2]++;
			}
		}
		//1번학생을 기준으로 잡고 차례대로 비교하여 가장 높은 점수 확인하기
		int winner = cnt [0];
		for (int i=0;i<cnt.length;i++) {
			if(winner<cnt[i]) {
				winner=cnt[i];
			}
		}
		
		List<Integer> win=new ArrayList<>();//가장 높은 점수를 받은 학생 list 생성, util.ArrayList,util.List모듈
											//길이가 1일지 2일지 3일지 모르니깐 어레이 리스트로 선언
		
		for(int i=0;i<cnt.length;i++) { //cnt배열과 가장 높은 점수를 비교하여 동일한 경우 win List에 추가
			if(winner==cnt[i]) {
				win.add(i);//util.ArrayList,util.List모듈
			}
		}
		int[] answer= {};//츨력값, 리턴 값
		answer=new int [win.size()];//출력값은 win List에 추가된 학생 수와 동일하도록 길이 조정
		
		//출력할 배열 answer에 List에 있는 학생번호 입력
		for(int i=0;i<win.size();i++) {
			answer[i]=win.get(i)+1;
		}
		return answer;
	}


}
