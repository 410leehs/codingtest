class BirthDay{
	int day;
	int month;
	int year;
	public void setYear(int year1) {//�¾ ������ �����ϴ� �޼ҵ�
		this.year=year1;
	}
	public void printThis() {
		System.out.println(this);//this ���
	}
}
public class ThisExample {

	public static void main(String[] args) {//void main()�Լ��� �� Ŭ������ ������ �̸����� �ؾ��Ѵ�
		BirthDay bDay= new BirthDay();		//�̶� publicŬ������ �ϳ���.
		bDay.setYear(2000);		//�⵵�� 2000���� ����
		System.out.println(bDay);//���������� ���
		bDay.printThis();		// this��� �޼ҵ带 ȣ��

	}

}
//��°��� ����. ��, ���� ���� �ٶ󺸴� ���̴�.