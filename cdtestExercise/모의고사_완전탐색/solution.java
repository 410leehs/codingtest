package ���ǰ��_����Ž��;


//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;

import JavaEx.OddMagicSquare;

import java.util.*;
class solution{
	public int[] test(int[] answers) {
		//�����ڵ��� ���
		int[] st1= {1,2,3,4,5};
		int[] st2= {2,1,2,3,2,4,2,5};
		int[] st3= {3,3,1,1,2,2,4,4,5,5};
		
		int[] cnt=new int[3];// 3���� �л��̹Ƿ� ������ üũ�ϱ� ���� ũ�Ⱑ 3�� �迭 ����
		
		//����� ���� ���� ���Ͽ� ������ ��� cnt++
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
		//1���л��� �������� ��� ���ʴ�� ���Ͽ� ���� ���� ���� Ȯ���ϱ�
		int winner = cnt [0];
		for (int i=0;i<cnt.length;i++) {
			if(winner<cnt[i]) {
				winner=cnt[i];
			}
		}
		
		List<Integer> win=new ArrayList<>();//���� ���� ������ ���� �л� list ����, util.ArrayList,util.List���
											//���̰� 1���� 2���� 3���� �𸣴ϱ� ��� ����Ʈ�� ����
		
		for(int i=0;i<cnt.length;i++) { //cnt�迭�� ���� ���� ������ ���Ͽ� ������ ��� win List�� �߰�
			if(winner==cnt[i]) {
				win.add(i);//util.ArrayList,util.List���
			}
		}
		int[] answer= {};//���°�, ���� ��
		answer=new int [win.size()];//��°��� win List�� �߰��� �л� ���� �����ϵ��� ���� ����
		
		//����� �迭 answer�� List�� �ִ� �л���ȣ �Է�
		for(int i=0;i<win.size();i++) {
			answer[i]=win.get(i)+1;
		}
		return answer;
	}


}
