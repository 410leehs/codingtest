public class staticTest {
	 public static void main(String[] args) {
		 Student studentYeon=new Student();
		 studentYeon.studentName="연주미";
		 System.out.println(studentYeon.studentName);
		 System.out.println(studentYeon.studentName+"학번"+studentYeon.studentID);
		 System.out.println(studentYeon.studentName+"카드번호"+studentYeon.cardNum);
		 
		 
		 Student studentLee=new Student();
		 studentLee.setStudentName("이지안");
		 //System.out.println(Student.serialNum);
		 System.out.println(studentLee.studentName+"학번"+studentLee.studentID);
		 System.out.println(studentLee.studentName+"카드번호"+studentLee.cardNum);
	 }
}
