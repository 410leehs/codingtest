package ����ITnE����;

public class map {
	public int maps(int[][] maps) {
		int answer=0;
		int r=maps.length;//�����
		int c=maps[0].length;//������
		
		//������
		for(int i=0;i<r;i++) {//��
			for(int j=0; j<=c;j++) {//��
				if(j==0) {//0��° []����
					if(maps[i][j]==1)// �ε����� 1�̶��
						answer++;	//answer +1
				}else if(j==c) {//c��°, �� ������ []����
					if(maps[i][j-1]==1)// ������ �ε����� 1�̶��
						answer++;	//answer +1
            	}else if(maps[i][j-1]!=maps[i][j]){ //������ �ε����� ���� �ٸ��ٸ�
            		answer++;
            	}
			}
		}
		//�����
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
