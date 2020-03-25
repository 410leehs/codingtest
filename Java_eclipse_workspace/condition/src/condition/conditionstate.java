package condition;


import java.util.Map;

import java.util.HashMap;

public class conditionstate {
	public static void main(String[] args) {
		Map<String,Integer> subject = new HashMap<String,Integer>();
		subject.put("Java",100);
		subject.put("C",90);
		subject.put("C#",10);
		subject.put("Python",50);
		int javaSubject=subject.get("Java");

		System.out.println("자바점수: " + javaSubject);
		
		
		String grade="";
		if(javaSubject>=95) {
			grade = "A+";
		}
		else if (95>javaSubject && 90<=javaSubject) {
			grade = "A";
		}
		else if (90>javaSubject && 85<=javaSubject) {
			grade = "B+";
		}
		else if (85>javaSubject && 80<=javaSubject) {
			grade = "B";
		}
		else if (80>javaSubject && 70<=javaSubject) {
			grade = "C";
		}
		else if (70>javaSubject && 60<=javaSubject) {
			grade = "D";
		}
		else {
			grade="F";
		
		}
		
		System.out.println("학점:"+grade);
	}
	
}
