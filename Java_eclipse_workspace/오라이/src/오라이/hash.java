package 오라이;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class hash {
	public static void main (String[] args) {
		int[] study = new int[4];
		//배열
		study[0]=100;
		study[1]=90;
		study[2]=80;
		study[3]=70;
		int GPA = (study[0]+study[1]+study[2]+study[3])/4;
		System.out.println(study[0]);
		System.out.println("평균: " + GPA);
		
		//List
		ArrayList<Integer> scores=new ArrayList<Integer>();
		scores.add(87);
		scores.add(92);
		scores.add(95);
		scores.add(93);
		//System.out.println(scores);
		int GPA1 = (scores.get(0)+scores.get(1)+scores.get(2)+scores.get(3))/4;
		System.out.println("평균: " + GPA1);
		
		//Map
		Map<String,Integer> subject = new HashMap<String,Integer>();
		subject.put("Java",100);
		subject.put("C",90);
		subject.put("C#",10);
		subject.put("Python",50);
		int javaSubject=subject.get("Java");
		System.out.println("자바점수: " + javaSubject);
	}
}