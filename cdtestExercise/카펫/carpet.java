package ī��;

import java.util.ArrayList;
import java.util.List;

public class carpet {
    public static void solution(int brown, int yellow) {
        int[] answer= {};
        answer=new int[2];
        
        int p;//����
        int v;//����
        int sum=brown/2+2;//����+����
        int multi=yellow+2*sum-4;//����*����
        
        //answer= {p,v};
        
        //int candidate= {};
        
        //int[] candidate= {};
        for(int i=1;i<=Math.sqrt(multi);i++) {//i�� ����
        	int k=multi%i;//������
        	int l=multi/i;//��
        	if(k==0 & i+l==sum) {
        		answer[0]=l;
        		answer[1]=i;
        	}
        	
        }
        
        //answer=new int[candidate.size()];

		for(int i=0;i<=answer.length;i++) {
			System.out.print(answer[i]+" ");
		}
        //return answer;
    }

    public static void main(String[] args) {
    	carpet.solution(8,1);
    }
}
