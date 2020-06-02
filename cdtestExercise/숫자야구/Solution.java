package 숫자야구;

public class Solution {
    public int solution(int[][] baseball) {
        String[] tempans=new String[3];
        String[] realans=new String[3];
        int answer = 0;
        int out;
        for(int i=0;i<baseball.length;i++){
            String quest=String.valueOf(baseball[i][0]);
            
            int strike=baseball[i][1];
            int ball=baseball[i][2];
            if(strike==3) {
            	answer++;
            }else if(strike==2 && ball==0) { //2스트라이크면 1볼일수는 없음, 무조건 0볼
            	
            }
        }
    	
		return answer;
    }
}
