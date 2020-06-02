package 탐욕법;

import java.util.ArrayList;
import java.util.List;

public class 체육복 {
    public static void solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[][] entire= new int[n][2];
        int k=lost.length;
        int m=reserve.length;
        
        for(int i=1;i<=n;i++) {
        	entire[0][i-1]=i;
        	entire[1][i-1]=1;
        }
        for(int j=1;j<=k;j++) {			//안가져 온애들
        	entire[1][lost[j-1]-1]=0;
        }
        for(int l=1;l<=m;l++) {
        	entire[1][reserve[l-1]-1]=2;//여벌가져온애들
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
    	if(entire[1][n-1]==2 & entire[1][n-2]==0) { //마지막 번호
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
    	체육복.solution(5, lost, reserve);
    }
}
