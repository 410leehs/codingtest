public class staticTest {
	 public static void main(String[] args) {
		 Student studentYeon=new Student();
		 studentYeon.studentName="���ֹ�";
		 System.out.println(studentYeon.studentName);
		 System.out.println(studentYeon.studentName+"�й�"+studentYeon.studentID);
		 System.out.println(studentYeon.studentName+"ī���ȣ"+studentYeon.cardNum);
		 
		 
		 Student studentLee=new Student();
		 studentLee.setStudentName("������");
		 //System.out.println(Student.serialNum);
		 System.out.println(studentLee.studentName+"�й�"+studentLee.studentID);
		 System.out.println(studentLee.studentName+"ī���ȣ"+studentLee.cardNum);
	 }
}
