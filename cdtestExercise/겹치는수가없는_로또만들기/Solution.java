package 겹치는수가없는_로또만들기;
import java.util.Random;
import java.util.Arrays;
public class Solution {
	public static void main(String[] args) {
		int[] array=new int[6];
		Random rd = new Random();
		
		
		int count=6;
		for(int i=0;i<count;i++) {
			array[i]=(int)(Math.random()*45)+1;//import java.util.Random;
		
		for(int j=0;j<i;j++) {
			if(array[i]==array[j]) {
				i--;
				break;
			}
		}
			
		}
		
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
	}
}
