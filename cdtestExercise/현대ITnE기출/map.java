package 현대ITnE기출;

public class map {
	public int maps(int[][] maps) {
		int answer=0;
		int r=maps.length;//행길이
		int c=maps[0].length;//열길이
		
		//열먼저
		for(int i=0;i<r;i++) {//행
			for(int j=0; j<=c;j++) {//열
				if(j==0) {//0번째 []에서
					if(maps[i][j]==1)// 인덱스가 1이라면
						answer++;	//answer +1
				}else if(j==c) {//c번째, 즉 마지막 []에서
					if(maps[i][j-1]==1)// 마지막 인덱스가 1이라면
						answer++;	//answer +1
            	}else if(maps[i][j-1]!=maps[i][j]){ //인접한 인덱스가 서로 다르다면
            		answer++;
            	}
			}
		}
		//행먼저
		for(int j=0; j<c; j++){
            for(int i=0; i<=r; i++){
                 if(i==0){
                    if(maps[i][j]==1)
                        answer++;
                }else if(i==r){
                    if(maps[i-1][j]==1)
                        answer++;
                }else if(maps[i-1][j]!=maps[i][j]){
                    answer++;
                }
            }
        }
		
		
		return answer;
	}
}
