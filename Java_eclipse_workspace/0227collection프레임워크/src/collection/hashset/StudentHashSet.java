package collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

//import collection.hashset.Student;

public class StudentHashSet {
	private HashSet<Student> hashset1;
	
	public StudentHashSet() {
		hashset1 = new HashSet<Student>();
	}
	public void addStudent(Student student) {
		hashset1.add(student);
	}
	public void showAllStudent() {
		for(Student student : hashset1) {
			System.out.println(student);
		}
		System.out.println();
	}
	public boolean removeStudent(int studentScore) {
		   Iterator <Student> ir = hashset1.iterator();
		   while(ir.hasNext()){
		      Student student = ir.next();
		      int tempId = student.getStudentScore();
		      if(tempId == studentScore) {
		         hashset1.remove(student);
		         return true;
		      }
		   }
		   System.out.println(studentScore + "가 존재하지 않습니다.");
		   return false;
		   }
}
