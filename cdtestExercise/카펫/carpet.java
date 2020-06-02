package 카펫;

import java.util.ArrayList;
import java.util.List;

public class carpet {
    public static void solution(int brown, int yellow) {
        int[] answer= {};
        answer=new int[2];
        
        int p;//가로
        int v;//세로
        int sum=brown/2+2;//가로+세로
        int multi=yellow+2*sum-4;//가로*세로
        
        //answer= {p,v};
        
        //int candidate= {};
        
        //int[] candidate= {};
        for(int i=1;i<=Math.sqrt(multi);i++) {//i는 가로
        	int k=multi%i;//나머지
        	int l=multi/i;//몫
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
