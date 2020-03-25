package 오라이;

import java.util.ArrayList;

public class 어레이 {

	public static void main(String[] args) {

	ArrayList<Integer> scores=new ArrayList<Integer>();
		scores.add(100);
		scores.add(90);
		scores.add(97);
		scores.add(93);
		System.out.println(scores);
		scores.remove(0);
		scores.remove(1);
		//scores.remove(2);
		//scores.remove(3);
		System.out.println(scores);
	}

}
