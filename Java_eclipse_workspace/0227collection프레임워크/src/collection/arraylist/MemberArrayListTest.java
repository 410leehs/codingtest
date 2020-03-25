package collection.arraylist;
import java.io.IOException;
import collection.Member;
public class MemberArrayListTest {
	public static void main(String[] args) throws IOException {
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberLee = new Member(1001,"������");
		Member memberSon = new Member(1002,"�չα�");
		Member memberPark = new Member(1003,"�ڼ���");
		Member memberHong = new Member(1004,"ȫ�浿");
		
		
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);
		
		memberArrayList.showAllMember();
		
		memberArrayList.removeMember(memberHong.getMemberID());//ȫ�� ����
		memberArrayList.showAllMember();					   //��� ��� ���
		
		Member memberKim = new Member(1005,"�̽���Ŵ");
		//int index=System.in.read();
		
		memberArrayList.showAllMember();
		memberArrayList.insertMember(memberKim, 5);
		
	}
}
