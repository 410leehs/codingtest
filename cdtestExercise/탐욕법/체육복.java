package Ž���;

import java.util.ArrayList;
import java.util.List;

public class ü���� {
    public static void solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[][] entire= new int[n][2];
        int k=lost.length;
        int m=reserve.length;
        
        for(int i=1;i<=n;i++) {
        	entire[0][i-1]=i;
        	entire[1][i-1]=1;
        }
        for(int j=1;j<=k;j++) {			//�Ȱ��� �¾ֵ�
        	entire[1][lost[j-1]-1]=0;
        }
        for(int l=1;l<=m;l++) {
        	entire[1][reserve[l-1]-1]=2;//���������¾ֵ�
        }
        for(int i=1;i<=n-1;i++) {
        	if(entire[1][i-1]==0 & entire[1][i]==2) {
        		entire[1][i-1]=1;
        		entire[1][i]=1;
        	}
//        	if(entire[1][i-2]==2 & entire[1][i-1]==0) {
//        		entire[1][i-2]=1;
//        		entire[1][i-1]=1;
//        	}

        }
    	if(entire[1][n-1]==2 & entire[1][n-2]==0) { //������ ��ȣ
    		entire[1][n-2]=1;
    		entire[1][n-1]=1;
    	}
    	
        List<Integer> mobum=new ArrayList<>();
        for(int i=1;i<=n;i++) {
        	if(entire[1][i-1]==1) {
        		mobum.add(i);
        	}
        }
        answer=mobum.size();
        
        System.out.println(answer);
    }
    public static void main(String[] args) {
    	int[] lost= {2,4};
    	int[] reserve= {3};
    	ü����.solution(5, lost, reserve);
    }
}
