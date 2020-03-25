package collection.hashset;

import collection.Member;

public class Student {
	private int studentScore;
	private String studentName;
	
	public Student(int studentScore,String studentName) {//»ý¼ºÀÚ
		this.studentScore =studentScore;
		this.studentName =studentName;
	}
	public int getStudentScore() {
		return studentScore;
	}
	public void setStudentScore(int studentScore) {
		this.studentScore = studentScore;
	}
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String toString() {
		return studentScore+":"+ studentName;
	}
	public int hashCode() {
		return studentScore;
}
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student student = (Student)obj;
			if(this.studentScore == student.studentScore) return true;
			else return false;
		}
		return false;
	}
}