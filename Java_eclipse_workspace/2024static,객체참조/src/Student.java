
public class Student {
	private static int serialNum=1000;//스태틱 변수는 클래스 변수라고 하는데  이는 인스턴스마다
	int studentID;					 //생성되는 변수가 아니라, 클래스에 속해 한번만 생성된는 변수이고 이를 여러 인스턴스가 공유하기 때문이다.
	String studentName;				 //static 변수는 같은 클래스에서 생성된 인스턴스들이 같은값을 공유할 수 있으므로
	int grade;						 //인스턴스간에 공통으로 사용할 값이 있는 경우 static 변수를 사용한다.+
	String address;
	int cardNum;
	
	Student() {
		//학생이 생성될 때 증가
		serialNum++;
		//증가된 값을 학번 인스턴스에 부여
		studentID= serialNum;
		cardNum=studentID+100;
	}



	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	
}
