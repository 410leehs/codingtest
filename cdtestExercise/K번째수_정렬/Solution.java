package K번째수_정렬;
import java.util.*;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
 	    int[] answer = new int[commands.length];// 답은 커맨드의 행길이 만큼의 길이이다.

        for(int i=0; i<commands.length; i++){
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);//array의 요소중 commands[i][0]-1부터
            Arrays.sort(temp);				//정렬한다									//	commands[i][1]까지 불러온다
            answer[i] = temp[commands[i][2]-1];//command의 i번째행의 3번째 숫자(k)이다.그것을 answer배열에 추가한다.
        }
        return answer;
    }
    
}