package K��°��_����;
import java.util.*;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
 	    int[] answer = new int[commands.length];// ���� Ŀ�ǵ��� ����� ��ŭ�� �����̴�.

        for(int i=0; i<commands.length; i++){
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);//array�� ����� commands[i][0]-1����
            Arrays.sort(temp);				//�����Ѵ�									//	commands[i][1]���� �ҷ��´�
            answer[i] = temp[commands[i][2]-1];//command�� i��°���� 3��° ����(k)�̴�.�װ��� answer�迭�� �߰��Ѵ�.
        }
        return answer;
    }
    
}