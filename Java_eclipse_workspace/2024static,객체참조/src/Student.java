
public class Student {
	private static int serialNum=1000;//����ƽ ������ Ŭ���� ������� �ϴµ�  �̴� �ν��Ͻ�����
	int studentID;					 //�����Ǵ� ������ �ƴ϶�, Ŭ������ ���� �ѹ��� �����ȴ� �����̰� �̸� ���� �ν��Ͻ��� �����ϱ� �����̴�.
	String studentName;				 //static ������ ���� Ŭ�������� ������ �ν��Ͻ����� �������� ������ �� �����Ƿ�
	int grade;						 //�ν��Ͻ����� �������� ����� ���� �ִ� ��� static ������ ����Ѵ�.+
	String address;
	int cardNum;
	
	Student() {
		//�л��� ������ �� ����
		serialNum++;
		//������ ���� �й� �ν��Ͻ��� �ο�
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
